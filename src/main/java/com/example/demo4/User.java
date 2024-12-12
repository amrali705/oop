package com.example.demo4;

import javafx.scene.control.DatePicker;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class User {
    private final int id;
    private static int cont =0;
    public String name;
    private String email;
    private String password;
    private Date birthdate;
    private final ArrayList<User> friends ;
    private final ArrayList<Post>posts;
    private String bio;


    private transient Scanner input = new Scanner(System.in);


    public User(String name, String email, String password, Date birthdate) {
        cont++;
        this.id=cont;
        this.name = name;
        this.email = email;
        this.password = password;
        this.birthdate = birthdate;
        this.friends = new ArrayList<>();
        this.posts= new ArrayList<>();
    }

    public String getBio() {
        return bio;
    }
    public void setBio(String bio) {
        this.bio = bio;
    }
    public String getName() {
        return name;
    }
    private void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Date getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    public ArrayList<Post> getPosts() {
        return posts;
    }
    public ArrayList<User> getFriends() {
        return friends;
    }


    protected void  add_friend (User friend ){
        if (!friends.contains(friend)) friends.add(friend);
    }
    public void  remove_friend (User friend ){
        friends.remove(friend);
    }
    public void  edit_Profile (String name,String bio){
        setName(name);
        setBio(bio);
    }
    public boolean check_login(String email , String password){
        return (getEmail().equals(email) && getPassword().equals(password));
    }
    public void make_post ( User author, Date time){
        String content = input.next();
        Post post = new Post(content,author,time);
        posts.add(post);
    }
    public Post get_post (int num) {
        if (num >= 0 && num < posts.size()) {
            return posts.get(num);
        }
        throw new IndexOutOfBoundsException("Invalid post index.");
    }
    public void make_friend_Request(User user,User friend_Request_to){
        if (!friends.contains(friend_Request_to)) {
            Friend_Request friendRequest = new Friend_Request(user, friend_Request_to);
        }
    }




}
