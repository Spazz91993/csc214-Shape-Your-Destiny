package org.example;

public class IsoscelesRightTriangle extends RightTriangle {

    public IsoscelesRightTriangle(double side) {
        super(side, side);
    }

    @Override
    public String getShape() {
        return "Isosceles Right Triangle.";
    }
}