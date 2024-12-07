package com.example.demo4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Comment {
    private final int comment_id;
    protected static int count =0;
    public String content;
    public User author;
    private final Date timestamp;
    private List<User> likes;
    private List<Reply> replies;


    public Comment(String content, User author, Date timestamp) {
        this.content = content;
        count ++;
        this.comment_id = count;
        this.author = author;
        this.timestamp = timestamp;
        this.likes = new ArrayList<>();
        this.replies = new ArrayList<>();
    }

    // getters
    public int getComment_id() {
        return comment_id;
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

    public List<Reply> getReplies() {
        return replies;
    }

    // setters
    public void setContent(String content) {
        this.content = content;
    }
    public void setAuthor(User author) {
        this.author = author;
    }
    public void setLikes(List<User> likes) {
        this.likes = likes;
    }
    public void setReplies(List<Reply> replies) {
        this.replies = replies;
    }

    // methods
    public void addLike(User user) {
        likes.add(user);
    }
    public void addReply (String content, User author, Date timestamp){
        Reply reply =new Reply( content, author, timestamp);
        replies.add(reply);
    }

    public void removeLike(User user) {
        this.likes.remove(user);
    }

    public void editComment(String newContent) {
        if(!getContent().equals("COMMENT IS DELETED")){
            setContent(newContent);
        }
    }


    public void deleteComment() {
        setContent("COMMENT IS DELETED");
    }
}






























