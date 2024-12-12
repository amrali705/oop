package com.example.demo4;

import com.google.gson.annotations.Expose;
import java.util.ArrayList;

public class Person {

    private int id;

    public String name;

    private ArrayList<Person> people;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}