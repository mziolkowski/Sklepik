package sample.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class KlientDAO {

    public static ObservableList<Klient> searchKlient() throws SQLException, ClassNotFoundException {
        String selectStmt = "SELECT * FROM klient";

        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsKlienci = DBUtil.dbExecuteQuery(selectStmt);
            //Send ResultSet to the getClientList method and get employee object
            ObservableList<Klient> cliList = getClientList(rsKlienci);

            //Return employee object
            return cliList;
        } catch (SQLException e) {
            System.out.println("SQL select operation has been failed: " + e);
            //Return exception
            throw e;
        }
    }

    private static ObservableList<Klient> getClientList(ResultSet rs) throws SQLException, ClassNotFoundException {
        //Declare a observable List which comprises of Client objects
        ObservableList<Klient> cliList = FXCollections.observableArrayList();

        while (rs.next()) {
            Klient klient = new Klient();
            klient.setId_klient(rs.getInt("id_klient"));
            klient.setFirma(rs.getString("firma"));
            klient.setImie(rs.getString("imie"));
            klient.setNazwisko(rs.getString("nazwisko"));
            klient.setAdres(rs.getString("adres"));
            klient.setKod_pocztowy(rs.getString("kod_pocztowy"));
            klient.setMiejscowosc(rs.getString("miejscowosc"));
            klient.setTelefon(rs.getString("telefon"));
            klient.setMail(rs.getString("mail"));
            klient.setStaly_klient(rs.getBoolean("staly_klient"));

            //Add clients to the ObservableList
            cliList.add(klient);
        }
        //return empList (ObservableList of Clients)
        return cliList;
    }
}
