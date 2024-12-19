package com.example.demo4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class Createpostcontroller {
    public static Post post;

    @FXML
    private TextArea contentofpost;

    @FXML
    private Button donenewpost;

    @FXML
    private RadioButton friends;

    @FXML
    private Button gomainpage;

    @FXML
    private ToggleGroup postscope;

    @FXML
    private RadioButton puplic;

    @FXML
    private Label usernametf;

    @FXML
    void donenewpost(MouseEvent event) throws IOException {


        JsonHandler jsonHandler = new JsonHandler();
        List<Post> posts = jsonHandler.loadPosts();
        post =new Post(contentofpost.getText(),LoginController.theuser,new Date());
        posts.add(post);
        jsonHandler.savePosts(posts); // Save updated user list to file
        System.out.println("post  successfully!");

        new Mainpageview().mainpageview();

    }

    @FXML
    void gomainpage(MouseEvent event) throws IOException {
        new Mainpageview().mainpageview();

    }

}
