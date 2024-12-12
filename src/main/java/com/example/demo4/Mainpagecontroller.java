package com.example.demo4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import java.io.IOException;

public class Mainpagecontroller {
        @FXML
        private BorderPane mainborderbane;

        @FXML
        private Button toprofile;

        @FXML
        private VBox vbox_of_friends;

        @FXML
        private VBox vbox_of_postes;
        @FXML
        private Text username;

        @FXML
        void create_post(MouseEvent event) {

        }

        @FXML
        void open_profile(MouseEvent event) throws IOException {
                new Profileview().profileview();
        }
        @FXML
        void prepar(MouseEvent event) {
                username.setText(LoginController.theuser.getName());
        }



}
