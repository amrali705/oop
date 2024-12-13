package com.example.demo4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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
    void login_cheak(MouseEvent event) throws IOException {
        JsonHandler jsonHandler = new JsonHandler();
        List<User> users = jsonHandler.loadUsers();
        for (User user : users){
            if(emailTf.getText().equals(user.getEmail())&passwordtf.getText().equals(user.getPassword())){
                theuser = user;
                new Mainpageview().mainpageview();

            }
        }
    }


}

