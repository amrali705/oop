package com.example.demo4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class profilecontroller {

    @FXML
    private Button home;

    @FXML
    private TextField searchbar;

    @FXML
    private VBox vboxprofilepost;

    @FXML
    void gomain(MouseEvent event) throws IOException {
        new Mainpageview().mainpageview();
    }

}
