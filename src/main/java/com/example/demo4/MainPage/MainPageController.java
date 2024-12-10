package com.example.demo4.MainPage;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainPageController {
    public Parent root;
    public MainPageController() throws IOException {
        try {
            // Attempt to load the FXML file
            this.root = FXMLLoader.load(getClass().getResource("MainPage_css.fxml"));
        } catch (IOException e) {
            // Handle the exception here
            System.err.println("Error loading FXML file: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public void MainPageview(){
        Stage stage=new Stage();
        Scene scene =new Scene(root);
        stage.setScene(scene);
    }
}
