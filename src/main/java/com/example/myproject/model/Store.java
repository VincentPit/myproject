package com.example.myproject.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<User> users;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Transaction> transactions;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Merchandise> inventory;

    public Store() {
        this.users = new ArrayList<>();
        this.transactions = new ArrayList<>();
        this.inventory = new ArrayList<>();
    }
//test
}
