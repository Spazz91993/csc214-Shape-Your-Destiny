package org.example;

public class RightTriangle extends Shapes implements Polygon {
    private double base;
    private double height;

    public RightTriangle(double base, double height) {
        if (base < 0 || height < 0) {
            throw new IllegalArgumentException("Base and height cannot be negative.");
        }
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public double getPerimeter() {
        double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse; 
    }

    @Override
    public String getShape() {
        return "Right Triangle.";
    }
    @Override
    public int numberOfSides() {
        return 3;
    }
}