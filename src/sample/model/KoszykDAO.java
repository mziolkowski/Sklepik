package sample.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class KoszykDAO {
    public static ObservableList<Koszyk> searchBasket() throws SQLException, ClassNotFoundException {
        String selectStmt = "SELECT * FROM koszyk";

        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsBasket = DBUtil.dbExecuteQuery(selectStmt);
            //Send ResultSet to the getBasketList method and get employee object
            ObservableList<Koszyk> basketList = getBasketList(rsBasket);

            //Return employee object
            return basketList;
        } catch (SQLException e) {
            System.out.println("SQL select operation has been failed: " + e);
            //Return exception
            throw e;
        }
    }

    private static ObservableList<Koszyk> getBasketList(ResultSet rs) throws SQLException, ClassNotFoundException {
        //Declare a observable List which comprises of Client objects
        ObservableList<Koszyk> basketList = FXCollections.observableArrayList();

        while (rs.next()) {
            Koszyk basket = new Koszyk();
            basket.setId_koszyk(rs.getInt("id_koszyk"));
            basket.setId_towar(rs.getInt("id_towar"));
            basket.setIlosc(rs.getInt("ilosc"));
            basket.setCena(rs.getInt("cena"));
            //Add clients to the ObservableList
            basketList.add(basket);
        }
        //return empList (ObservableList of Clients)
        return basketList;
    }

    public static void deleteBasketWithId(String basketId) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt = "DELETE FROM koszyk\n" +
                "   WHERE id_koszyk ="+ basketId +";\n";

        //Execute UPDATE operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Wystąpił błąd podczas operacji DELETE: " + e);
            throw e;
        }
    }

    public static void insertBasket(String id_koszyk, String id_towar, String ilosc, String cena) throws SQLException, ClassNotFoundException {
        //Declare a INSERT statement
        String updateStmt =
                "INSERT INTO koszyk " +
                        "(id_koszyk, id_towar, ilosc, cena) " +
                        "VALUES " +
                        "('" + id_koszyk + "','" + id_towar + "','" + ilosc + "','" + cena + "');";

        //Execute INSERT operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Wystąpił błąd podczas operacji INSERT: " + e);
            throw e;
        }
    }

    //*************************************
    //UPDATE an Koszyk
    //*************************************
    public static void updateBasket(String basketId, String basketNewValueField, int flag) throws SQLException, ClassNotFoundException {
        //Declare a UPDATE statement
        try {
            switch (flag) {
                case 0: {
                    String updateStmt =
                            "   UPDATE koszyk\n" +
                                    "      SET id_towar = '" + basketNewValueField + "'\n" +
                                    "    WHERE id_koszyk = " + basketId + ";\n" +
                                    "   COMMIT;\n";
                    DBUtil.dbExecuteUpdate(updateStmt);
                    break;
                }
                case 1: {
                    String updateStmt =
                            "   UPDATE koszyk\n" +
                                    "      SET ilosc = '" + basketNewValueField + "'\n" +
                                    "    WHERE id_koszyk  = " + basketId + ";\n" +
                                    "   COMMIT;\n";
                    DBUtil.dbExecuteUpdate(updateStmt);
                    break;
                }
                case 2: {
                    String updateStmt =
                            "   UPDATE koszyk\n" +
                                    "      SET cena = '" + basketNewValueField + "'\n" +
                                    "    WHERE id_koszyk  = " + basketId + ";\n" +
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
