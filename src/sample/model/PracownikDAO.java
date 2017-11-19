package sample.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.util.DBUtil;
import sample.model.Pracownicy;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PracownikDAO {

    public static ObservableList<Pracownicy> searchPracownicy() throws SQLException, ClassNotFoundException {
        String selectStmt = "SELECT * FROM Pracownicy";

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
            prac.setId_pracownicy(rs.getInt("ID_Pracownik"));
            prac.setImie(rs.getString("Imie"));
            prac.setNazwisko(rs.getString("Nazwisko"));
            prac.setDataUrodzenia(rs.getDate("Data_urodzenia"));
            prac.setMiasto(rs.getString("Miasto"));
            prac.setAdres(rs.getString("Adres"));
            prac.setTelefon(rs.getString("Telefon"));
            prac.setDataZatrudnienia(rs.getDate("Data_zatrudnienia"));
            prac.setDataZwolnienia(rs.getDate("Data_zwolnienia"));
            prac.setEmail(rs.getString("Email"));
            prac.setPremia(rs.getInt("Premia"));
            prac.setPensja(rs.getInt("Pensja"));
            prac.setId_stanowiska(rs.getInt("ID_Stanowisko"));

            //Add employee to the ObservableList
            empList.add(prac);
        }
        //return empList (ObservableList of Employees)
        return empList;
    }
}
