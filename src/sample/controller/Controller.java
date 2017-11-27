package sample.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import sample.model.*;

import java.sql.Date;
import java.sql.SQLException;

public class Controller {

    @FXML
    private TextField pracownikIdTF;

    @FXML
    private TextField pracownikImieTF;

    @FXML
    private TextField pracownikData_zwolTF;

    @FXML
    private TextField pracownikPremiaTF;

    @FXML
    private TextField pracownikId_stanowiskaTF;

    @FXML
    private TextField pracownikData_urTF;

    @FXML
    private TextField pracownikNazwiskoTF;

    @FXML
    private TextField pracownikData_zatrTF;

    @FXML
    private TextField pracownikMiastoTF;

    @FXML
    private TextField pracownikTelefonTF;

    @FXML
    private TextField pracownikPensjaTF;

    @FXML
    private TextField pracownikMailTF;

    @FXML
    private TextField pracownikAdresTF;

    @FXML
    private Button pracownikNowyBtn;

    @FXML
    private AnchorPane pracownikAnchorPane;

    @FXML
    private Button wyswietl;

    @FXML
    private Button pracownikUsunBtn;

    @FXML
    private Button uaktualnij;

    @FXML
    private TextArea pracownicyResultArea;

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
    private TextField klientIdTF;

    @FXML
    private TextField klientFirmaTF;

    @FXML
    private TextField klientStaly_klTF;

    @FXML
    private TextField klientNazwiskoTF;

    @FXML
    private TextField klientImieTF;

    @FXML
    private TextField klientAdresTF;

    @FXML
    private TextField klientTelefonTF;

    @FXML
    private TextField klientMailTF;

    @FXML
    private TextField klientKod_poczTF;

    @FXML
    private TextField klientMiejscowoscTF;

    @FXML
    private Button klienciNowyBtn;

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
    private Button klienciUsunBtn;

    @FXML
    private Button uaktualnij1;

    @FXML
    private TextArea klientResultArea1;

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //    KOD_TOWARU
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FXML
    private Tab kod_towaruTab;

    @FXML
    private AnchorPane kod_towaruAnchorPane2;

    @FXML
    private Button kod_towaruNowyBtn;

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
    private TextField kod_towaruIdTF;

    @FXML
    private TextField kodMagazynTF;

    @FXML
    private TextField kodPoziomTF;

    @FXML
    private TextField kodHalaTF;

    @FXML
    private TextField kodRegalTF;

    @FXML
    private TextField kodPolkaTF;

    @FXML
    private Button wyswietlKod_towaru;

    @FXML
    private Button kod_towaruUsunBtn;

    @FXML
    private Button uaktualnij11;

    @FXML
    private TextArea kod_towaruResultArea1;


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //    PLATNOSCI
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FXML
    private Tab platnosciTab;

    @FXML
    private AnchorPane platnosciAnchorPane;

    @FXML
    private TextField platnosciIdTF;

    @FXML
    private TextField platnosciGotowkTF;

    @FXML
    private TextField platnosciKwotaTF;

    @FXML
    private TextField platnosciPrzelewTF;

    @FXML
    private Button platnosciNowyBtn;
    @FXML
    private TableView<Platnosci> tablePlatnosci;

    @FXML
    private TableColumn<Platnosci, Integer> id_platnosciColumn;

    @FXML
    private TableColumn<Platnosci, Boolean> platnosciGotowkaColumn;

    @FXML
    private TableColumn<Platnosci, Boolean> platnosciPrzelewColumn;

    @FXML
    private TableColumn<Platnosci, Integer> platnosciKwotaColumn;

    @FXML
    private Button wyswietlPlatnosci;

    @FXML
    private Button platnosciUsunBtn;

    @FXML
    private Button uaktualnij111;

    @FXML
    private TextArea platnosciRsultArea1;

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //    KOSZYK
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FXML
    private Tab koszykTab;

    @FXML
    private AnchorPane koszykAnchorPane;

    @FXML
    private TableView<Koszyk> tableKoszyk;

    @FXML
    private TableColumn<Koszyk, Integer> id_koszykColumn;

    @FXML
    private TableColumn<Koszyk, Integer> koszykId_towarColumn;

    @FXML
    private TableColumn<Koszyk, Integer> koszykIloscColumn;

    @FXML
    private TableColumn<Koszyk, Integer> koszykCenaColumn;

    @FXML
    private TextField koszykId_towarTF;

    @FXML
    private TextField koszykIdTF;

    @FXML
    private TextField koszykCenaTF;

    @FXML
    private TextField koszykIloscTF;

    @FXML
    private Button koszykNowyBtn;

    @FXML
    private Button wyswietlKoszyk;

    @FXML
    private Button koszykUsunBtn;

    @FXML
    private Button uaktualnij1111;

    @FXML
    private TextArea koszykResultArea1;


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //    STANOWISKA
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FXML
    private Tab stanowiskaTab;

    @FXML
    private AnchorPane stanowiskaAnchorPane;

    @FXML
    private TableView<Stanowiska> tableStanowiska;

    @FXML
    private TextField stanowiskaIdTF;

    @FXML
    private TextField stanowiskaNazwaTF;

    @FXML
    private Button stanowiskaNowyBtn;

    @FXML
    private TableColumn<Stanowiska, Integer> id_stanowiskaColumn;

    @FXML
    private TableColumn<Stanowiska, String> stanowiskaNazwaColumn;

    @FXML
    private Button wyswietlStanowiska;

    @FXML
    private Button stanowiskaUsunBtn;

    @FXML
    private Button stanowiskaUaktualnijBtn;

    @FXML
    private TextArea stanowiskaResultArea1;

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //    TOWARY
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FXML
    private Tab towaryTab;

    @FXML
    private AnchorPane towaryAnchorPane1;

    @FXML
    private TextField towaryIdTF;

    @FXML
    private TextField towaryTypTF;

    @FXML
    private TextField towaryModelTF;

    @FXML
    private TextField TowaryMarkaTF;

    @FXML
    private TextField towaryCenaTF;

    @FXML
    private TextField towaryId_kodTF;

    @FXML
    private TextField towaryIloscTF;

    @FXML
    private TextField towaryStatusTF;

    @FXML
    private TextField towaryOpisTF;

    @FXML
    private Button towaryNowyBtn;

    @FXML
    private TableView<Towary> tableTowary;

    @FXML
    private TableColumn<Towary, Integer> id_towarColumn;

    @FXML
    private TableColumn<Towary, String> towaryTypColumn;

    @FXML
    private TableColumn<Towary, String> towaryMarkaColumn;

    @FXML
    private TableColumn<Towary, String> towaryModelColumn;

    @FXML
    private TableColumn<Towary, Integer> towaryId_kodColumn;

    @FXML
    private TableColumn<Towary, String> towaryStatusColumn;

    @FXML
    private TableColumn<Towary, String> towaryOpisColumn;

    @FXML
    private TableColumn<Towary, Integer> towaryIloscColumn;

    @FXML
    private TableColumn<Towary, Integer> towaryCenaColumn;

    @FXML
    private Button wyswietlTowary;

    @FXML
    private Button towaryUsunBtn;

    @FXML
    private Button uaktualnij2;

    @FXML
    private TextArea towaryResultArea1;

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //    TRANSPORT
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FXML
    private Tab transportTab;

    @FXML
    private AnchorPane transportAnchorPane1;

    @FXML
    private TextField transportIdTF;

    @FXML
    private TextField transportNazwaTF;

    @FXML
    private TextField transportRodzajTF;

    @FXML
    private Button transportNowyBtn;

    @FXML
    private TableView<Transport> tableTransport;

    @FXML
    private TableColumn<Transport, Integer> id_transportColumn;

    @FXML
    private TableColumn<Transport, String> transportNazwaColumn;

    @FXML
    private TableColumn<Transport, String> transportRodzajColumn;

    @FXML
    private Button wyswietlTransport;

    @FXML
    private Button transportUsunBtn;

    @FXML
    private Button uaktualnij11111;

    @FXML
    private TextArea transportResultArea1;

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //    ZAMOWIENIA
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FXML
    private Tab zamowieniaTab;

    @FXML
    private AnchorPane zamowieniaAnchorPane;

    @FXML
    private TextField zamowieniaIdTF;

    @FXML
    private TextField zamowieniaId_koszykTF;

    @FXML
    private TextField zamowieniaCzas_dostawyTF;

    @FXML
    private TextField zamowieniaData_zamTF;

    @FXML
    private TextField zamowieniaId_klientTF;

    @FXML
    private TextField zamowieniaId_transportTF;

    @FXML
    private TextField zamowieniaId_platnoscTF;

    @FXML
    private TextField zamowieniaStatusTF;

    @FXML
    private TextField zamowieniaZaplaconeTF;

    @FXML
    private TextField zamowieniaFakturaTF;

    @FXML
    private Button zamowieniaNowyBtn;

    @FXML
    private TableView<Zamowienia> tableZamowienia;

    @FXML
    private TableColumn<Zamowienia, Integer> id_zamowieniaColumn;

    @FXML
    private TableColumn<Zamowienia, Integer> zamowieniaId_koszykColumn;

    @FXML
    private TableColumn<Zamowienia, Integer> zamowieniaId_klientaColumn;

    @FXML
    private TableColumn<Zamowienia, Date> zamowieniaData_zamowieniaColumn;

    @FXML
    private TableColumn<Zamowienia, Integer> zamowieniaId_platnoscColumn;

    @FXML
    private TableColumn<Zamowienia, Boolean> zamowieniaZaplaconeColumn;

    @FXML
    private TableColumn<Zamowienia, Boolean> zamowieniaFakturaColumn;

    @FXML
    private TableColumn<Zamowienia, String> zamowieniaStatusColumn;

    @FXML
    private TableColumn<Zamowienia, Integer> zamowieniaid_transportColumn;

    @FXML
    private TableColumn<Zamowienia, String> zamowieniaCzas_dostawyColumn;

    @FXML
    private Button wyswietlZamowienia;

    @FXML
    private Button zamowieniaUsunBtn;

    @FXML
    private Button uaktualnij3;

    @FXML
    private TextArea zamowieniaResultArea1;

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

        id_platnosciColumn.setCellValueFactory(cellData -> cellData.getValue().id_patnosciProperty().asObject());
        platnosciGotowkaColumn.setCellValueFactory(cellData -> cellData.getValue().gotowkaProperty());
        platnosciPrzelewColumn.setCellValueFactory(cellData -> cellData.getValue().przelewProperty());
        platnosciKwotaColumn.setCellValueFactory(cellData -> cellData.getValue().kwotaProperty().asObject());

        id_koszykColumn.setCellValueFactory(cellData -> cellData.getValue().id_koszykProperty().asObject());
        koszykId_towarColumn.setCellValueFactory(cellData -> cellData.getValue().id_towarProperty().asObject());
        koszykIloscColumn.setCellValueFactory(cellData -> cellData.getValue().iloscProperty().asObject());
        koszykCenaColumn.setCellValueFactory(cellData -> cellData.getValue().cenaProperty().asObject());

        id_stanowiskaColumn.setCellValueFactory(cellData -> cellData.getValue().id_stanowiskaProperty().asObject());
        stanowiskaNazwaColumn.setCellValueFactory(cellData -> cellData.getValue().nazwaProperty());

        id_towarColumn.setCellValueFactory(cellData -> cellData.getValue().id_towarProperty().asObject());
        towaryTypColumn.setCellValueFactory(cellData -> cellData.getValue().typProperty());
        towaryMarkaColumn.setCellValueFactory(cellData -> cellData.getValue().markaProperty());
        towaryModelColumn.setCellValueFactory(cellData -> cellData.getValue().modelProperty());
        towaryId_kodColumn.setCellValueFactory(cellData -> cellData.getValue().id_kodProperty().asObject());
        towaryStatusColumn.setCellValueFactory(cellData -> cellData.getValue().status_towaruProperty());
        towaryOpisColumn.setCellValueFactory(cellData -> cellData.getValue().opisProperty());
        towaryIloscColumn.setCellValueFactory(cellData -> cellData.getValue().iloscProperty().asObject());
        towaryCenaColumn.setCellValueFactory(cellData -> cellData.getValue().cenaProperty().asObject());

        id_transportColumn.setCellValueFactory(cellData -> cellData.getValue().id_transportProperty().asObject());
        transportNazwaColumn.setCellValueFactory(cellData -> cellData.getValue().nazwaProperty());
        transportRodzajColumn.setCellValueFactory(cellData -> cellData.getValue().rodzajProperty());

        id_zamowieniaColumn.setCellValueFactory(cellData -> cellData.getValue().id_zamowieniaProperty().asObject());
        zamowieniaId_koszykColumn.setCellValueFactory(cellData -> cellData.getValue().id_koszykProperty().asObject());
        zamowieniaId_klientaColumn.setCellValueFactory(cellData -> cellData.getValue().id_klientProperty().asObject());
        zamowieniaData_zamowieniaColumn.setCellValueFactory(cellData -> cellData.getValue().dataZamowieniaProperty());
        zamowieniaId_platnoscColumn.setCellValueFactory(cellData -> cellData.getValue().id_platnoscProperty().asObject());
        zamowieniaZaplaconeColumn.setCellValueFactory(cellData -> cellData.getValue().zaplaconeProperty());
        zamowieniaFakturaColumn.setCellValueFactory(cellData -> cellData.getValue().fakturaProperty());
        zamowieniaStatusColumn.setCellValueFactory(cellData -> cellData.getValue().status_zamowieniaProperty());
        zamowieniaid_transportColumn.setCellValueFactory(cellData -> cellData.getValue().id_transportProperty().asObject());
        zamowieniaCzas_dostawyColumn.setCellValueFactory(cellData -> cellData.getValue().czas_dostawyProperty());

    }
    @FXML
    void deleteZamowienia(ActionEvent event) {

    }

    @FXML
    void insertZamowienia(ActionEvent event) {

    }

    @FXML
    void deleteTowary(ActionEvent event) throws SQLException {
        try {
            TowaryDAO.deleteItemWithId(towaryIdTF.getText());
            towaryResultArea1.setText("Towar został usunięty!\n Towar id: " + towaryIdTF.getText() + "\n");
        } catch (SQLException e) {
            towaryResultArea1.setText("Wystąpił problem podczas usuwania towaru" + e);
            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void insertTowary(ActionEvent event) throws SQLException {
        try {
            TowaryDAO.insertItem(towaryIdTF.getText(), towaryTypTF.getText(), TowaryMarkaTF.getText(), towaryModelTF.getText(), towaryId_kodTF.getText(), towaryStatusTF.getText(), towaryOpisTF.getText(), towaryIloscTF.getText(), towaryCenaTF.getText());
            towaryResultArea1.setText("Towar został dodany! \n");
        } catch (SQLException e) {
            towaryResultArea1.setText("Wystąpił problem podczas dodawania towaru" + e);
            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void deleteTransport(ActionEvent event) throws SQLException {
        try {
            TransportDAO.deleteTransportWithId(transportIdTF.getText());
            transportResultArea1.setText("Transport został usunięty!\n Transport id: " + transportIdTF.getText() + "\n");
        } catch (SQLException e) {
            transportResultArea1.setText("Wystąpił problem podczas usuwania transportu" + e);
            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void insertTransport(ActionEvent event) throws SQLException {
        try {
            TransportDAO.insertTransport(transportIdTF.getText(), transportNazwaTF.getText(), transportRodzajTF.getText());
            transportResultArea1.setText("Transport został dodany! \n");
        } catch (SQLException e) {
            transportResultArea1.setText("Wystąpił problem podczas dodawania transportu" + e);
            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void deleteStanowiska(ActionEvent event) throws SQLException {
        try {
            StanowiskaDAO.deletePositionWithId(stanowiskaIdTF.getText());
            stanowiskaResultArea1.setText("Stanowisko zostało usunięte!\n Stanowisko id: " + stanowiskaIdTF.getText() + "\n");
        } catch (SQLException e) {
            stanowiskaResultArea1.setText("Wystąpił problem podczas usuwania stanowiska" + e);
            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void insertStanowiska(ActionEvent event) throws SQLException {
        try {
            StanowiskaDAO.insertPosition(stanowiskaIdTF.getText(), stanowiskaIdTF.getText());
            stanowiskaResultArea1.setText("Stanowisko zostało dodane! \n");
        } catch (SQLException e) {
            stanowiskaResultArea1.setText("Wystąpił problem podczas dodawania stanowiska" + e);
            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void deletePlatnosci(ActionEvent event) throws SQLException {
        try {
            PlatnosciDAO.deletePaymentWithId(platnosciIdTF.getText());
            platnosciRsultArea1.setText("Płatność została usunięta!\n Płatność id: " + platnosciIdTF.getText() + "\n");
        } catch (SQLException e) {
            platnosciRsultArea1.setText("Wystąpił problem podczas usuwania płatności" + e);
            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void insertPlatnosci(ActionEvent event) throws SQLException {
        try {
            PlatnosciDAO.insertPayment(platnosciIdTF.getText(), platnosciGotowkTF.getText(), platnosciPrzelewTF.getText(), platnosciKwotaTF.getText());
            platnosciRsultArea1.setText("Płatność została dodana! \n");
        } catch (SQLException e) {
            platnosciRsultArea1.setText("Wystąpił problem podczas dodawania płatności" + e);
            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void deleteKoszyk(ActionEvent event) throws SQLException {
        try {
            KoszykDAO.deleteBasketWithId(koszykIdTF.getText());
            koszykResultArea1.setText("Koszyk został usunięty!\n Koszyk id: " + koszykIdTF.getText() + "\n");
        } catch (SQLException e) {
            koszykResultArea1.setText("Wystąpił problem podczas usuwania koszyka" + e);
            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void insertKoszyk(ActionEvent event) throws SQLException {
        try {
            KoszykDAO.insertBasket(koszykIdTF.getText(), koszykId_towarTF.getText(), koszykIloscTF.getText(), koszykCenaTF.getText());
            koszykResultArea1.setText("Koszyk został dodany! \n");
        } catch (SQLException e) {
            koszykResultArea1.setText("Wystąpił problem podczas dodawania koszyka " + e);
            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void deleteKod(ActionEvent event) throws SQLException {
        try {
            KodTowaruDAO.deleteCodeWithId(kod_towaruIdTF.getText());
            kod_towaruResultArea1.setText("Kod towaru został usunięty!\n Kod_towaru id: " + kod_towaruIdTF.getText() + "\n");
        } catch (SQLException e) {
            kod_towaruResultArea1.setText("Wystąpił problem podczas usuwania kodu towaru " + e);
            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void insertKod(ActionEvent event) throws SQLException {
        try {
            KodTowaruDAO.insertCode(kod_towaruIdTF.getText(), kodMagazynTF.getText(), kodHalaTF.getText(), kodPoziomTF.getText(), kodRegalTF.getText(), kodPolkaTF.getText());
            kod_towaruResultArea1.setText("Kod towaru został dodany! \n");
        } catch (SQLException e) {
            kod_towaruResultArea1.setText("Wystąpił problem podczas dodawania kodu towaru " + e);
            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void deleteKlient(ActionEvent event) throws SQLException {
        try {
            KlientDAO.deleteClientWithId(klientIdTF.getText());
            klientResultArea1.setText("Klient został usunięty!\n Klient id: " + klientIdTF.getText() + "\n");
        } catch (SQLException e) {
            klientResultArea1.setText("Wystąpił problem podczas usuwania klienta " + e);
            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void insertKlient(ActionEvent event) throws SQLException {
        try {
            KlientDAO.insertCli(klientIdTF.getText(), klientFirmaTF.getText(), klientImieTF.getText(), klientNazwiskoTF.getText(), klientAdresTF.getText(), klientKod_poczTF.getText(), klientMiejscowoscTF.getText(), klientTelefonTF.getText(), klientMailTF.getText(), klientStaly_klTF.getText());
            klientResultArea1.setText("Klient został dodany! \n");
        } catch (SQLException e) {
            klientResultArea1.setText("Wystąpił problem podczas dodawania klienta " + e);
            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void deletePracownik(ActionEvent event) throws SQLException {
        try {
            PracownikDAO.deleteEmpWithId(pracownikIdTF.getText());
            pracownicyResultArea.setText("Pracownik został usunięty!\n Pracownik id: " + pracownikIdTF.getText() + "\n");
        } catch (SQLException e) {
            pracownicyResultArea.setText("Wystąpił problem podczas usuwania pracownika " + e);
            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void insertPracownik(ActionEvent event) throws SQLException {
        try {
            PracownikDAO.insertEmp(pracownikIdTF.getText(), pracownikImieTF.getText(), pracownikNazwiskoTF.getText(), pracownikData_urTF.getText(), pracownikMiastoTF.getText(), pracownikAdresTF.getText(), pracownikTelefonTF.getText(), pracownikData_zatrTF.getText(), pracownikData_zwolTF.getText(), pracownikMailTF.getText(), pracownikPremiaTF.getText(), pracownikPensjaTF.getText(), pracownikId_stanowiskaTF.getText());
            pracownicyResultArea.setText("Pracownik został dodany \n");
        } catch (SQLException e) {
            pracownicyResultArea.setText("Wystąpił problem podczas dodawania pracownika " + e);
            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void ViewZamowienia(ActionEvent event) throws SQLException {
        try {
            //Get all Orders information
            ObservableList<Zamowienia> ordData = ZamowieniaDAO.searchOrders();
            //Populate Orders on TableView
            populateOrder(ordData);
            zamowieniaResultArea1.setText("Podłączono do bazy\n poprawnie\n");

        } catch (SQLException e){
            System.out.println("Wystąpił błąd podczas\n pobierania informacji o zamówieniach z DB.\n" + e);
            zamowieniaResultArea1.setText("Wystąpił błąd podczas\n pobierania informacji o zamówieniach z DB.\n" + e);
            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //Populate PositionItems for TableView
    @FXML
    private void populateOrder (ObservableList<Zamowienia> ordData) throws ClassNotFoundException {
        //Set items to the tableZamowienia
        tableZamowienia.setItems(ordData);
    }

    @FXML
    void ViewTransport(ActionEvent event) throws SQLException {
        try {
            //Get all Transports information
            ObservableList<Transport> tranData = TransportDAO.searchTransport();
            //Populate Transports on TableView
            populateTransport(tranData);
            transportResultArea1.setText("Podłączono do bazy\n poprawnie\n");

        } catch (SQLException e){
            System.out.println("Wystąpił błąd podczas\n pobierania informacji o transporcie z DB.\n" + e);
            transportResultArea1.setText("Wystąpił błąd podczas\n pobierania informacji o transporcie z DB.\n" + e);
            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //Populate PositionItems for TableView
    @FXML
    private void populateTransport (ObservableList<Transport> transData) throws ClassNotFoundException {
        //Set items to the tableStanowiska
        tableTransport.setItems(transData);
    }

    @FXML
    void ViewTowary(ActionEvent event) throws SQLException {
        try {
            //Get all Items information
            ObservableList<Towary> itemData = TowaryDAO.searchItems();
            //Populate Items on TableView
            populateItems(itemData);
            towaryResultArea1.setText("Podłączono do bazy\n poprawnie\n");

        } catch (SQLException e){
            System.out.println("Wystąpił błąd podczas\n pobierania informacji o towarach z DB.\n" + e);
            towaryResultArea1.setText("Wystąpił błąd podczas\n pobierania informacji o towarach z DB.\n" + e);
            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //Populate PositionItems for TableView
    @FXML
    private void populateItems (ObservableList<Towary> itemData) throws ClassNotFoundException {
        //Set items to the tableStanowiska
        tableTowary.setItems(itemData);
    }


    @FXML
    void ViewStanowiska(ActionEvent event) throws SQLException {
        try {
            //Get all Positions information
            ObservableList<Stanowiska> positionData = StanowiskaDAO.searchPosition();
            //Populate Positions on TableView
            populatePositions(positionData);
            stanowiskaResultArea1.setText("Podłączono do bazy\n poprawnie\n");

        } catch (SQLException e){
            System.out.println("Wystąpił błąd podczas\n pobierania informacji o stanowisku z DB.\n" + e);
            stanowiskaResultArea1.setText("Wystąpił błąd podczas\n pobierania informacji o stanowisku z DB.\n" + e);
            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //Populate PositionItems for TableView
    @FXML
    private void populatePositions (ObservableList<Stanowiska> positionData) throws ClassNotFoundException {
        //Set items to the tableStanowiska
        tableStanowiska.setItems(positionData);
    }

    @FXML
    void ViewKoszyk(ActionEvent event) throws SQLException {
        try {
            //Get all Baskets information
            ObservableList<Koszyk> basketData = KoszykDAO.searchBasket();
            //Populate Baskets on TableView
            populateBaskets(basketData);
            koszykResultArea1.setText("Podłączono do bazy\n poprawnie\n");

        } catch (SQLException e){
            System.out.println("Wystąpił błąd podczas\n pobierania informacji o koszyku z DB.\n" + e);
            koszykResultArea1.setText("Wystąpił błąd podczas\n pobierania informacji o koszyku z DB.\n" + e);
            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //Populate BasketItems for TableView
    @FXML
    private void populateBaskets (ObservableList<Koszyk> basketData) throws ClassNotFoundException {
        //Set items to the tableKoszyk
        tableKoszyk.setItems(basketData);
    }

    @FXML
    void ViewPlatnosci(ActionEvent event) throws SQLException {
        try {
            //Get all Codes information
            ObservableList<Platnosci> paymentData = PlatnosciDAO.searchPlatnosci();
            //Populate Codes on TableView
            populatePayments(paymentData);
            platnosciRsultArea1.setText("Podłączono do bazy\n poprawnie\n");

        } catch (SQLException e){
            System.out.println("Wystąpił błąd podczas\n pobierania informacji o płatnościach z DB.\n" + e);
            platnosciRsultArea1.setText("Wystąpił błąd podczas\n pobierania informacji o płatnościach z DB.\n" + e);

            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //Populate CodesItems for TableView
    @FXML
    private void populatePayments (ObservableList<Platnosci> paymentData) throws ClassNotFoundException {
        //Set items to the tableKlienci
        tablePlatnosci.setItems(paymentData);
    }


    @FXML
    void ViewKod_towaru(ActionEvent event) throws SQLException {
        try {
            //Get all Codes information
            ObservableList<KodTowaru> codeData = KodTowaruDAO.searchKod();
            //Populate Codes on TableView
            populateCodes(codeData);
            kod_towaruResultArea1.setText("Podłączono do bazy\n poprawnie\n");

        } catch (SQLException e){
            System.out.println("Wystąpił błąd podczas\n pobierania informacji o kodzie towaru z DB.\n" + e);
            kod_towaruResultArea1.setText("Wystąpił błąd podczas\n pobierania informacji o kodzie towaru z DB.\n" + e);

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
            klientResultArea1.setText("Podłączono do bazy\n poprawnie\n");

        } catch (SQLException e){
            System.out.println("Wystąpił błąd podczas\n pobierania informacji o klientach z DB.\n" + e);
            klientResultArea1.setText("Wystąpił błąd podczas\n pobierania informacji o klientach z DB.\n" + e);

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
            pracownicyResultArea.setText("Podłączono do bazy\n poprawnie\n");

        } catch (SQLException e){
            System.out.println("Wystąpił błąd podczas\n pobierania informacji o pracownikach z DB.\n" + e);
            pracownicyResultArea.setText("Wystąpił błąd podczas\n pobierania informacji o pracownikach z DB.\n" + e);
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

