package org.example.DependencyInversion.GoodExample;

    public class AuthenticationService {
        private DatabaseConnection databaseConnection;

        public AuthenticationService(DatabaseConnection databaseConnection) {
            this.databaseConnection = databaseConnection;
        }

        public boolean authenticate(String username, String password) {
            // Code to authenticate the user using the provided database connection
            return databaseConnection.authenticate(username, password);
        }

}