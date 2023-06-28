package org.example.DependencyInversion.GoodExample;

public class MyPostgreSQLDatabaseConnection implements DatabaseConnection {
    public boolean authenticate(String username, String password) {
        // Code to authenticate the user using PostgreSQL database connection
        // ...
        return true;
    }
}
