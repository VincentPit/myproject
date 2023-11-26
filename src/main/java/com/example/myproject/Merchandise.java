package com.example.myproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Merchandise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double unit_cost;
    private double unit_price;

    public Merchandise(String name, double unit_cost, double unit_price) {
        this.name = name;
        this.unit_cost = unit_cost;
        this.unit_price = unit_price;
    }

}
