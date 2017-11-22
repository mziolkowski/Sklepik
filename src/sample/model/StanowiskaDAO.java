package sample.model;

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
    public static ObservableList<Stanowiska> searchPosition() throws SQLException, ClassNotFoundException {
        String selectStmt = "SELECT * FROM stanowiska";

        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsPosition = DBUtil.dbExecuteQuery(selectStmt);
            //Send ResultSet to the getPositionList method and get employee object
            ObservableList<Stanowiska> positionList = getPositionList(rsPosition);

            //Return employee object
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
        //return empList (ObservableList of Clients)
        return positionList;
    }
}
