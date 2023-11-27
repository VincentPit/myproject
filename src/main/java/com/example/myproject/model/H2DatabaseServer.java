package com.example.myproject.model;

import org.h2.tools.Server;

public class H2DatabaseServer {

    public static void startServer() {
        try {
            Server server = Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9092", "-trace").start();
            System.out.println("H2 Database Server is running on port " + server.getPort());

            // Optionally start the H2 web console
            // Open your web browser and navigate to http://localhost:8082
            Server.createWebServer("-web", "-webAllowOthers", "-webPort", "8082").start();

            System.out.println("H2 Web Console is running on port 8082");

            // Shutdown the server when the program exits
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                System.out.println("Shutting down H2 Database Server");
                server.stop();
            }));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
