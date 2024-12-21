package com.example.demo4;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;


public class LoginController {
    public static User theuser;

    @FXML
    private Button CreatenewAccount;
    @FXML
    private Button login;
    @FXML
    private TextField emailTf;
    @FXML
    private PasswordField passwordtf;

    @FXML
    void CreateAccount(MouseEvent event) throws IOException {
        new CreatingAccountview().Creatingtview();
    }
    @FXML
    private Label loginMessage;

    @FXML
    void login_cheak(MouseEvent event) throws IOException {
        String email = emailTf.getText();
        String password = passwordtf.getText();

        // Check if any field is empty
        if (email.isEmpty() || password.isEmpty()) {
            loginMessage.setText("Please fill in all fields!");
            loginMessage.setTextFill(javafx.scene.paint.Color.RED);
            loginMessage.setVisible(true);  // Show the label
            return;
        }

        JsonHandler jsonHandler = new JsonHandler();
        List<User> users = jsonHandler.loadUsers();
        boolean found = false;

        // Check user credentials
        for (User user : users) {
            if (email.equals(user.getEmail()) && password.equals(user.getPassword())) {
                theuser = user;
                new Mainpageview().mainpageview();
                loginMessage.setTextFill(javafx.scene.paint.Color.GREEN);
                loginMessage.setText("Login successful! Redirecting...");
                loginMessage.setVisible(true);  // Show the label
                found = true;
                break;
            }
        }

        if (!found) {
            loginMessage.setTextFill(javafx.scene.paint.Color.RED);
            loginMessage.setText("Invalid email or password!");
            loginMessage.setVisible(true);  // Show the label
        }
    }

}

