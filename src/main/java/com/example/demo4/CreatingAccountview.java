package com.example.demo4;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CreatingAccountview {
    public Parent root;
    public CreatingAccountview() throws IOException {

            this.root = FXMLLoader.load(getClass().getResource("creatingaccount_css.fxml"));

    }
    public void Creatingtview(){
        new HelloApplication().stageview().close();

        Stage stage=new Stage();
        Scene scene1 =new Scene(root);
        stage.setScene(scene1);
        stage.show();

    }
}
