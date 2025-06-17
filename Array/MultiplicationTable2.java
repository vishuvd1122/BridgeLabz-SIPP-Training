import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table from 6 to 9: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.err.println("Error: Please enter a positive number.");
            return;
        }

        int[] multiplicationResult = new int[4]; // Stores results for 6, 7, 8, 9

        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Display multiplication table
        System.out.println("Multiplication Table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
    }
}
