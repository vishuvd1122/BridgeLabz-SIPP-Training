import java.util.Scanner;

public class LargestTwoDigitsLimited {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Prepare to store digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Step 3–6: Extract digits and store in array (limit to 10 digits)
        while (number != 0) {
            int digit = number % 10;
            digits[index++] = digit;
            number /= 10;

            if (index == maxDigit) {
                System.out.println("Only the first 10 digits were considered.");
                break;
            }
        }

        // Step 7: Initialize largest and second largest
        int largest = -1;
        int secondLargest = -1;

        // Step 8: Find largest and second largest
        for (int i = 0; i < index; i++) {
            int digit = digits[i];
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        // Step 9: Display output
        System.out.print("Digits stored: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.err.println("Second largest digit not found (all digits may be the same).");
        }
    }
}
