package org.example;

public class IsocelesRightTriangle extends RightTriangle {
    public IsocelesRightTriangle(double side) {
        super(side, side); // Call RightTriangle constructor with both sides equal
    }

    public int numberOfSides() {
        return super.numberOfSides(); // An isosceles right triangle has 3 sides
    }

    @Override
    public double getArea() {
        return super.getArea(); // Area is 0.5 * side^2, but RightTriangle already calculates this
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter(); // Perimeter is side + side + hypotenuse, but RightTriangle already calculates this
    }

    public double getSide() {
        return getBase(); // Since base and height are the same in an isosceles right triangle
    }

    public void setSide(double side) {
        setBase(side); // Set both base and height to the same value
        setHeight(side);
    }
}
