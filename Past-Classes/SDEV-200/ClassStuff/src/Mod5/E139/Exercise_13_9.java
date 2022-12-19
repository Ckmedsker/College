package Mod5.E139;

public class Exercise_13_9 {
    
  public static void main(String[] args) {
  // Clears the terminal screen
  System.out.printf("\033\143");

  // tests with three different sets of arguments

  // one-argument (radius = 3) test
  Circle circle1 = new Circle(3);
  System.out.println("The radius of circle1 is " + circle1.getRadius());

  // one-argument (radius = 5) test
  Circle circle2 = new Circle(5);
  System.out.println("The radius of circle2 is " + circle2.getRadius());

  // three-arguments (radius, color, filled) test
  Circle circle3 = new Circle(5, "yellow", true);
  System.out.println("The radius of circle3 is " + circle3.getRadius());


  // comparing circle 1 to circle 2
  System.out.println("Circle 1 is equal to Circle 2: " + (circle1.equals(circle2)));

  // comparing circle 2 to circle 3
  System.out.println("Circle 2 is equal to Circle 3: " + (circle2.equals(circle3)));
  }
}