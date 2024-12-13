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

    private static final String FILE_PATH_user = "users.json";
    private static final String FILE_PATH_post = "posts.json";
    private static final Gson GSON = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd")
            .create();

    // Load users from JSON
    public List<User> loadUsers() {
        try (FileReader reader = new FileReader(FILE_PATH_user)) {
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
        try (FileWriter writer = new FileWriter(FILE_PATH_user)) {
            GSON.toJson(users, writer);
        } catch (IOException e) {
            System.out.println("Error writing users file: " + e.getMessage());
        }
    }


/////    post     ////


    // Load posts from JSON
    public List<Post> loadPosts() {
        try (FileReader reader = new FileReader(FILE_PATH_post)) {
            Type postListType = new TypeToken<ArrayList<Post>>() {}.getType();
            return GSON.fromJson(reader, postListType);
        } catch (IOException e) {
            System.out.println("Error reading post file: " + e.getMessage());
            return new ArrayList<>();
        } catch (JsonSyntaxException e) {
            System.out.println("Error parsing JSON file: " + e.getMessage());
            return new ArrayList<>();
        }
    }


    // Save posts to JSON
    public void savePosts(List<Post> posts) {
        try (FileWriter writer = new FileWriter(FILE_PATH_post)) {
            GSON.toJson(posts, writer);
        } catch (IOException e) {
            System.out.println("Error writing posts file: " + e.getMessage());
        }
    }
}
