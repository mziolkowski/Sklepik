package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import sample.model.PracownikDAO;

import java.sql.SQLException;

public class Controller {

    @FXML
    private TableColumn<?, ?> id_pracownik;

    @FXML
    private TableColumn<?, ?> pracImie;

    @FXML
    private Button nowy;

    @FXML
    private TableView<?> tablePracownik;

    @FXML
    private Button wyswietl;

    @FXML
    private Button usun;

    @FXML
    private Button uaktualnij;

    @FXML
    void wyswietl(ActionEvent event) throws SQLException, ClassNotFoundException {
        PracownikDAO pracownicyDAO = new PracownikDAO();
        pracownicyDAO.searchPracownicy();
    }

}
