import java.util.Scanner;

public class SumUntilNegativeOrZero {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        int sum = 0;  // Variable to store the sum

        // Infinite loop using while(true)
        while (true) {
            System.out.print("Enter a positive number (0 or negative to stop): ");
            int number = scanner.nextInt();  // Read the user input

            // Check if number is 0 or negative
            if (number <= 0) {
                break;  // Exit the loop
            }

            // Add the number to the sum
            sum += number;
        }

        // Print the final sum
        System.out.println("The total sum is: " + sum);
        scanner.close();
    }
}
