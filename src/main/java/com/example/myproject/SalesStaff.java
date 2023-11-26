<<<<<<< HEAD
// src/main/java/com/example/inventorymanagement/SalesStaff.java
package com.example.myproject;

public class SalesStaff extends User {
    // Constructor inheriting from User

    public void recordSales(int quantity, String merchandise) {
        // Implement record sales functionality
    }

    public void searchSale(String inventory) {
        // Implement search sale functionality
    }

    public void searchHistory(String merchandise) {
        // Implement search history functionality
    }
}
=======
package com.example.myproject;
import javax.persistence.Entity;

@Entity
public class SalesStaff extends User {
    public void record_sales(int quantity, String merchandise) {
        // Logic to record sales
    }

    public void search_sale(String inventory) {
        // Logic to search for a sale
    }

    public void search_history(String merchandise) {
        // Logic to search sales history
    }

    // Other fields and methods
}

>>>>>>> 860ecb2 (first commit)
