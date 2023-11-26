package com.example.myproject;
import javax.persistence.Entity;


public class User {
    private String name;
    private String staffCode;

    public User(String name, String staffCode) {
        this.name = name;
        this.staffCode = staffCode;
    }
}
