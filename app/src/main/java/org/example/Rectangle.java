package org.example;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public int numberOfSides() {
        return 4; // A rectangle has 4 sides
    }

    @Override
    public double getArea() { // l x w
        return length * width;
    }

    @Override
    public double getPerimeter() { // 2l + 2w
        return 2 * (length + width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
}
