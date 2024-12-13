package com.example.demo4;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class createpostview {
    public Parent root;
    public createpostview() throws IOException {

        this.root = FXMLLoader.load(getClass().getResource("making_post.fxml"));

    }
    public void Creatingpostview(){
        new HelloApplication().stageview().close();
        Stage stage=new Stage();
        Scene scene1 =new Scene(root);
        stage.setScene(scene1);
        stage.show();
        new HelloApplication().window=stage;

    }

}
