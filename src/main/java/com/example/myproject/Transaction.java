package com.example.myproject;
//shit
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime time;
    private double amount;

    @ManyToOne
    private Merchandise merchandise;

    public Transaction(LocalDateTime time, double amount, Merchandise merchandise) {
        this.time = time;
        this.amount = amount;
        this.merchandise = merchandise;
    }

}
