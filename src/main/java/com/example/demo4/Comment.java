package com.example.demo4;

import java.util.Date;
import java.util.List;
public class Comment {
    private int comment_id;
    public String content;
    public String author;
    private Date timestamp;
    private List<User> likes;
    private List<Reply> replies;


    public Comment(String content, int comment_id, String author, Date timestamp, List<User> likes) {
        this.content = content;
        this.comment_id = comment_id;
        this.author = author;
        this.timestamp = timestamp;
        this.likes = likes;
    }


    public int getComment_id() {
        return comment_id;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public List<User> getLikes() {
        return likes;
    }

    public List<Reply> getReplies() {
        return replies;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public void setLikes(List<User> likes) {
        this.likes = likes;
    }

    public void setReplies(List<Reply> replies) {
        this.replies = replies;
    }




    public void addLike(User user) {
        likes.add(user);
    }

    public void editComment(String newContent) {
        this.content = newContent;
    }

    public void deleteComment() {
        System.out.println("Comment deleted");
    }
}






























