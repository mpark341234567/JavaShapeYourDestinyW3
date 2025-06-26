package org.example;

public class RightTriangle extends Shape {
    private double base;
    private double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public int numberOfSides() {
        return 3; // A triangle has 3 sides
    }

    @Override
    public double getArea() { 
        return 0.5 * base * height;//.5 x b h
    }

    @Override
    public double getPerimeter() {
        double hypotenuse = Math.sqrt(base * base + height * height);//pythagorean theorem
        return base + height + hypotenuse;// b + h + hypot
    }
    
    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
