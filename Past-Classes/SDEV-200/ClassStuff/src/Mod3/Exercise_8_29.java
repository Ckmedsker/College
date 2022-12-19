package Mod3;
import java.util.Scanner;
import java.util.Arrays;

public class Exercise_8_29 {
    public static void main(String[] args) {
		// clears the terminal screen
		System.out.printf("\033\143");


        // getting the first user input
        Scanner list1Input = new Scanner(System.in);
        System.out.printf("Enter list1: ");
        String list1 = list1Input.nextLine();

        // getting the second user input
        Scanner list2Input = new Scanner(System.in);
        System.out.printf("Enter list2: ");
        String list2 = list2Input.nextLine();


        // initializing all arrays
        String[] list1String = list1.split(" ");
        int[] temp1 = new int[9];
        int[][] m1 = new int[3][3];
        String[] list2String = list2.split(" ");
        int[] temp2 = new int[9];
        int[][] m2 = new int[3][3];


        // Making the first two-dimensional array
        for (int i = 0; i < 9; i++) {
            temp1[i] = Integer.parseInt(list1String[i]);
        }
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 ; j++) {
                m1[i][j] = temp1[k];
                k++;
            }
        }

        // Making the second two-dimensional array
        for (int i = 0; i < 9; i++) {
            temp2[i] = Integer.parseInt(list2String[i]);
        }
        int l = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 ; j++) {
                m2[i][j] = temp2[l];
                l++;
            }
        }

        // sorting the arrays so they will match even if the nested arrays are in different orders
        for (int i = 0; i < 3; i++) {
            Arrays.sort(m1[i]);
            Arrays.sort(m2[i]);
        }

        // checking if they two two-dimensional arrays match, and telling the user
        if (equals(m1, m2)) {
            System.out.println("The two arrays are identical");
        }
        else {
            System.out.println("The two arrays are not identical");
        }
       
        // closing the input
        list1Input.close();
        list2Input.close();
    }

    public static boolean equals(int[][] m1, int[][] m2) {

        // if a single element is not equal to another element, it is automatically rejected, otherwise it is accepted
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
