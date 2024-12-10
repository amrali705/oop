package com.example.demo4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class LoginController {

    @FXML
    private Button CreatenewAccount;

    @FXML
    void CreateAccount(MouseEvent event) throws IOException {
        new CreatingAccountview().Creatingtview();

    }

}
