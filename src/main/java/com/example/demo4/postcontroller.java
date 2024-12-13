package com.example.demo4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class postcontroller {
    @FXML
    private Label contentofpost;


    @FXML
    private Button likeButton;

    @FXML
    private BorderPane post;

    @FXML
    private Label usernametf;

    @FXML
    void makelike(MouseEvent event) {

    }
    public void setData(Post post){
        contentofpost.setText(post.getContent());
        usernametf.setText(post.getAuthor().name);

    }







}
