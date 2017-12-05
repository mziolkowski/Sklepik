package sample.model;
/**
 * Create by: maciejziolkowski on 05 gru 2017
 */

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StanowiskaDAO {

    //*************************************
    //VIEW an Stanowiska
    //*************************************
    public static ObservableList<Stanowiska> searchPosition() throws SQLException, ClassNotFoundException {
        String selectStmt = "SELECT * FROM stanowiska";

        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsPosition = DBUtil.dbExecuteQuery(selectStmt);
            //Send ResultSet to the getPositionList method and get position object
            ObservableList<Stanowiska> positionList = getPositionList(rsPosition);

            //Return position object
            return positionList;
        } catch (SQLException e) {
            System.out.println("SQL select operation has been failed: " + e);
            //Return exception
            throw e;
        }
    }

    private static ObservableList<Stanowiska> getPositionList(ResultSet rs) throws SQLException, ClassNotFoundException {
        //Declare a observable List which comprises of Position objects
        ObservableList<Stanowiska> positionList = FXCollections.observableArrayList();

        while (rs.next()) {
            Stanowiska position = new Stanowiska();
            position.setId_stanowiska(rs.getInt("id_stanowiska"));
            position.setNazwa(rs.getString("nazwa"));
            //Add positions to the ObservableList
            positionList.add(position);
        }
        //return positionList (ObservableList of Clients)
        return positionList;
    }

    //*************************************
    //DELETE an Stanowiska
    //*************************************
    public static void deletePositionWithId(String positionId) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt = "DELETE FROM stanowiska\n" +
                "   WHERE id_stanowiska  =" + positionId + ";\n";

        //Execute UPDATE operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Wystąpił błąd podczas operacji DELETE: " + e);
            throw e;
        }
    }

    //*************************************
    //INSERT an Stanowiska
    //*************************************
    public static void insertPosition(String id_stanowiska, String nazwa) throws SQLException, ClassNotFoundException {
        //Declare a INSERT statement
        String updateStmt =
                "INSERT INTO stanowiska " +
                        "(id_stanowiska, nazwa) " +
                        "VALUES " +
                        "('" + id_stanowiska + "','" + nazwa + "');";

        //Execute INSERT operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Wystąpił błąd podczas operacji INSERT: " + e);
            throw e;
        }
    }

    //*************************************
    //UPDATE an Stanowiska
    //*************************************
    public static void updatePosition(String posId, String posNewValueField, int flag) throws SQLException, ClassNotFoundException {
        //Declare a UPDATE statement
        try {
            switch (flag) {
                case 0: {
                    String updateStmt =
                            "   UPDATE stanowiska\n" +
                                    "      SET nazwa = '" + posNewValueField + "'\n" +
                                    "    WHERE id_stanowiska = " + posId + ";\n" +
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
