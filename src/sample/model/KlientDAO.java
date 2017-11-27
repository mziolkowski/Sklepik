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

    //*************************************
    //DELETE an client
    //*************************************
    public static void deleteClientWithId(String cliId) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt = "DELETE FROM klient\n" +
                        "   WHERE id_klient ="+ cliId +";\n";

        //Execute UPDATE operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Wystąpił błąd podczas operacji DELETE: " + e);
            throw e;
        }
    }

    public static void insertCli(String id_klient, String firma, String imie, String nazwisko, String adres, String kod_pocztowy, String miejscowosc, String telefon, String mail, String staly_klient) throws SQLException, ClassNotFoundException {
        //Declare a INSERT statement
        String updateStmt =
                "INSERT INTO klient " +
                        "(id_klient, firma, imie, nazwisko, adres, kod_pocztowy, miejscowosc, telefon, mail, staly_klient) " +
                        "VALUES " +
                        "('" + id_klient + "','" + firma + "','" + imie + "','" + nazwisko + "','" + adres + "','" + kod_pocztowy + "','" + miejscowosc + "','" + telefon + "','" + mail + "','" + staly_klient + "');";

        //Execute INSERT operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Wystąpił błąd podczas operacji INSERT: " + e);
            throw e;
        }
    }
}
