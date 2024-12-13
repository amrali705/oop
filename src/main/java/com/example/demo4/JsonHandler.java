package com.example.demo4;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.*;


public class JsonHandler {

    private static final String FILE_PATH = "users.json";
    private static final Gson GSON = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd")
            .create();

    // Load users from JSON
    public List<User> loadUsers() {
        try (FileReader reader = new FileReader(FILE_PATH)) {
            Type userListType = new TypeToken<ArrayList<User>>() {}.getType();
            return GSON.fromJson(reader, userListType);
        } catch (IOException e) {
            System.out.println("Error reading users file: " + e.getMessage());
            return new ArrayList<>();
        } catch (JsonSyntaxException e) {
            System.out.println("Error parsing JSON file: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    // Save users to JSON
    public void saveUsers(List<User> users) {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            GSON.toJson(users, writer);
        } catch (IOException e) {
            System.out.println("Error writing users file: " + e.getMessage());
        }
    }
}
