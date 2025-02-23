package org.example;

public class App {
  public static void main(String[] args) {
    Shapes myCircle = new Circle(5.0);
    Shapes myRectangle = new Rectangle(4.0, 6.0);
    Shapes myRightTriangle = new RightTriangle(3.0, 4.0);

    printShapeDetails(myCircle);
    printShapeDetails(myRectangle);
    printShapeDetails(myRightTriangle);
}

public static void printShapeDetails(Shapes shape) {
    System.out.println("Shape: " + shape.getShape());
    System.out.println("Area: " + shape.getArea());
    System.out.println("Perimeter: " + shape.getPerimeter());
    System.out.println();
}
}