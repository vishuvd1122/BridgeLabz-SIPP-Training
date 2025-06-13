import java.util.Scanner;

public class SumNaturalNumbersComparison {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Check if the number is a natural number (n >= 1)
        if (n >= 1) {
            // Compute sum using formula: n * (n + 1) / 2
            int formulaSum = n * (n + 1) / 2;

            // Compute sum using while loop
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }

            // Print both results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);

            // Compare the two results
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct and match!");
            } else {
                System.out.println("The computations do not match.");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }

        // Close the scanner
        scanner.close();
    }
}
