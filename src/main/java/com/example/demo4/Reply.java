package com.example.demo4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reply {
    private int replyId;
    protected static int count =0;
    public String content;
    public User author;
    private Date timestamp;
    private List<User> likes;

    public Reply(String replyId, String content, User author, Date timestamp) {
        this.content = content;
        count ++;
        this.replyId = count;
        this.author = author;
        this.timestamp = timestamp;
        this.likes = new ArrayList<>();
    }
 //getters
    public int getReplyId() {
        return replyId;
    }
    public static int getCount() {
        return count;
    }
    public String getContent() {
        return content;
    }
    public User getAuthor() {
        return author;
    }
    public Date getTimestamp() {
        return timestamp;
    }
    public List<User> getLikes() {
        return likes;
    }



    // setters
    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }
    public static void setCount(int count) {
        Reply.count = count;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public void setAuthor(User author) {
        this.author = author;
    }
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    public void setLikes(List<User> likes) {
        this.likes = likes;
    }




    // methods
    public void addLike(User user) {
        this.likes.add(user);
    }
    public void removeLike(User user) {
        this.likes.remove(user);
    }


    public void editReply(String newContent) {
        if(!getContent().equals("COMMENT IS DELETED")){
            setContent(newContent);
        }
    }

    public void deleteReply() {
        setContent("Reply IS DELETED");
    }
}

