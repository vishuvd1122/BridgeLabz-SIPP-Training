import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get base number from user
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();

        // Get exponent (power) from user
        System.out.print("Enter the power (non-negative integer): ");
        int power = scanner.nextInt();

        // Initialize result as 1 (anything raised to power 0 is 1)
        int result = 1;

        // Compute power using for loop
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Display the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}
