package com.example.myproject;
import com.example.myproject.model.*;
import java.io.*;

public class App_Serial {
    public static void main(String[] args) {
        // Simulate the server initialization
        

        try {
            // Wait for the server thread to initialize

            // Simulate user creation
            User a = new User();
            
            // Serialize the User object
            serializeUser(a, "user.ser");

            // App logic continues after the server is initialized
            System.out.println("App logic continues...");

            // Deserialize the User object
            User deserializedUser = deserializeUser("user.ser");

            // Rest of your App logic
            System.out.println("Hello, " + deserializedUser.getName() + "! Age: " + deserializedUser.getAge());
        } catch (InterruptedException | IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Serialize User object to a file
    private static void serializeUser(User user, String filename) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(user);
        }
    }

    // Deserialize User object from a file
    private static User deserializeUser(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            return (User) inputStream.readObject();
        }
    }
}
