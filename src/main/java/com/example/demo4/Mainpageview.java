package com.example.demo4;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Mainpageview {
    public Parent root;
    public Mainpageview() throws IOException {
        try {
            // Attempt to load the FXML file
            this.root = FXMLLoader.load(getClass().getResource("Main_css.fxml"));
        } catch (IOException e) {
            // Handle the exception here
            System.err.println("Error loading FXML file: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public void mainpageview(){
        new HelloApplication().stageview().close();
        Stage stage=new Stage();
        Scene scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
        new HelloApplication().window=stage;
    }
}
