package sample.model;
/**
 * Create by: maciejziolkowski on 05 gru 2017
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class KodTowaruDAO {

    //*************************************
    //VIEW an Kod_towaru
    //*************************************
    public static ObservableList<KodTowaru> searchKod() throws SQLException, ClassNotFoundException {
        String selectStmt = "SELECT * FROM kod_towaru";

        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsKod = DBUtil.dbExecuteQuery(selectStmt);
            //Send ResultSet to the getKodList method and get code object
            ObservableList<KodTowaru> codeList = getCodeList(rsKod);

            //Return code object
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
        //return codeList (ObservableList of Codes)
        return codeList;
    }

    //*************************************
    //DELETE an Kod_towaru
    //*************************************
    public static void deleteCodeWithId(String codeId) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt = "DELETE FROM kod_towaru\n" +
                "   WHERE id_kod =" + codeId + ";\n";

        //Execute UPDATE operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Wystąpił błąd podczas operacji DELETE: " + e);
            throw e;
        }
    }

    //*************************************
    //INSERT an Kod_towaru
    //*************************************
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

    //*************************************
    //UPDATE an Kod_towaru
    //*************************************
    public static void updateCode(String codeId, String codeNewValueField, int flag) throws SQLException, ClassNotFoundException {
        //Declare a UPDATE statement
        try {
            switch (flag) {
                case 0: {
                    String updateStmt =
                            "   UPDATE kod_towaru\n" +
                                    "      SET magazyn = '" + codeNewValueField + "'\n" +
                                    "    WHERE id_kod = " + codeId + ";\n" +
                                    "   COMMIT;\n";
                    DBUtil.dbExecuteUpdate(updateStmt);
                    break;
                }
                case 1: {
                    String updateStmt =
                            "   UPDATE kod_towaru\n" +
                                    "      SET hala = '" + codeNewValueField + "'\n" +
                                    "    WHERE id_kod  = " + codeId + ";\n" +
                                    "   COMMIT;\n";
                    DBUtil.dbExecuteUpdate(updateStmt);
                    break;
                }
                case 2: {
                    String updateStmt =
                            "   UPDATE kod_towaru\n" +
                                    "      SET poziom = '" + codeNewValueField + "'\n" +
                                    "    WHERE id_kod  = " + codeId + ";\n" +
                                    "   COMMIT;\n";
                    DBUtil.dbExecuteUpdate(updateStmt);
                    break;
                }
                case 3: {
                    String updateStmt =
                            "   UPDATE kod_towaru\n" +
                                    "      SET regal = '" + codeNewValueField + "'\n" +
                                    "    WHERE id_kod  = " + codeId + ";\n" +
                                    "   COMMIT;\n";
                    DBUtil.dbExecuteUpdate(updateStmt);
                    break;
                }
                case 4: {
                    String updateStmt =
                            "   UPDATE kod_towaru\n" +
                                    "      SET polka = '" + codeNewValueField + "'\n" +
                                    "    WHERE id_kod  = " + codeId + ";\n" +
                                    "   COMMIT;\n";
                    DBUtil.dbExecuteUpdate(updateStmt);
                    break;
                }

                default:
                    System.out.println("Nie znaleziono żadnego pasującego przypadku!!!");
            }


        } catch (SQLException e) {
            System.out.print("Error occurred while UPDATE Operation: " + e);
            throw e;
        }
        //Execute UPDATE operation
    }
}
