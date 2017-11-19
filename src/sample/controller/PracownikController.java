package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import sample.model.Pracownicy;
import sample.model.PracownikDAO;

import java.sql.SQLException;

public class PracownikController {

    @FXML
    private TableView tabblePracownik;
    @FXML
    private TableColumn<Pracownicy, Integer> pracIdColumn;
    @FXML
    private TableColumn<Pracownicy, String> pracImie;


    @FXML
    private void initialize() {
//    pracIdColumn.setCellFactory(cellData -> cellData.getVa;
        pracImie.setCellValueFactory(cellData -> cellData.getValue().imieProperty());
    }

//    @FXML
//    private void searchEmployee (ActionEvent actionEvent) throws ClassNotFoundException, SQLException {
//        try {
//            //Get Employee information
//            Pracownicy prac = PracownikDAO.searchEmployee(empIdText.getText());
//            //Populate Employee on TableView and Display on TextArea
//            populateAndShowEmployee(prac);
//        } catch (SQLException e) {
//            e.printStackTrace();
//            resultArea.setText("Error occurred while getting employee information from DB.\n" + e);
//            throw e;
//        }
//    }

    @FXML
    private void populateEmployee(Pracownicy prac) throws ClassNotFoundException {
        //Declare and ObservableList for table view
        ObservableList<Pracownicy> empData = FXCollections.observableArrayList();
        //Add employee to the ObservableList
        empData.add(prac);
        //Set items to the employeeTable
        tabblePracownik.setItems(empData);
    }

    @FXML
    private void populateAndShowEmployee(Pracownicy prac) throws ClassNotFoundException {
        if (prac != null) {
            populateEmployee(prac);
//            setEmpInfoToTextArea(emp);
        } else {
//            resultArea.setText("This employee does not exist!\n");
        }
    }
}

