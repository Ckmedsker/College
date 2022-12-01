package Mod6;

import java.util.Scanner;

public class Exercise_19_5 {
    public static void main(String[] args) {
		// Clears the terminal screen
		System.out.printf("\033\143");

        Scanner listInput = new Scanner(System.in);
        System.out.printf("Enter 10 integers seperated by spaces!: ");
        Integer[] numbList = new Integer[10];
        for(int index = 0; index < 10; index++) {
            numbList[index] = listInput.nextInt();
        }
        listInput.close();
        System.out.println("The max number in the list is: " + max(numbList));
    }
    public static <E extends Comparable<E>> E max (E[] list) {
        // sets the initial max to the first number in the list
        E max = list[0];
        // compares each number to the max, if it is higher, the new max is the given number
        for (int index = 1; index < list.length; index++) {
            E element = list[index];
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}