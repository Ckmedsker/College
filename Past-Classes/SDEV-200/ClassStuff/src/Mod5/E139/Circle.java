package Mod5.E139;

    public class Circle extends GeometricObject implements Comparable<Circle> {

      private double radius;

      public Circle() {
      }

      public Circle(double radius) {
        this.radius = radius;
      }

      public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
      }

      /** Return radius */
      public double getRadius() {
        return radius;
      }

      /** Set a new radius */
      public void setRadius(double radius) {
        this.radius = radius;
      }

      /** Return area */
      public double getArea() {
        double area = radius * radius * Math.PI;
        return area;
      }

      /** Return diameter */
      public double getDiameter() {
        double diameter = 2 * radius;
        return diameter;
      }

      /** Return perimeter */
      public double getPerimeter() {
        double perimeter = 2 * radius * Math.PI;
        return perimeter;
      }

      @Override
      public boolean equals(Object obj) {
        if (compareTo((Circle) obj) == 1)
          return true;
        else
          return false;
      }

      // comparable
      public int compareTo(Circle circle) {
        if (circle.radius == this.radius)
            return 1;
        else
            return 0;
      }

      /** Print the circle info */
      public void printCircle() {
        String printCircleString = "The circle is created " + getDateCreated() + " and the radius is " + radius;
        System.out.println(printCircleString);
      }
  }
