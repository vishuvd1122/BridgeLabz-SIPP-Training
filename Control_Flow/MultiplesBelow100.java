import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter a positive number less than 100: ");
        int number = scanner.nextInt();

        // Validate if the number is a positive integer less than 100
        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input. Number must be a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100:");

            int counter = number - 1;  // Initialize counter

            // Use while loop to find and print all multiples
            while (counter > 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }

        // Close the scanner
        scanner.close();
    }
}
