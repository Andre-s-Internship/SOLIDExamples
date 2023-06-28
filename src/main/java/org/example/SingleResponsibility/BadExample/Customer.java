package org.example.SingleResponsibility.BadExample;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String email;
    private ArrayList<Object> cart;

    // ... constructor, getters, and setters

    public void addCustomer() {
        // Code to create a customer and add it to the database
    }

    public void sendEmail(String message) {
        // Code to email the customer
    }

    public void addToCart(Customer customer, Object product){
        // Code to add a new product to customer's cart
    }
}

