package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  // You can write your unit tests here.
  @Test
  void appWorks() {
    assertEquals(true, true);
  }
  @Test
  void CircleAreaWorks() {
    Circle circle = new Circle(5);
    assertEquals(78.53981634, circle.getArea(), 0.0001);
  }
  @Test
  void CirclePerimeterWorks() {
    Circle circle = new Circle(5);
    assertEquals(31.41592654, circle.getPerimeter(), 0.0001);
  }
  @Test
  void RectangleAreaWorks() {
    Rectangle rectangle = new Rectangle(4, 5);
    assertEquals(20, rectangle.getArea(), 0.0001);
  }
  @Test
  void RectanglePerimeterWorks() {  
    Rectangle rectangle = new Rectangle(4, 5);
    assertEquals(18, rectangle.getPerimeter(), 0.0001);
  }
  @Test
  void RightTriangleAreaWorks() {
    RightTriangle triangle = new RightTriangle(3, 4);
    assertEquals(6, triangle.getArea(), 0.0001);
  }
  @Test
  void RightTrianglePerimeterWorks() {
    RightTriangle triangle = new RightTriangle(3, 4);
    assertEquals(12, triangle.getPerimeter(), 0.0001);
  }
}
