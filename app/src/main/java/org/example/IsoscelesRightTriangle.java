package org.example;

public class IsoscelesRightTriangle extends RightTriangle {

    public IsoscelesRightTriangle(double side) {
        super(side, side);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        double hypotenuse = Math.sqrt(2) * super.getPerimeter();
        return super.getPerimeter();
    }

    @Override
    public String getShape() {
        return "Isosceles Right Triangle.";
    }
}