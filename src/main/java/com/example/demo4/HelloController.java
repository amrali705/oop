package com.example.demo4;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private Text name;

    @FXML
    private TextField test_name_f;

    @FXML
    void Rename(MouseEvent event) {
        name.setText(test_name_f.getText());

    }

}
