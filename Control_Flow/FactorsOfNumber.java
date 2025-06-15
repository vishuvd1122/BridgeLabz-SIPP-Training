import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the input is a positive integer
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " (excluding itself) are:");

            // Loop from 1 to number - 1
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

        // Close the scanner
        scanner.close();
    }
}
