package com.example.demo4;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import java.sql.Date;
import java.util.List;


public class CreatingAccountController {


    @FXML
    private Button CreatenewAccount;

    @FXML
    private DatePicker birthdate;

    @FXML
    private PasswordField confirmpasswordTf;

    @FXML
    private TextField emailTf;

    @FXML
    private RadioButton female;

    @FXML
    private RadioButton male;

    @FXML
    private PasswordField passwordTf;

    @FXML
    private ToggleGroup sex;

    @FXML
    private TextField userNameTf;
    @FXML
    private Label messageLabel;

    @FXML
    void CreateAccount(MouseEvent event) {

            try {
                String username = userNameTf.getText();
                String email = emailTf.getText();
                String password = passwordTf.getText();
                String confirmPassword = confirmpasswordTf.getText();

                // Check if any field is empty
                if (username.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    messageLabel.setText("All fields are required!");
                    return;
                }

                // Validate email format
                if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                    messageLabel.setText("Invalid email format!");
                    return;
                }

                // Check password length
                if (password.length() < 6) {
                    messageLabel.setText("Password must be at least 6 characters!");
                    return;
                }

                // Check if passwords match
                if (!password.equals(confirmPassword)) {
                    messageLabel.setText("Passwords do not match!");
                    return;
                }

                // Create Date object from DatePicker
                Date birthDate = Date.valueOf(birthdate.getValue());

                // Load existing users
                JsonHandler jsonHandler = new JsonHandler();
                List<User> users = jsonHandler.loadUsers();

                // Check if email is unique
                for (User user : users) {
                    if (user.getEmail().equals(email)) {
                        messageLabel.setText("Email is already registered!");
                        return;
                    }
                }

                // Create and save the new user
                User newUser = new User(username, email, password, birthDate);
                users.add(newUser);
                jsonHandler.saveUsers(users);

                messageLabel.setTextFill(javafx.scene.paint.Color.GREEN);
                messageLabel.setText("User registered successfully!");

                // Navigate to the main page
                LoginController.theuser = newUser;
                new Mainpageview().mainpageview();
            } catch (Exception e) {
                messageLabel.setText("Error creating account: " + e.getMessage());
                e.printStackTrace();
            }
        }



@FXML
    public void editaccount(MouseEvent mouseEvent) {

    }
}
