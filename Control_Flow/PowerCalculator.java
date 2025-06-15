import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Get the base number
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();

        // Get the exponent/power
        System.out.print("Enter the power (non-negative integer): ");
        int power = scanner.nextInt();

        // Check for valid (non-negative) power
        if (power < 0) {
            System.out.println("Please enter a non-negative integer for the power.");
        } else {
            int result = 1;         // Result initialized to 1
            int counter = 0;        // Counter starts from 0

            // Loop till counter == power
            while (counter < power) {
                result *= number;   // Multiply result with number
                counter++;          // Increment counter
            }

            // Print the final result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        // Close scanner
        scanner.close();
    }
}
