import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the input is a positive integer
        if (number <= 0) {
            System.out.println("The number " + number + " is not a positive integer.");
        } else {
            // Loop from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check for multiples of both 3 and 5 first
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);  // Print the number if not a multiple of 3 or 5
                }
            }
        }

        // Close the scanner
        scanner.close();
    }
}
