package sample.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PracownikDAO {

    public static ObservableList<Pracownicy> searchPracownicy() throws SQLException, ClassNotFoundException {
        String selectStmt = "SELECT * FROM pracownicy";

        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsPracownicy = DBUtil.dbExecuteQuery(selectStmt);
            //Send ResultSet to the getEmployeeList method and get employee object
            ObservableList<Pracownicy> empList = getEmployeeList(rsPracownicy);

            //Return employee object
            return empList;
        } catch (SQLException e) {
            System.out.println("SQL select operation has been failed: " + e);
            //Return exception
            throw e;
        }
    }

    private static ObservableList<Pracownicy> getEmployeeList(ResultSet rs) throws SQLException, ClassNotFoundException {
        //Declare a observable List which comprises of Employee objects
        ObservableList<Pracownicy> empList = FXCollections.observableArrayList();

        while (rs.next()) {
            Pracownicy prac = new Pracownicy();
            prac.setId_pracownicy(rs.getInt("id_pracownicy"));
            prac.setImie(rs.getString("imie"));
            prac.setNazwisko(rs.getString("nazwisko"));
            prac.setDataUrodzenia(rs.getDate("data_ur"));
            prac.setMiasto(rs.getString("miasto"));
            prac.setAdres(rs.getString("adres"));
            prac.setTelefon(rs.getString("telefon"));
            prac.setDataZatrudnienia(rs.getDate("data_zatr"));
            prac.setDataZwolnienia(rs.getDate("data_zwol"));
            prac.setMail(rs.getString("mail"));
            prac.setPremia(rs.getInt("premia"));
            prac.setPensja(rs.getInt("pensja"));
            prac.setId_stanowiska(rs.getInt("id_stanowiska"));

            //Add employee to the ObservableList
            empList.add(prac);
        }
        //return empList (ObservableList of Employees)
        return empList;
    }
}
