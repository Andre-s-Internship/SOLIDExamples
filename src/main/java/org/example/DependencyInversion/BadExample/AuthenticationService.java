package org.example.DependencyInversion.BadExample;

public class AuthenticationService {
    private DatabaseConnection databaseConnection;

    public AuthenticationService() {
        this.databaseConnection = new DatabaseConnection();
    }

    public boolean authenticate(String username, String password) {
        // Code to authenticate the user using the database connection
        return databaseConnection.authenticate(username, password);
    }
}
