package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.model.PracownikDAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view/GUI.fxml"));
        primaryStage.setTitle("Sklep z multimediami");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

//        dbConnect();
//        PracownikDAO pracownicyDAO = new PracownikDAO();
//        pracownicyDAO.searchPracownicy();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
