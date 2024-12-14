package com.example.demo4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class friendcontroller {

    @FXML
    private Button openchat;

    @FXML
    private Label username;

    @FXML
    void openchat(MouseEvent event) {

    }

    public void setData (User user){
        username.setText(user.name);
    }

}

