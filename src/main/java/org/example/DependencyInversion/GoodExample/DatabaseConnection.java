package org.example.DependencyInversion.GoodExample;

public interface DatabaseConnection {
    boolean authenticate(String username, String password);

}