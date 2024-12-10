package com.example.demo4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

import java.sql.Date;
import java.util.ArrayList;

public class CreatingAccountController {

    public ArrayList<User>users =new ArrayList<>();

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
    void CreateAccount(MouseEvent event) {
        try {
            if (passwordTf.getText().equals(confirmpasswordTf.getText())) {
                Date birthDate = Date.valueOf(birthdate.getValue());

                User user = new User(userNameTf.getText(), emailTf.getText(), passwordTf.getText(), birthDate);
                users.add(user);
                System.out.println("Account created successfully!");
                System.out.println("User Details: " + user.getName() + ", " + user.getEmail()+ user.getBirthdate());
                new Mainpageview().mainpageview();

            } else {
                System.out.println("Passwords do not match!");
            }
        } catch (Exception e) {
            System.out.println("Error creating account: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
