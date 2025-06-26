package org.example;

public class Square extends Rectangle{
    public Square(double side) {
        super(side, side); // Call Rectangle constructor with both sides equal
    }

    @Override
    public double getArea() {
        return super.getArea(); // Area is side^2, but Rectangle already calculates this
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter(); // Perimeter is 4 * side, but Rectangle already calculates this
    }

    public double getSide() {
        return getLength(); // Since length and width are the same in a square
    }

    public void setSide(double side) {
        setLength(side); // Set both length and width to the same value
        setWidth(side);
    }
}
