package sample.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PlatnosciDAO {

    public static ObservableList<Platnosci> searchPlatnosci() throws SQLException, ClassNotFoundException {
        String selectStmt = "SELECT * FROM platnosci";

        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsPayment = DBUtil.dbExecuteQuery(selectStmt);
            //Send ResultSet to the getPlatnosciList method and get employee object
            ObservableList<Platnosci> paymentList = getPaymentList(rsPayment);

            //Return employee object
            return paymentList;
        } catch (SQLException e) {
            System.out.println("SQL select operation has been failed: " + e);
            //Return exception
            throw e;
        }
    }

    private static ObservableList<Platnosci> getPaymentList(ResultSet rs) throws SQLException, ClassNotFoundException {
        //Declare a observable List which comprises of Client objects
        ObservableList<Platnosci> paymentList = FXCollections.observableArrayList();

        while (rs.next()) {
            Platnosci payment = new Platnosci();
            payment.setId_patnosci(rs.getInt("id_platnosci"));
            payment.setGotowka(rs.getBoolean("gotowka"));
            payment.setPrzelew(rs.getBoolean("przelew"));
            payment.setKwota(rs.getInt("kwota"));
            //Add clients to the ObservableList
            paymentList.add(payment);
        }
        //return empList (ObservableList of Clients)
        return paymentList;
    }

    public static void deletePaymentWithId(String paymentId) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt = "DELETE FROM platnosci\n" +
                "   WHERE id_platnosci ="+ paymentId +";\n";

        //Execute UPDATE operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Wystąpił błąd podczas operacji DELETE: " + e);
            throw e;
        }
    }

    public static void insertPayment(String id_platnosci, String gotowka, String przelew, String kwota) throws SQLException, ClassNotFoundException {
        //Declare a INSERT statement
        String updateStmt =
                "INSERT INTO platnosci " +
                        "(id_platnosci, gotowka, przelew, kwota) " +
                        "VALUES " +
                        "('" + id_platnosci + "','" + gotowka + "','" + przelew + "','" + kwota + "');";

        //Execute INSERT operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Wystąpił błąd podczas operacji INSERT: " + e);
            throw e;
        }
    }
}
