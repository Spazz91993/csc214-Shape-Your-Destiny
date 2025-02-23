package org.example;

public class Rectangle extends Shapes implements Polygon {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width cannot be negative.");
        }
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String getShape() {
        return "Rectangle.";
    }
    @Override
    public int numberOfSides() {
        return 4;
    }
}