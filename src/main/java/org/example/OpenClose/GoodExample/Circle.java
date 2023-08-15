package org.example.OpenClose.GoodExample;

public class Circle implements Shape{

    private double radius;

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
