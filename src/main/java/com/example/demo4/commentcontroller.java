package com.example.demo4;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class commentcontroller {

    @FXML
    private Button closecomment;

    @FXML
    private Label comment;

    @FXML
    private TextArea commentTextarea;

    @FXML
    private VBox commentVbox;

    @FXML
    private Button sendcomment;

    @FXML
    void closecomment(MouseEvent event) {

    }

    @FXML
    void send(MouseEvent event) {

    }

    @FXML
    void sendcomment(MouseEvent event) {

    }


    public void setdata(Post post) throws IOException {




        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("message.fxml"));
        Label label = fxmlLoader.load();
        messagecontroller messagecontroller = fxmlLoader.getController();
        messagecontroller.setData(commentTextarea.getText());
        commentVbox.getChildren().add(label);
    }








}
