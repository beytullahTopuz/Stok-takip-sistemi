package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;

public class Kayitol extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Kayitol.fxml"));
        primaryStage.setTitle("kayit ol");
        primaryStage.setScene(new Scene(root, 586, 400));
        primaryStage.show();
    }
}
