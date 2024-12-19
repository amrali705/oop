package com.example.demo4;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class postcontroller {
    Post post1 ;
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
        this.post1 =post;

    }
    @FXML
    void opencomment(MouseEvent event) throws IOException {

        FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("comment.fxml"));
        Parent root = fxmlLoader1.load();


        // Get the controller after loading
        commentcontroller commentcontroller = fxmlLoader1.getController();
        commentcontroller.setdata(post1);


        // Open the new stage
        Stage stage = new Stage();
        Scene scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();

    }

}
