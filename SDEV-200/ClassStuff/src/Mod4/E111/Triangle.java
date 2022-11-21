package Mod4.E111;

public class Triangle extends GeometricObject{
    // side initialization
    double side1;
    double side2;
    double side3;

    // no-arg constructor
    Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    // three-args constructor
    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // getters
    // get side one
    public double getSide1() {
        return side1;
    }

    // get side two
    public double getSide2() {
        return side2;
    }

    // get side three
    public double getSide3() {
        return side3;
    }

    // get the perimeter of the triangle with three given sides
    public double getPerimeter() {
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }

    // get the area of the triangle with three given sides
    public double getArea() {
        double s = (getPerimeter() / 2);
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }


    // toString method to show all three sides of the triangle
    public String toString() {
        return "Triangle: \nside1 = " + side1 + "\nside2 = " + side2 + "\nside3 = " + side3;
    }
}
