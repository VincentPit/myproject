package com.example.myproject.model;
import javax.persistence.Entity;
import java.io.Serializable;
//SaleStaff is like a factory that creates transactions
//forth, it 
@Entity
public class SalesStaff extends User implements Serializable {
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


