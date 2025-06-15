import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2. Get input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;

        // 4. Use while loop to sum the digits
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }

        // 6. Check if original number is divisible by sum of digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Harshad Number.");
        }

        scanner.close();
    }
}
