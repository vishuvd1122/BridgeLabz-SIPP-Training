import java.util.Scanner;

public class FactorFinderWhile {
    public static void main(String[] args) {
        // Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is a positive integer
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " (excluding itself) are:");

            // Initialize counter to 1
            int counter = 1;

            // Use while loop to find factors
            while (counter < number) {
                if (number % counter == 0) {
                    System.out.println(counter);  // Print the factor
                }
                counter++;  // Increment counter
            }
        }

        // Close the scanner
        scanner.close();
    }
}
