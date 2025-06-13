import java.util.Scanner;

public class FizzBuzzWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the input is a positive integer
        if (number <= 0) {
            System.out.println("The number " + number + " is not a positive integer.");
        } else {
            int i = 1; // Counter starting from 1

            // Use while loop to iterate from 1 to number
            while (i <= number) {
                // Check for multiples of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i); // Print number if not divisible by 3 or 5
                }
                i++; // Increment counter
            }
        }

        // Close scanner
        scanner.close();
    }
}
