package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  @Test
  public void testCircleZeroSetup() {
      Shapes circle = new Circle(5.0);
      assertNotNull(circle);
  }

  @Test
  public void testRectangleZeroSetup() {
      Shapes rectangle = new Rectangle(4.0, 6.0);
      assertNotNull(rectangle);
  }

  @Test
  public void testRightTriangleZeroSetup() {
      Shapes triangle = new RightTriangle(3.0, 4.0);
      assertNotNull(triangle);
  }

  @Test
  public void testCircleSingleObject() {
      Shapes circle = new Circle(5.0);
      assertEquals("Circle.", circle.getShape());
  }

  @Test
  public void testRectangleSingleObject() {
      Shapes rectangle = new Rectangle(4.0, 6.0);
      assertEquals("Rectangle.", rectangle.getShape());
  }

  @Test
  public void testRightTriangleSingleObject() {
      Shapes triangle = new RightTriangle(3.0, 4.0);
      assertEquals("Right Triangle.", triangle.getShape());
  }

  @Test
  public void testMultipleCircles() {
      Shapes circle1 = new Circle(5.0);
      Shapes circle2 = new Circle(10.0);
      assertNotEquals(circle1.getArea(), circle2.getArea());
  }

  @Test
  public void testMultipleRectangles() {
      Shapes rectangle1 = new Rectangle(4.0, 6.0);
      Shapes rectangle2 = new Rectangle(2.0, 3.0);
      assertNotEquals(rectangle1.getArea(), rectangle2.getArea());
  }

  @Test
  public void testMultipleTriangles() {
      Shapes triangle1 = new RightTriangle(3.0, 4.0);
      Shapes triangle2 = new RightTriangle(6.0, 8.0);
      assertNotEquals(triangle1.getArea(), triangle2.getArea());
  }

  @Test
  public void testCircleBoundary() {
      Shapes circle = new Circle(0.0);  // Minimum boundary (zero radius)
      assertEquals(0.0, circle.getArea(), 0.0001);
      assertEquals(0.0, circle.getPerimeter(), 0.0001);
  }

  @Test
  public void testRectangleBoundary() {
      Shapes rectangle = new Rectangle(0.0, 5.0);  // Zero length
      assertEquals(0.0, rectangle.getArea(), 0.0001);
      assertEquals(10.0, rectangle.getPerimeter(), 0.0001);
  }

  @Test
  public void testRightTriangleBoundary() {
      Shapes triangle = new RightTriangle(0.0, 5.0);  // Zero base
      assertEquals(0.0, triangle.getArea(), 0.0001);
      assertEquals(10.0, triangle.getPerimeter(), 0.0001);
  }

  @Test
  public void testCircleInvalidRadius() {
      assertThrows(IllegalArgumentException.class, () -> new Circle(-5.0));
  }

  @Test
  public void testRectangleInvalidDimensions() {
      assertThrows(IllegalArgumentException.class, () -> new Rectangle(-4.0, 6.0));
  }

  @Test
  public void testRightTriangleInvalidBase() {
      assertThrows(IllegalArgumentException.class, () -> new RightTriangle(-3.0, 4.0));
  }

  @Test
  public void testCircleExpectedResults() {
      Shapes circle = new Circle(5.0);
      assertEquals(78.53981633974483, circle.getArea(), 0.0001);
      assertEquals(31.41592653589793, circle.getPerimeter(), 0.0001);
  }

  @Test
  public void testRectangleExpectedResults() {
      Shapes rectangle = new Rectangle(4.0, 6.0);
      assertEquals(24.0, rectangle.getArea(), 0.0001); // Area of rectangle 4x6
      assertEquals(20.0, rectangle.getPerimeter(), 0.0001); // Perimeter of rectangle 4x6
  }

  @Test
  public void testRightTriangleExpectedResults() {
      Shapes triangle = new RightTriangle(3.0, 4.0);
      assertEquals(6.0, triangle.getArea(), 0.0001); // Area of right triangle 3x4
      assertEquals(12.0, triangle.getPerimeter(), 0.0001); // Perimeter of right triangle 3x4
  }

  @Test
  public void testSimpleCircle() {
      Shapes circle = new Circle(1.0);
      assertEquals(3.141592653589793, circle.getArea(), 0.0001); // Simple area check for radius 1
      assertEquals(6.283185307179586, circle.getPerimeter(), 0.0001); // Simple perimeter check for radius 1
  }

  @Test
  public void testSimpleRectangle() {
      Shapes rectangle = new Rectangle(1.0, 1.0);  // Simple 1x1 rectangle
      assertEquals(1.0, rectangle.getArea(), 0.0001);
      assertEquals(4.0, rectangle.getPerimeter(), 0.0001);
  }

  @Test
  public void testSimpleRightTriangle() {
      Shapes triangle = new RightTriangle(3.0, 4.0);  // Simple right triangle 3x4
      assertEquals(6.0, triangle.getArea(), 0.0001);
      assertEquals(12.0, triangle.getPerimeter(), 0.0001);
  }
}
