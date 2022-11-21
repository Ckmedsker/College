package Mod4.E98;

public class Exercise_9_8 {
  public static void main(String[] args) {
    // clears the terminal screen
    System.out.printf("\033\143");


    // setting the constants for speed values
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    // creating new fan objects
    Fan fan1 = new Fan();
    Fan fan2 = new Fan();
    Fan fan3 = new Fan();

    // three examples of how the fan string would with different inputs

    // first example
    fan2.setSpeed(SLOW);
    fan1.setRadius(5);
    fan1.setColor("red");
    fan1.turnOn(false);

    // second example
    fan2.setSpeed(MEDIUM);
    fan2.setRadius(5);
    fan2.setColor("yellow");
    fan2.turnOn(true);

    // third example
    fan3.setSpeed(FAST);
    fan3.setRadius(2.5);
    fan3.setColor("green");
    fan3.turnOn(true);

    System.out.println(fan1.toString());
    System.out.println(fan2.toString());
    System.out.println(fan3.toString());
  }
}