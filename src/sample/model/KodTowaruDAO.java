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
        //return empList (ObservableList of Clients)
        return codeList;
    }
}
