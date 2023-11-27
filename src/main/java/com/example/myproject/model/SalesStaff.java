package com.example.myproject.model;
import javax.persistence.Entity;
//SaleStaff is like a factory that creates transactions
//forth, it 
@Entity
public class SalesStaff extends User {
    public void record_sales(int quantity, String merchandise) {
        // Logic to record sales
    }

    public void search_sale(String merchandise) {
        // Logic to search for a sale
    }

    public void search_history(String merchandise) {
        // Logic to search sales history
    }

    // Other fields and methods
}


