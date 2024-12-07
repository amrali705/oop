package com.example.demo4;

public class Reaction{
    private int  reaction_id;
    private String type;
    private User user;
    // Constructor
    public Reaction(int  reaction_id, String type, User user) {
        this.reaction_id = reaction_id;
        this.type = type;
        this.user = user;


    }
    public int  getReactionId() {
        return reaction_id;
    }

    public void setReactionId(int  reaction_id) {
        this.reaction_id = reaction_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public void changeReactionType(String newType) {
        this.type = newType;
    }
}
