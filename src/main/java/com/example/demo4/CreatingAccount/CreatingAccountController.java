package com.example.demo4.CreatingAccount;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class CreatingAccountController {
    public Parent root;
    public CreatingAccountController() throws IOException {
        try {
            // Attempt to load the FXML file
            this.root = FXMLLoader.load(getClass().getResource("creatingaccount_css.fxml"));
        } catch (IOException e) {
            // Handle the exception here
            System.err.println("Error loading FXML file: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public void CreatingAccountview(){
        Stage stage=new Stage();
        Scene scene =new Scene(root);
        stage.setScene(scene);
    }
}
