package sample.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import sample.model.*;

import java.sql.Date;
import java.sql.SQLException;

public class Controller {

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

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //    KLIENT
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    private Tab KlienciTab;

    @FXML
    private AnchorPane klientAnchorPane;

    @FXML
    private AnchorPane KlientAnchorPane2;

    @FXML
    private Button nowy1;

    @FXML
    private TableView<Klient> tableKlienci;

    @FXML
    private TableColumn<Klient, Integer> id_klientColumn;

    @FXML
    private TableColumn<Klient, String> klientFirmaColumn;

    @FXML
    private TableColumn<Klient, String> klientImieColumn;

    @FXML
    private TableColumn<Klient, String> klientNazwiskoColumn;

    @FXML
    private TableColumn<Klient, String> klientAdresColumn;

    @FXML
    private TableColumn<Klient, String> klientKod_pocztowyColumn;

    @FXML
    private TableColumn<Klient, String> klientMiejscowoscColumn;

    @FXML
    private TableColumn<Klient, String> klientTelefonColumn;

    @FXML
    private TableColumn<Klient, String> klientMailColumn;

    @FXML
    private TableColumn<Klient, Boolean> klientStaly_klientColumn;

    @FXML
    private Button wyswietlKlient;

    @FXML
    private Button usun1;

    @FXML
    private Button uaktualnij1;

    @FXML
    private Tab kod_towaruTab;

    @FXML
    private AnchorPane kod_towaruAnchorPane2;

    @FXML
    private Button nowy11;

    @FXML
    private TableView<KodTowaru> tableKod_towaru;

    @FXML
    private TableColumn<KodTowaru, Integer> id_kodColumn;

    @FXML
    private TableColumn<KodTowaru, String> kod_towaruMagazynColumn;

    @FXML
    private TableColumn<KodTowaru, String> kod_towaruHalaColumn;

    @FXML
    private TableColumn<KodTowaru, String> kod_towaruPoziomColumn;

    @FXML
    private TableColumn<KodTowaru, String> kod_towaruRegalColumn;

    @FXML
    private TableColumn<KodTowaru, String> kod_towaruPolkaColumn;

    @FXML
    private Button wyswietlKod_towaru;

    @FXML
    private Button usun11;

    @FXML
    private Button uaktualnij11;


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

        id_klientColumn.setCellValueFactory(cellData -> cellData.getValue().id_klientProperty().asObject());
        klientFirmaColumn.setCellValueFactory(cellData -> cellData.getValue().firmaProperty());
        klientImieColumn.setCellValueFactory(cellData -> cellData.getValue().imieProperty());
        klientNazwiskoColumn.setCellValueFactory(cellData ->cellData.getValue().nazwiskoProperty());
        klientAdresColumn.setCellValueFactory(cellData -> cellData.getValue().adresProperty());
        klientKod_pocztowyColumn.setCellValueFactory(cellData -> cellData.getValue().kod_pocztowyProperty());
        klientMiejscowoscColumn.setCellValueFactory(cellData -> cellData.getValue().miejscowoscProperty());
        klientTelefonColumn.setCellValueFactory(cellData -> cellData.getValue().telefonProperty());
        klientMailColumn.setCellValueFactory(cellData -> cellData.getValue().mailProperty());
        klientStaly_klientColumn.setCellValueFactory(cellData -> cellData.getValue().staly_klientProperty());

        id_kodColumn.setCellValueFactory(cellData -> cellData.getValue().id_kodProperty().asObject());
        kod_towaruMagazynColumn.setCellValueFactory(cellData -> cellData.getValue().magazynProperty());
        kod_towaruHalaColumn.setCellValueFactory(cellData -> cellData.getValue().halaProperty());
        kod_towaruPoziomColumn.setCellValueFactory(cellData -> cellData.getValue().poziomProperty());
        kod_towaruRegalColumn.setCellValueFactory(cellData -> cellData.getValue().regalProperty());
        kod_towaruPolkaColumn.setCellValueFactory(cellData -> cellData.getValue().polkaProperty());




    }


    @FXML
    void ViewKod_towaru(ActionEvent event) throws SQLException {
        try {
            //Get all Codes information
            ObservableList<KodTowaru> codeData = KodTowaruDAO.searchKod();
            //Populate Codes on TableView
            populateCodes(codeData);

        } catch (SQLException e){
            System.out.println("Error occurred while getting employees information from DB.\n" + e);
            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //Populate CodesItems for TableView
    @FXML
    private void populateCodes (ObservableList<KodTowaru> codeData) throws ClassNotFoundException {
        //Set items to the tableKlienci
        tableKod_towaru.setItems(codeData);
    }

    @FXML
    void ViewKlienci(ActionEvent event) throws SQLException {
        try {
            //Get all Clients information
            ObservableList<Klient> cliData = KlientDAO.searchKlient();
            //Populate Clients on TableView
            populateClients(cliData);

        } catch (SQLException e){
            System.out.println("Error occurred while getting employees information from DB.\n" + e);
            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //Populate Clients for TableView
    @FXML
    private void populateClients (ObservableList<Klient> cliData) throws ClassNotFoundException {
        //Set items to the tableKlienci
        tableKlienci.setItems(cliData);
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

