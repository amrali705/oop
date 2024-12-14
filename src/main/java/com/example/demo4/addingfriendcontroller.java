package com.example.demo4;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class addingfriendcontroller {

    @FXML
    private Label username;

    @FXML
    public void addfriend(MouseEvent event) {
        JsonHandler jsonHandler = new JsonHandler();
        List<User> users = jsonHandler.loadUsers();

        for(User user :users){
            if(user.name.equals(username.getText())){
                LoginController.theuser.getFriends().add(user.getEmail());
//                Friend_Request friendRequestnew=new  Friend_Request(LoginController.theuser,user);
//                friendRequestnew.accept_Request();
//                for (User user1 :users){
//                    if (user1.getEmail().equals(user.getEmail())){
//                        user1=friendRequestnew.getSender();
//                        break;
//                    }
//                }
            }
        }

        for (User user :users){
            if (user.getEmail().equals(LoginController.theuser.getEmail()))
            {
                users.remove(user);
                break;
            }
        }
        users.add(LoginController.theuser);
        jsonHandler.saveUsers(users);
        System.out.println("add friend successfully!");
    }

    public void setData (User user){
        username.setText(user.name);
    }



}

