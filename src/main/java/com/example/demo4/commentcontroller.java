package com.example.demo4;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.security.CodeSigner;
import java.util.Date;
import java.util.List;

public class commentcontroller {

    private Post currentPost;
    @FXML
    private Button closecomment;

    @FXML
    private Label comment;

    @FXML
    private TextArea commentTextarea;

    @FXML
    private VBox commentVbox;

    @FXML
    private Button sendcomment;

    @FXML
    void closecomment(MouseEvent event) {

    }

    @FXML
    void send(MouseEvent event) {


    }

    @FXML
    private Label commentLabel;
    @FXML
    private Label userLabel;


    public void setData(String commentText, User user) {
        commentLabel.setText(commentText);
        userLabel.setText(user.getName());
    }





    @FXML

    void sendcomment(MouseEvent event) {
        if (currentPost == null) {
            System.out.println("Current post is not set.");
            return;  // Avoid running the method if currentPost is null
        }
        JsonHandler jsonHandler = new JsonHandler();
        List<Post> posts = jsonHandler.loadPosts();
        Post postToSave = null;


        for (Post post : posts) {
            if (post.getTimestamp().equals(currentPost.getTimestamp())) {
                postToSave = post;
                break;
            }
        }

        if (postToSave != null) {
            String commentContent =LoginController.theuser.name+":"+ commentTextarea.getText();

            if (!commentContent.isEmpty()) {
                // Assuming 'theuser' is a string representing the current logged-in user
                Comment newComment = new Comment(commentContent,LoginController.theuser, new Date()); // Create comment with current user and content

                // Add the comment to the post
                postToSave.getComments().add(newComment);

                // Save updated posts back to JSON
                jsonHandler.savePosts(posts);
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("message.fxml"));
                    Label label = fxmlLoader.load();
                    messagecontroller messageController = fxmlLoader.getController();
                    messageController.setData(commentContent); // Set only the comment text
                    commentVbox.getChildren().add(label); // Add the comment to the VBox
                } catch (IOException e) {
                    e.printStackTrace();
                }
                // Clear the comment input area
                commentTextarea.clear();
            }
        } else {
            System.out.println("Post not found to add comment.");
        }
    }

    public void setdata(Post post) throws IOException {
        this.currentPost = post;
        JsonHandler jsonHandler = new JsonHandler();
        List<Post> posts = jsonHandler.loadPosts();

        commentVbox.getChildren().clear();

        for (Post currentPost : posts) {
            if (currentPost.getTimestamp().equals(post.getTimestamp())) {
                System.out.println("Found post with timestamp: " + post.getTimestamp());

                // Print out the loaded comments for debugging
                for (Comment comment : currentPost.getComments()) {
                    System.out.println("Comment: " + comment.getContent());
                    // Create a label for each comment and add it to the VBox

                    Label commentLabel = new Label(   comment.getContent());
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("message.fxml"));
                    Label label = fxmlLoader.load();
                    messagecontroller messagecontroller = fxmlLoader.getController();
                    messagecontroller.setData(commentTextarea.getText());
                    commentVbox.getChildren().add(label);
                    commentVbox.getChildren().add(commentLabel);
                }
                break;
            }
        }
    }
}
