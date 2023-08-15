package org.example.OpenClose.GoodExample;

public class Triangle implements Shape{

    private double height;
    private double base;

    @Override
    public double calculateArea() {
        return height * base / 2;
    }
}
