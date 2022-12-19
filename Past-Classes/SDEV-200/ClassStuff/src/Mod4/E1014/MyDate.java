package Mod4.E1014;

import java.util.GregorianCalendar;

public class MyDate {

    // year, month and day variable initialization
    int year;
    int month;
    int day;


    // no-arg, one argument, and three arguments constructors

    // current date no-arg constructor
    MyDate() {
        // using the gregorian calendar to get the current values for each year, month and day values
        GregorianCalendar date = new GregorianCalendar();
        year = date.get(GregorianCalendar.YEAR);
        month = date.get(GregorianCalendar.MONTH);
        day = date.get(GregorianCalendar.DAY_OF_MONTH);
    }

    // epoch time one argument constructor 
    MyDate(long milliseconds) {
        // runs setDate as not to have code redundancy
        setDate(milliseconds);
    }

    // specified year month and date (three arguments) constructor
    MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }



    // getters for year, month and date

    // year getter
    public int getYear() {
        return year;
    }

    // year getter
    public int getMonth() {
        return month;
    }

    // year getter
    public int getDay() {
        return day;
    }

    // setter for the epoch date
    public void setDate(long milliseconds) {
        // takes the given elapsedTime and passes it through to date
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(milliseconds);
        year = date.get(GregorianCalendar.YEAR);
        month = date.get(GregorianCalendar.MONTH);
        day = date.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
