import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Variable to store the greatest factor
        int greatestFactor = 1;

        // Start checking from number - 1 down to 1
        int counter = number - 1;

        // Loop to find the greatest factor other than the number itself
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter; // Found the greatest factor
                break; // Exit the loop
            }
            counter--;
        }

        // Print the result
        System.out.println("The greatest factor of " + number + " (other than itself) is: " + greatestFactor);

        // Close the scanner
        scanner.close();
    }
}
