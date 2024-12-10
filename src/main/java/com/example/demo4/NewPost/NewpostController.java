package com.example.demo4.NewPost;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NewpostController {
    public Parent root;
    public NewpostController() throws IOException {
        try {
            // Attempt to load the FXML file
            this.root = FXMLLoader.load(getClass().getResource("Newpost_css.fxml"));
        } catch (IOException e) {
            // Handle the exception here
            System.err.println("Error loading FXML file: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public void Newpostview(){
        Stage stage=new Stage();
        Scene scene =new Scene(root);
        stage.setScene(scene);
    }
}
