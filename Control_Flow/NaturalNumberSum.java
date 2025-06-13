import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Check if the input is an integer
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt(); // Read the integer input

            // Check if the number is a natural number (1, 2, 3, ...)
            if (number >= 1) {
                // Calculate the sum of first 'n' natural numbers using the given formula
                int sum = number * (number + 1) / 2;
                System.out.println("The sum of " + number + " natural numbers is " + sum);
            } else {
                // If number is less than 1, it's not a natural number
                System.out.println("The number " + number + " is not a natural number");
            }

        } else {
            // If input is not a valid integer
            System.out.println("Invalid input. Please enter an integer.");
        }
        scanner.close();
    }
}
