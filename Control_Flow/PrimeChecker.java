import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get user input
        System.out.print("Enter a number to check for prime: ");
        int number = scanner.nextInt();

        // Step 2: Check only for numbers greater than 1
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            // Step 3: Loop from 2 to number - 1
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;  // Found a divisor
                    break;            // No need to check further
                }
            }
        }

        // Step 4: Output result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }

        scanner.close();
    }
}
