package com.example.demo4;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 552, 400);
        stage.setTitle("amr ali ");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//
         User user1 = new User("amr", "amraliali434@gmail.com", "1+53456##", dateFormat.parse("2022-03-25"));
//
//        user1.make_post(user1, dateFormat.parse("2024-03-25"));
//        user1.make_post(user1, dateFormat.parse("2024-03-25"));
//        user1.make_post(user1, dateFormat.parse("2024-03-25"));
//
//        user1.get_post(1).addLike(user1);
//        System.out.println(user1.get_post(1).getLikes().size());
        Reply mmm =new Reply("sadf",user1,dateFormat.parse("2022-03-25"));




        launch();
    }
}