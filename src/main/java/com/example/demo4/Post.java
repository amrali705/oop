package com.example.demo4;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Post {

    private String  privacy;
    private String content;
    private List<Comment> comments;
    private List<Reaction> likes;
    private final User author;
    private final int post_id;
    private static int count=0;
    private Date time_post;

    public Post( String content, User author, Date time) {
        count ++;
        post_id = count;
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
    public Date getTimestamp() {
        return time_post;
    }
    public void setTimestamp(Date timestamp) {
        this.time_post = timestamp;
    }
    public List<Reaction> getLikes() {
        return likes;
    }
    public void setLikes(List<Reaction> likes) {
        this.likes = likes;
    }
    public List<Comment> getComments() {
        return comments;
    }
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
    // Methods omar

    public void addLike(Reaction likes) {
        this.likes.add(likes);
    }
    public void removeLike(Reaction likes) {
        this.likes.remove(likes);
    }
    public void addComment(Comment comment) {
        this.comments.add(comment);
    }
    public void editPost(String newContent) {
        this.content = newContent;
    }


}
