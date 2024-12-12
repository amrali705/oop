package com.example.demo4;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
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
        String filePath = "omar.json";

        // Create a Gson instance
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Step 1: Read existing data
        List<Person> persons = new ArrayList<>();

        try (FileReader reader = new FileReader(filePath)) {
            Type listType = new TypeToken<List<Person>>() {}.getType();
            persons = gson.fromJson(reader, listType);

            // If file is empty or null, initialize the list
            if (persons == null) {
                persons = new ArrayList<>();
            }
        } catch (IOException e) {
            System.out.println("No existing file found. Starting with an empty list.");
        }

        // Step 2: Add new Person to the list
        persons.add(new Person(10,"amr"));




        // Step 3: Write updated list back to the file
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(persons, writer);
            System.out.println("Data has been appended to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Display updated list
        System.out.println("Updatelist:");


        // Read existing data


        launch();
    }
    public Stage stageview (){
        return this.window;
    }



}