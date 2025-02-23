package org.example;

public class App {
  public static void main(String[] args) {
    Shapes[] shapes = new Shapes[6];
    shapes[0] = new Rectangle(5.0, 10.0);
    shapes[1] = new Square(4.0);
    shapes[2] = new RightTriangle(3.0, 4.0);
    shapes[3] = new IsoscelesRightTriangle(5.0);
    shapes[4] = new Circle(1.0);
    shapes[5] = new Rectangle(6.0, 8.0);

    for (Shapes shape : shapes) {
      System.out.println("Shape: " + shape.getShape());
      System.out.println("Area: " + shape.getArea());
      System.out.println("Perimeter: " + shape.getPerimeter());
      if (shape instanceof Polygon) {
        System.out.println("Number of sides: " + ((Polygon) shape).numberOfSides());
    }
      System.out.println();
  }
}
}