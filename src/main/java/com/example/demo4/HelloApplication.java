package com.example.demo4;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;


import com.google.gson.Gson;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;

public class HelloApplication extends Application {
    public static Stage window;
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
        List<Person> persons = new ArrayList<>();
        Person p=new Person(1, "Alice");
        persons.add(p);
        Gson gson=new Gson();
        String json=gson.toJson(persons);
        System.out.println(json);



        // Read existing data


        launch();
    }
    public Stage stageview (){
        return this.window;
    }



}