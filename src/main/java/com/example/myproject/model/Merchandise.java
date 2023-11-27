package com.example.myproject.model;

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
    private double unitCost;
    private double unitPrice;

    public Merchandise() {
        // Required by some JPA providers.
    }

    public Merchandise(String name, double unitCost, double unitPrice) {
        this.name = name;
        this.unitCost = unitCost;
        this.unitPrice = unitPrice;
    }

    // Getters and setters for private attributes
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    // Add setters if needed
}
