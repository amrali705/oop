package com.example.demo4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class Mainpagecontroller {

        @FXML
        private Button toprofile;

        @FXML
        private VBox vbox_of_friends;

        @FXML
        private VBox vbox_of_postes;

        @FXML
        void create_post(MouseEvent event) {

        }

        @FXML
        void open_profile(MouseEvent event) throws IOException {
                new Profileview().profileview();
        }

}
