package sample.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.util.DBUtil;

import java.sql.Date;
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

    //*************************************
    //DELETE an employee
    //*************************************
    public static void deleteEmpWithId (String empId) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt =
                        "   DELETE FROM pracownicy\n" +
                        "         WHERE id_pracownicy ="+ empId +";\n" +
                        "   COMMIT;";

        //Execute UPDATE operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Wystąpił błąd podczas operacji DELETE: " + e);
            throw e;
        }
    }

    public static void insertEmp(String id_pracownik, String imie, String nazwisko, String data_ur, String miasto, String adres, String telefon, String data_zatr, String data_zwol, String mail, String premia, String pensja, String id_stanowiska) throws SQLException, ClassNotFoundException {
        //Declare a INSERT statement
        String updateStmt =
                        "INSERT INTO pracownicy " +
                        "(id_pracownicy, imie, nazwisko, data_ur, miasto, adres, telefon, data_zatr, data_zwol, mail, premia, pensja, id_stanowiska) " +
                        "VALUES " +
                        "('" + id_pracownik + "','" + imie + "','" + nazwisko + "','" + data_ur + "','" + miasto + "','" + adres + "','" + telefon + "','" + data_zatr + "','" + data_zwol + "','" + mail + "','" + premia + "','" + pensja + "','" + id_stanowiska + "');";

        //Execute INSERT operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Wystąpił błąd podczas operacji INSERT: " + e);
            throw e;
        }
    }

    //*************************************
    //UPDATE an employee's email address
    //*************************************
    public static void updateEmp(String empId, String empNewValueField, int flag) throws SQLException, ClassNotFoundException {
        //Declare a UPDATE statement
        try {
        switch (flag) {
            case 0: {
                String updateStmt =
                                "   UPDATE pracownicy\n" +
                                "      SET imie = '" + empNewValueField + "'\n" +
                                "    WHERE id_pracownicy = " + empId + ";\n" +
                                "   COMMIT;\n";
                DBUtil.dbExecuteUpdate(updateStmt);
                break;
            }
            case 1: {
                String updateStmt =
                        "   UPDATE pracownicy\n" +
                                "      SET nazwisko = '" + empNewValueField + "'\n" +
                                "    WHERE id_pracownicy  = " + empId + ";\n" +
                                "   COMMIT;\n";
                DBUtil.dbExecuteUpdate(updateStmt);
                break;
            }
            case 2: {
                String updateStmt =
                        "   UPDATE pracownicy\n" +
                                "      SET data_ur = '" + empNewValueField + "'\n" +
                                "    WHERE id_pracownicy  = " + empId + ";\n" +
                                "   COMMIT;\n";
                DBUtil.dbExecuteUpdate(updateStmt);
                break;
            }
            case 3: {
                String updateStmt =
                        "   UPDATE pracownicy\n" +
                                "      SET miasto = '" + empNewValueField + "'\n" +
                                "    WHERE id_pracownicy  = " + empId + ";\n" +
                                "   COMMIT;\n";
                DBUtil.dbExecuteUpdate(updateStmt);
                break;
            }
            case 4: {
                String updateStmt =
                        "   UPDATE pracownicy\n" +
                                "      SET adres = '" + empNewValueField + "'\n" +
                                "    WHERE id_pracownicy  = " + empId + ";\n" +
                                "   COMMIT;\n";
                DBUtil.dbExecuteUpdate(updateStmt);
                break;
            }
            case 5: {
                String updateStmt =
                        "   UPDATE pracownicy\n" +
                                "      SET telefon = '" + empNewValueField + "'\n" +
                                "    WHERE id_pracownicy  = " + empId + ";\n" +
                                "   COMMIT;\n";
                DBUtil.dbExecuteUpdate(updateStmt);
                break;
            }
            case 6: {
                String updateStmt =
                        "   UPDATE pracownicy\n" +
                                "      SET data_zatr = '" + empNewValueField + "'\n" +
                                "    WHERE id_pracownicy  = " + empId + ";\n" +
                                "   COMMIT;\n";
                DBUtil.dbExecuteUpdate(updateStmt);
                break;
            }
            case 7: {
                String updateStmt =
                        "   UPDATE pracownicy\n" +
                                "      SET data_zwol = '" + empNewValueField + "'\n" +
                                "    WHERE id_pracownicy  = " + empId + ";\n" +
                                "   COMMIT;\n";
                DBUtil.dbExecuteUpdate(updateStmt);
                break;
            }
            case 8: {
                String updateStmt =
                        "   UPDATE pracownicy\n" +
                                "      SET mail = '" + empNewValueField + "'\n" +
                                "    WHERE id_pracownicy  = " + empId + ";\n" +
                                "   COMMIT;\n";
                DBUtil.dbExecuteUpdate(updateStmt);
                break;
            }
            case 9: {
                String updateStmt =
                        "   UPDATE pracownicy\n" +
                                "      SET premia = '" + empNewValueField + "'\n" +
                                "    WHERE id_pracownicy  = " + empId + ";\n" +
                                "   COMMIT;\n";
                DBUtil.dbExecuteUpdate(updateStmt);
                break;
            }
            case 10: {
                String updateStmt =
                        "   UPDATE pracownicy\n" +
                                "      SET pensja = '" + empNewValueField + "'\n" +
                                "    WHERE id_pracownicy  = " + empId + ";\n" +
                                "   COMMIT;\n";
                DBUtil.dbExecuteUpdate(updateStmt);
                break;
            }
            case 11: {
                String updateStmt =
                        "   UPDATE pracownicy\n" +
                                "      SET id_stanowiska = '" + empNewValueField + "'\n" +
                                "    WHERE id_pracownicy  = " + empId + ";\n" +
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
