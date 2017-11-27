package sample.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class KodTowaruDAO {

    public static ObservableList<KodTowaru> searchKod() throws SQLException, ClassNotFoundException {
        String selectStmt = "SELECT * FROM kod_towaru";

        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsKod = DBUtil.dbExecuteQuery(selectStmt);
            //Send ResultSet to the getKodList method and get employee object
            ObservableList<KodTowaru> codeList = getCodeList(rsKod);

            //Return employee object
            return codeList;
        } catch (SQLException e) {
            System.out.println("SQL select operation has been failed: " + e);
            //Return exception
            throw e;
        }
    }

    private static ObservableList<KodTowaru> getCodeList(ResultSet rs) throws SQLException, ClassNotFoundException {
        //Declare a observable List which comprises of Client objects
        ObservableList<KodTowaru> codeList = FXCollections.observableArrayList();

        while (rs.next()) {
            KodTowaru code = new KodTowaru();
            code.setId_kod(rs.getInt("id_kod"));
            code.setMagazyn(rs.getString("magazyn"));
            code.setHala(rs.getString("hala"));
            code.setPoziom(rs.getString("poziom"));
            code.setRegal(rs.getString("regal"));
            code.setPolka(rs.getString("polka"));

            //Add clients to the ObservableList
            codeList.add(code);
        }
        //return codeList (ObservableList of Clients)
        return codeList;
    }

    public static void deleteCodeWithId(String codeId) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt = "DELETE FROM kod_towaru\n" +
                "   WHERE id_kod ="+ codeId +";\n";

        //Execute UPDATE operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Wystąpił błąd podczas operacji DELETE: " + e);
            throw e;
        }
    }

    public static void insertCode(String id_kod, String magazyn, String hala, String poziom, String regal, String polka) throws SQLException, ClassNotFoundException {
        //Declare a INSERT statement
        String updateStmt =
                "INSERT INTO kod_towaru " +
                        "(id_kod, magazyn, hala, poziom, regal, polka) " +
                        "VALUES " +
                        "('" + id_kod + "','" + magazyn + "','" + hala + "','" + poziom + "','" + regal + "','" + polka + "');";

        //Execute INSERT operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Wystąpił błąd podczas operacji INSERT: " + e);
            throw e;
        }
    }
}
