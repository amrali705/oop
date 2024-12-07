package com.example.demo4;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Post {
    private String privacy;
    private String content;
    private List<Comment> comments;
    private List<User> likes;
    private User author;
    private static int post_id=0;
    private Date time_post;

    public Post(String content, User author, Date time) {
        post_id++;
        this.content = content;
        this.author = author;
        this.time_post = time;
        this.likes = new ArrayList<>();
        this.comments = new ArrayList<>();
    }
    public int getPostId() {
        return post_id;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public User getAuthor() {
        return author;
    }
    public void setAuthor(User author) {
        this.author = author;
    }
    public Date getTimestamp() {
        return time_post;
    }

    public void setTimestamp(Date timestamp) {
        this.time_post = timestamp;
    }
    public List<User> getLikes() {
        return likes;
    }
    public void setLikes(List<User> likes) {
        this.likes = likes;
    }
    public List<Comment> getComments() {
        return comments;
    }
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
    // Methods

    public void addLike(User user) {
        this.likes.add(user);
    }
    public void removeLike(User user) {
        this.likes.remove(user);
    }
    public void addComment(Comment comment) {
        this.comments.add(comment);
    }
    public void editPost(String newContent) {
        this.content = newContent;
    }
    public void deletePost() {
    }

}
