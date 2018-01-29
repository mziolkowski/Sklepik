package sample.model;
/**
 * Create by: maciejziolkowski on 05 gru 2017
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TowaryDAO {
    public static ObservableList<Towary> searchItems() throws SQLException, ClassNotFoundException {
        String selectStmt = "SELECT * FROM towary";

        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsItem = DBUtil.dbExecuteQuery(selectStmt);
            //Send ResultSet to the getItamList method and get item object
            ObservableList<Towary> itemList = getItamList(rsItem);

            //Return employee object
            return itemList;
        } catch (SQLException e) {
            System.out.println("SQL select operation has been failed: " + e);
            //Return exception
            throw e;
        }
    }

    private static ObservableList<Towary> getItamList(ResultSet rs) throws SQLException, ClassNotFoundException {
        //Declare a observable List which comprises of Item objects
        ObservableList<Towary> itemList = FXCollections.observableArrayList();

        while (rs.next()) {
            Towary item = new Towary();
            item.setId_towar(rs.getInt("id_towar"));
            item.setTyp(rs.getString("typ"));
            item.setMarka(rs.getString("marka"));
            item.setModel(rs.getString("model"));
            item.setId_kod(rs.getInt("id_kod"));
            item.setStatus_towaru(rs.getString("status_towaru"));
            item.setOpis(rs.getString("opis"));
            item.setIlosc(rs.getInt("ilosc"));
            item.setCena(rs.getInt("cena"));
            //Add items to the ObservableList
            itemList.add(item);
        }
        //return itemList (ObservableList of items)
        return itemList;
    }

    //*************************************
    //DELETE an Towary
    //*************************************
    public static void deleteItemWithId(String itemId) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt =
                "   DELETE FROM towary\n" +
                        "         WHERE id_towar= " + itemId + ";\n" +
                        "   COMMIT;";

        //Execute UPDATE operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Wystąpił błąd podczas operacji DELETE: " + e);
            throw e;
        }
    }

    //*************************************
    //INSERT an Towary
    //*************************************
    public static void insertItem(String id_towar, String typ, String marka, String model, String id_kod, String status_towaru, String opis, String ilosc, String cena) throws SQLException, ClassNotFoundException {
        //Declare a INSERT statement
        String updateStmt =
                "INSERT INTO towary " +
                        "(id_towar, typ, marka, model, id_kod, status_towaru, opis, ilosc, cena) " +
                        "VALUES " +
                        "('" + id_towar + "','" + typ + "','" + marka + "','" + model + "','" + id_kod + "','" + status_towaru + "','" + opis + "','" + ilosc + "','" + cena + "');";

        //Execute INSERT operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Wystąpił błąd podczas operacji INSERT: " + e);
            throw e;
        }
    }

    //*************************************
    //UPDATE an Towary
    //*************************************
    public static void updateItem(String itemId, String empNewValueField, int flag) throws SQLException, ClassNotFoundException {
        //Declare a UPDATE statement
        try {
            switch (flag) {
                case 0: {
                    String updateStmt =
                            "   UPDATE towary\n" +
                                    "      SET typ = '" + empNewValueField + "'\n" +
                                    "    WHERE id_towar = " + itemId + ";\n" +
                                    "   COMMIT;\n";
                    DBUtil.dbExecuteUpdate(updateStmt);
                }
                break;

                case 1: {
                    String updateStmt =
                            "   UPDATE towary\n" +
                                    "      SET marka = '" + empNewValueField + "'\n" +
                                    "    WHERE id_towar = " + itemId + ";\n" +
                                    "   COMMIT;\n";
                    DBUtil.dbExecuteUpdate(updateStmt);
                }
                break;

                case 2: {
                    String updateStmt =
                            "   UPDATE towary\n" +
                                    "      SET model = '" + empNewValueField + "'\n" +
                                    "    WHERE id_towar = " + itemId + ";\n" +
                                    "   COMMIT;\n";
                    DBUtil.dbExecuteUpdate(updateStmt);
                }
                break;

                case 3: {
                    String updateStmt =
                            "   UPDATE towary\n" +
                                    "      SET id_kod = '" + empNewValueField + "'\n" +
                                    "    WHERE id_towar = " + itemId + ";\n" +
                                    "   COMMIT;\n";
                    DBUtil.dbExecuteUpdate(updateStmt);
                }
                break;

                case 4: {
                    String updateStmt =
                            "   UPDATE towary\n" +
                                    "      SET status_towaru = '" + empNewValueField + "'\n" +
                                    "    WHERE id_towar = " + itemId + ";\n" +
                                    "   COMMIT;\n";
                    DBUtil.dbExecuteUpdate(updateStmt);
                }
                break;

                case 5: {
                    String updateStmt =
                            "   UPDATE towary\n" +
                                    "      SET opis = '" + empNewValueField + "'\n" +
                                    "    WHERE id_towar = " + itemId + ";\n" +
                                    "   COMMIT;\n";
                    DBUtil.dbExecuteUpdate(updateStmt);
                }
                break;

                case 6: {
                    String updateStmt =
                            "   UPDATE towary\n" +
                                    "      SET ilosc = '" + empNewValueField + "'\n" +
                                    "    WHERE id_towar = " + itemId + ";\n" +
                                    "   COMMIT;\n";
                    DBUtil.dbExecuteUpdate(updateStmt);
                }
                break;

                case 7: {
                    String updateStmt =
                            "   UPDATE towary\n" +
                                    "      SET cena = '" + empNewValueField + "'\n" +
                                    "    WHERE id_towar = " + itemId + ";\n" +
                                    "   COMMIT;\n";
                    DBUtil.dbExecuteUpdate(updateStmt);
                }
                break;

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
