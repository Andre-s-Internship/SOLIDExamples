package org.example.DependencyInversion.GoodExample;

public class MySQLDatabaseConnection implements DatabaseConnection {
    public boolean authenticate(String username, String password) {
        // Code to authenticate the user using MySQL database connection
        // ...
        return true;
    }
}
