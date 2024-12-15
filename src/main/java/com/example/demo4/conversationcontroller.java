package com.example.demo4;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class conversationcontroller {

    @FXML
    private Label friendname;

    @FXML
    private VBox massagevbox;

    @FXML
    private Label messagelable;


    @FXML
    private TextArea messegetextarea;

    @FXML
    void sendmessage(MouseEvent event) throws IOException {
        JsonHandler jsonHandler = new JsonHandler();
        List<Conversation> conversations = jsonHandler.loadconversation();
        Conversation conversationsave;
        for(Conversation conversation:conversations){
            if(conversation.getConversationId().equals(friendname.getText())){
                conversation.sendMessage(friendname.getText(),LoginController.theuser,messegetextarea.getText());
                conversations.add(conversation);
                break;
            }
        }
        for(Conversation conversation:conversations){
            if(conversation.getConversationId().equals(friendname.getText())){
                conversations.remove(conversation);
                break;
            }
        }
        jsonHandler.saveconversations(conversations);


        FXMLLoader fxmlLoader=new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("message.fxml"));
        Label label =fxmlLoader.load();
        messagecontroller messagecontroller= fxmlLoader.getController();
        messagecontroller.setData(messegetextarea.getText());
        massagevbox.getChildren().add(label);

    }

    public void setData (User user) throws IOException {
        friendname.setText(user.getName());
        JsonHandler jsonHandler = new JsonHandler();
        List<Conversation> conversations = jsonHandler.loadconversation();
        for(Conversation conversation:conversations){
            if(conversation.getParticipants().contains(user)){
                for (Message message : conversation.getMessages()){
                    FXMLLoader fxmlLoader=new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("message.fxml"));
                    Label label =fxmlLoader.load();
                    messagecontroller messagecontroller= fxmlLoader.getController();
                    messagecontroller.setData(message.getContent());
                    massagevbox.getChildren().add(label);
                }
                break;
            }
        }
    }
}




