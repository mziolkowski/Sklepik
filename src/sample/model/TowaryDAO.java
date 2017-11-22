package sample.model;

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
            //Send ResultSet to the getItamList method and get employee object
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
        //return itemList (ObservableList of Clients)
        return itemList;
    }
}
