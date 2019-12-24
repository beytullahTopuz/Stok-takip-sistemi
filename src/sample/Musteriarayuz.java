package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import static sample.Main.urunObjArrL;

public class Musteriarayuz extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {



        Parent root = FXMLLoader.load(getClass().getResource("musteriarayuz.fxml"));
        primaryStage.setTitle("musteri Arayüz");
        primaryStage.setScene(new Scene(root, 586, 400));
        primaryStage.show();

    }
}
