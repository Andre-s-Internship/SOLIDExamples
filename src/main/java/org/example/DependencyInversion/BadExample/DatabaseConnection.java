package org.example.DependencyInversion.BadExample;

public class DatabaseConnection {
    public boolean authenticate(String username, String password) {
        // Code to establish a database connection and perform authentication
        // ...
        return true;
    }
}
