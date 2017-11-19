package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.controller.Controller;
import sample.model.PracownikDAO;
import sample.util.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view/GUI.fxml"));
        primaryStage.setTitle("Sklep z multimediami");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        dbConnect();
//        PracownikDAO pracownicyDAO = new PracownikDAO();
//        pracownicyDAO.searchPracownicy();

    }

    public static void dbConnect() {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/Sklep_z_multimediami",
                            "postgres", "postgres");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
