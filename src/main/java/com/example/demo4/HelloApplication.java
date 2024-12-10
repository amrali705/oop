package com.example.demo4;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage window;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login_css.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("amr ali ");
        stage.setScene(scene);
        window=stage;
        stage.show();
    }



    public static void main(String[] args) throws ParseException {



        launch();
    }
    public Stage stageview (){
        return this.window;
    }



}