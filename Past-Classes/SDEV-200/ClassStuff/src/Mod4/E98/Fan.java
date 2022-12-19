package Mod4.E98;

public class Fan {
    // speed constants
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    // other variable initialization
    private int speed;
    private boolean on;
    private double radius;
    String color;

    // no-arg constructor that sets defaults
    Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    // mutators

    // set a new speed
    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    // toggle off or on
    public void turnOn(boolean onOrOff) {
        if (onOrOff) {
            on = true;
        } else {
            on = false;
        }
    }

    // set a new radius
    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    // set a new color
    public void setColor(String newColor) {
        color = newColor;
    }

    // accessors

    // returning the speed
    public String getSpeed() {
        String speedString = "";
        switch (speed) {
            case 1:
                speedString = "SLOW";
                break;
            case 2:
                speedString = "MEDIUM";
                break;
            case 3:
                speedString = "FAST";
        }
        return speedString;
    }

    // returning on or off
    public boolean OnOrOff() {
        return on;
    }

    // returning the radius
    public double getRadius() {
        return radius;
    }

    // returning the color
    public String getColor() {
        return color;
    }

    // returning the fan string depending on the fan on or off state
    public String toString() {
        String fanString = "";
        String speedString = getSpeed();
        if (on == true) {
            fanString = ("The fan is on.\n" + "Fan Color: " + color + "\n" + "Fan Radius: " + radius + "\n"
                    + "Fan Speed: " + speedString + "\n");
        } else if (on == false) {
            fanString = ("The fan is off.\n" + "Fan Color: " + color + "\n" + "Fan Radius: " + radius + "\n");
        }
        return fanString;
    }
}
