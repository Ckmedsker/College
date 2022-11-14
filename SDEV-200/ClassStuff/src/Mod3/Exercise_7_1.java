package Mod3;
import java.util.Scanner;
import java.util.Arrays;

public class Exercise_7_1 {
    public static void main(String[] args) {
		// clears the terminal screen
		System.out.printf("\033\143");

        // gets the number of students
        Scanner numberOfStudentsInput = new Scanner(System.in);
        System.out.printf("Enter the number of students: ");
        int numberOfStudents = numberOfStudentsInput.nextInt();

        // takes the number of students and asks for those many inputs
        Scanner studentScoresInput = new Scanner(System.in);
        System.out.printf("Enter %d scores: ", numberOfStudents);
        String studentScores = studentScoresInput.nextLine();
        
        // initializes all three arrays used, and gets the first list's length
        String[] studentScoresStrings = studentScores.split(" ");
        int studentScoresLength = studentScoresStrings.length;
        int[] studentScoresInt = new int [studentScoresLength];
        int[] studentScoresSort = new int [studentScoresLength];

        // for loop to convert the String array into two int Arrays, one for comparison and one to get the max
        for (int i = 0; i < studentScoresLength; i++) {
            studentScoresInt[i] = Integer.parseInt(studentScoresStrings[i]);
            studentScoresSort[i] = Integer.parseInt(studentScoresStrings[i]);
        }

        // sort the array to get the max number in it
        Arrays.sort(studentScoresSort);

        // gets the last element, which is the max score
        int studentMaxScore = studentScoresSort[studentScoresLength - 1];

        // for loop for all of the scores
        for (int i = 0; i < studentScoresLength; i++) {
            String studentGrade;
            if (studentScoresInt[i] >= studentMaxScore - 10) {
                studentGrade = "A";}
            else if (studentScoresInt[i] >= studentMaxScore - 20) {
                studentGrade = "B";}
            else if (studentScoresInt[i] >= studentMaxScore - 30) {
                studentGrade = "C";}
            else if (studentScoresInt[i] >= studentMaxScore - 40) {
                studentGrade = "D";}
            else {
                studentGrade = "F";}

            // prints a formatted string with the index for the student number, the score the student recieved, and the letter grade
            System.out.printf("Student %d score is %d and grade is %s\n", i, studentScoresInt[i], studentGrade);
        }
        
        // closing inputs
        numberOfStudentsInput.close();
        studentScoresInput.close();
    }
}
