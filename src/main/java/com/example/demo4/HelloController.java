package com.example.demo4;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Text name;

    @FXML
    private TextField test_name_f;

    @FXML
    void Rename(MouseEvent event) throws IOException {
        name.setText(test_name_f.getText());
    }

}
