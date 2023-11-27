package com.example.myproject;

//test2
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private Long id;

    private String name;
    private String staffCode;

    public void set_name(String name) {
        this.name = name;
    }

    public String get_name() {
        return name;
    }

    public String get_staff_code() {
        return staffCode;
    }

    // Other fields and methods
}
