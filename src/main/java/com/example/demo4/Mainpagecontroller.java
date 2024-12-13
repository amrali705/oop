package com.example.demo4;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Mainpagecontroller implements Initializable {
        @FXML
        private BorderPane mainborderbane;

        @FXML
        private Button toprofile;

        @FXML
        private VBox vbox_of_friends;

        @FXML
        private VBox vbox_of_postes;
        @FXML
        private Text username;

        @FXML
        void create_post(MouseEvent event) throws IOException {
            new createpostview().Creatingpostview();
        }

        @FXML
        void open_profile(MouseEvent event) throws IOException {
                new Profileview().profileview();
        }
        @FXML
        void prepar(MouseEvent event) {
                username.setText(LoginController.theuser.getName());
        }


        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
            try {
                JsonHandler jsonHandler = new JsonHandler();
                List<Post> posts = jsonHandler.loadPosts();
                for (Post post : posts) {
                    FXMLLoader fxmlLoader=new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("post.fxml"));
                    BorderPane borderPane =fxmlLoader.load();
                    postcontroller postcontroller = fxmlLoader.getController();
                    postcontroller.setData(post);
                    vbox_of_postes.getChildren().add(borderPane);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
}
