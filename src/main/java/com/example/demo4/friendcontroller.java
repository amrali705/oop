package com.example.demo4;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class friendcontroller {

    @FXML
    private Button openchat;


    @FXML
    private Label username;


    @FXML
    void openchat(MouseEvent event) throws IOException {

        JsonHandler jsonHandler = new JsonHandler();
        List<User> users = jsonHandler.loadUsers();
        List<Conversation> conversations = jsonHandler.loadconversation();
        for (User user:users) {
            if (user.name.equals(username.getText())) {
                FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("friendconversation.fxml"));
                Parent root = fxmlLoader1.load();


                // Get the controller after loading
                conversationcontroller conversationcontroller = fxmlLoader1.getController();
                conversationcontroller.setData(user);


                // Open the new stage
                Stage stage = new Stage();
                Scene scene1 = new Scene(root);
                stage.setScene(scene1);
                stage.show();
                break;
            }

        }

    }

    public void setData (User user){
        username.setText(user.name);
    }




}

