package com.example.demo4;

import java.util.Date;
import java.util.List;
public class Comment {
    private int comment_id;
    protected static int count =0;
    public String content;
    public User author;
    private final Date timestamp;
    private List<User> likes;
    private List<Reply> replies;


    public Comment(String content, User author, Date timestamp, List<User> likes) {
        this.content = content;
        count ++;
        this.comment_id = count;
        this.author = author;
        this.timestamp = timestamp;
        this.likes = likes;
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
    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }
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

    public void editComment(String newContent) {
        if(!getContent().equals("COMMENT IS DELETED")){
            setContent(newContent);
        }
    }

    public void deleteComment() {
        setContent("COMMENT IS DELETED");
    }
}






























