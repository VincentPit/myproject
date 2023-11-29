package com.example.myproject;

import com.example.myproject.model.H2DatabaseServer;
import com.example.myproject.model.*;
import java.util.concurrent.CountDownLatch;

public class App_Database {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(1);

        Thread serverThread = new Thread(() -> {
            try {
                System.out.println("Before starting H2 Database Server");
                H2DatabaseServer.startServer();

                System.out.println("After starting H2 Database Server");
                latch.countDown(); // Signal that the server has been initialized
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        serverThread.start();

        try {
            // Wait for the server thread to initialize the server
            latch.await();

            User a = new User();
            // App logic continues after the server is initialized
            System.out.println("App logic continues...");

            // Rest of your App.java logic
            System.out.println("Hello World!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
