import java.util.Scanner;

public class ArmstrongChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get user input
        System.out.print("Enter a number to check for Armstrong: ");
        int number = scanner.nextInt();

        // Step 2: Store original number and initialize sum to 0
        int originalNumber = number;
        int sum = 0;

        // Step 3: Use while loop to process digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10;         // Step 4: Get last digit
            sum += Math.pow(digit, 3);               // Cube the digit and add to sum
            originalNumber = originalNumber / 10;    // Step 5: Remove last digit
        }

        // Step 6: Compare sum with original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }

        scanner.close();
    }
}
