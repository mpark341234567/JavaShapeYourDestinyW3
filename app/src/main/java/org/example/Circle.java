package org.example;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {//constructor
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;//pi r squared
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;// 2 pi r
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}
