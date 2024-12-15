package com.example.demo4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class messagecontroller {

    @FXML
    private Label massegecontent;

    public void setData (String massege){
        massegecontent.setText(massege);
    }

}
