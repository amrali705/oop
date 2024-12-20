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

public class profilecontroller implements Initializable {

    @FXML
    private Button home;
    @FXML
    private Text username;

    @FXML
    private TextField searchbar;

    @FXML
    private VBox vboxprofilepost;

    @FXML
    void gomain(MouseEvent event) throws IOException {
        new Mainpageview().mainpageview();
    }
     @FXML

    void editprofile(MouseEvent event)throws IOException {

        new CreatingAccountview().Creatingtview();

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        username.setText(LoginController.theuser.name);
        try {
            JsonHandler jsonHandler = new JsonHandler();
            List<Post> posts = jsonHandler.loadPosts();
            for (Post post : posts) {
                if (post.getAuthor().getPassword().equals(LoginController.theuser.getPassword())) {
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("post.fxml"));
                    BorderPane borderPane = fxmlLoader.load();
                    postcontroller postcontroller = fxmlLoader.getController();
                    postcontroller.setData(post);
                    vboxprofilepost.getChildren().add(borderPane);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

/*package com.example.demo4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class profilecontroller {

    @FXML
    private Button home;

    @FXML
    private TextField searchbar;

    @FXML
    private VBox vboxprofilepost;

    @FXML
    void editprofile(MouseEvent event) {

    }

    @FXML
    void gomain(MouseEvent event) {
        new Mainpageview().mainpageview();
    }

}*/


