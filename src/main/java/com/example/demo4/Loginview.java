package com.example.demo4;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Loginview {
    public Parent root;
    public Loginview() throws IOException {
        try {
            // Attempt to load the FXML file
            this.root = FXMLLoader.load(getClass().getResource("Login_css.fxml"));
        } catch (IOException e) {
            // Handle the exception here
            System.err.println("Error loading FXML file: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public void loginview(){
        Stage stage=new Stage();
        Scene scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
