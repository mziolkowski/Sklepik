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

public class TransportDAO {
    public static ObservableList<Transport> searchTransport() throws SQLException, ClassNotFoundException {
        String selectStmt = "SELECT * FROM transport";

        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsTransport = DBUtil.dbExecuteQuery(selectStmt);
            //Send ResultSet to the getBasketList method and get employee object
            ObservableList<Transport> transportList = getTransportList(rsTransport);

            //Return employee object
            return transportList;
        } catch (SQLException e) {
            System.out.println("SQL select operation has been failed: " + e);
            //Return exception
            throw e;
        }
    }

    private static ObservableList<Transport> getTransportList(ResultSet rs) throws SQLException, ClassNotFoundException {
        //Declare a observable List which comprises of Client objects
        ObservableList<Transport> transportList = FXCollections.observableArrayList();

        while (rs.next()) {
            Transport trans = new Transport();
            trans.setId_transport(rs.getInt("id_transport"));
            trans.setNazwa(rs.getString("nazwa"));
            trans.setRodzaj(rs.getString("rodzaj"));
            //Add clients to the ObservableList
            transportList.add(trans);
        }
        //return empList (ObservableList of Clients)
        return transportList;
    }
}
