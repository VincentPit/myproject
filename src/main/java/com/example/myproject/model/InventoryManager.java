package com.example.myproject.model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class InventoryManager extends User {

    @PersistenceContext
    private EntityManager entityManager;

    // Assuming there's a list to store merchandise items
    private List<Merchandise> merchandiseList;

    // Constructor to initialize the InventoryManager with merchandise from the database
    public InventoryManager() {
        loadMerchandiseFromDatabase();
    }

    @Transactional
    public void loadMerchandiseFromDatabase() {
        //Use JPA EntityManager to retrieve merchandise from the database
        merchandiseList = entityManager.createQuery("SELECT m FROM Merchandise m", Merchandise.class)
                .getResultList();
    }

    public void importMerchandise(String name, double unitCost, double unitPrice, int quantity) {
        // Implement buy products functionality
        for (int i = 0; i < quantity; i++) {
            Merchandise merchandise = new Merchandise(name, unitCost, unitPrice);
            merchandiseList.add(merchandise);
            //Save the new merchandise to the database
            entityManager.persist(merchandise);
        }
    }

    public void viewAll() {
        for (Merchandise merchandise : merchandiseList) {
            System.out.println("ID: " + merchandise.getId() +
                    ", Name: " + merchandise.getName() +
                    ", Unit Cost: " + merchandise.getUnitCost() +
                    ", Unit Price: " + merchandise.getUnitPrice());
        }
    }

    //Additional methods for managing merchandise if needed
}
