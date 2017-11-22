package sample.model;

import com.sun.tools.javac.file.ZipArchive;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ZamowieniaDAO {
    public static ObservableList<Zamowienia> searchOrders() throws SQLException, ClassNotFoundException {
        String selectStmt = "SELECT * FROM zamowienia";

        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsOrder = DBUtil.dbExecuteQuery(selectStmt);
            //Send ResultSet to the getOrderList method and get employee object
            ObservableList<Zamowienia> ordList = getOrderList(rsOrder);

            //Return employee object
            return ordList;
        } catch (SQLException e) {
            System.out.println("SQL select operation has been failed: " + e);
            //Return exception
            throw e;
        }
    }

    private static ObservableList<Zamowienia> getOrderList(ResultSet rs) throws SQLException, ClassNotFoundException {
        //Declare a observable List which comprises of Employee objects
        ObservableList<Zamowienia> ordList = FXCollections.observableArrayList();

        while (rs.next()) {
           Zamowienia ord = new Zamowienia();
           ord.setId_zamowienia(rs.getInt("id_zamowienia"));
           ord.setId_koszyk(rs.getInt("id_koszyk"));
           ord.setId_klient(rs.getInt("id_klienta"));
           ord.setDataZamowienia(rs.getDate("data_zamowienia"));
           ord.setId_platnosc(rs.getInt("id_platnosc"));
           ord.setZaplacone(rs.getBoolean("zaplacone"));
           ord.setFaktura(rs.getBoolean("faktura"));
           ord.setStatus_zamowienia(rs.getString("status_zamowienia"));
           ord.setId_transport(rs.getInt("id_transport"));
           ord.setCzas_dostawy(rs.getString("czas_dostawy"));
            //Add employee to the ObservableList
            ordList.add(ord);
        }
        //return empList (ObservableList of Employees)
        return ordList;
    }
}
