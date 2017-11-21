package sample.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import sample.model.Pracownicy;
import sample.model.PracownikDAO;

import java.sql.Date;
import java.sql.SQLException;

public class PracownikController {

    @FXML
    private Button nowy;

    @FXML
    private AnchorPane pracownikAnchorPane;

    @FXML
    private Button wyswietl;

    @FXML
    private Button usun;

    @FXML
    private Button uaktualnij;

    @FXML
    private TableView<Pracownicy> tablePracownik;

    @FXML
    private TableColumn<Pracownicy, Integer> id_pracownikColumn;

    @FXML
    private TableColumn<Pracownicy, String> pracImieColumn;

    @FXML
    private TableColumn<Pracownicy, String> pracNazwiskoColumn;

    @FXML
    private TableColumn<Pracownicy, Date> pracData_urColumn;

    @FXML
    private TableColumn<Pracownicy, String> pracMiastoColumn;

    @FXML
    private TableColumn<Pracownicy, String> pracAdresColumn;

    @FXML
    private TableColumn<Pracownicy, String> pracTelefonColumn;

    @FXML
    private TableColumn<Pracownicy, Date> pracData_zatrColumn;

    @FXML
    private TableColumn<Pracownicy, Date> pracData_zwolColumn;

    @FXML
    private TableColumn<Pracownicy, String> pracMailColumn;

    @FXML
    private TableColumn<Pracownicy, Integer> pracPremiaColumn;

    @FXML
    private TableColumn<Pracownicy, Integer> pracPensjaColumn;

    @FXML
    private TableColumn<Pracownicy, Integer> pracId_stanowiskaColumn;


    @FXML
    private void initialize() {
        id_pracownikColumn.setCellValueFactory(cellData -> cellData.getValue().id_pracownicyProperty().asObject());
        pracImieColumn.setCellValueFactory(cellData -> cellData.getValue().imieProperty());
        pracNazwiskoColumn.setCellValueFactory(cellData -> cellData.getValue().nazwiskoProperty());
        pracData_urColumn.setCellValueFactory(cellData -> cellData.getValue().dataUrodzeniaProperty());
        pracMiastoColumn.setCellValueFactory(cellData -> cellData.getValue().miastoProperty());
        pracAdresColumn.setCellValueFactory(cellData -> cellData.getValue().adresProperty());
        pracTelefonColumn.setCellValueFactory(cellData -> cellData.getValue().telefonProperty());
        pracData_zatrColumn.setCellValueFactory(cellData -> cellData.getValue().dataZatrudnieniaProperty());
        pracData_zwolColumn.setCellValueFactory(cellData -> cellData.getValue().dataZwolnieniaProperty());
        pracMailColumn.setCellValueFactory(cellData -> cellData.getValue().mailProperty());
        pracPremiaColumn.setCellValueFactory(cellData -> cellData.getValue().premiaProperty().asObject());
        pracPensjaColumn.setCellValueFactory(cellData -> cellData.getValue().pensjaProperty().asObject());
        pracId_stanowiskaColumn.setCellValueFactory(cellData -> cellData.getValue().id_stanowiskaProperty().asObject());


    }

    @FXML
    void ViewPracownicy(ActionEvent event) throws SQLException {
        try {
            //Get all Employees information
            ObservableList<Pracownicy> pracData = PracownikDAO.searchPracownicy();
            //Populate Employees on TableView
            populateEmployees(pracData);

        } catch (SQLException e){
            System.out.println("Error occurred while getting employees information from DB.\n" + e);
            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //Populate Employees for TableView
    @FXML
    private void populateEmployees (ObservableList<Pracownicy> empData) throws ClassNotFoundException {
        //Set items to the employeeTable
        tablePracownik.setItems(empData);
    }

//    @FXML
//    private void populateEmployees(Pracownicy prac) throws ClassNotFoundException {
//        //Declare and ObservableList for table view
//        ObservableList<Pracownicy> empData = FXCollections.observableArrayList();
//        //Add employee to the ObservableList
//        empData.add(prac);
//        //Set items to the employeeTable
//        tablePracownik.setItems(empData);
//    }

    @FXML
    private void populateAndShowEmployee(Pracownicy prac) throws ClassNotFoundException {
        if (prac != null) {
            populateEmployees((ObservableList<Pracownicy>) prac);
//            setEmpInfoToTextArea(emp);
        } else {
//            resultArea.setText("This employee does not exist!\n");
        }
    }
}

