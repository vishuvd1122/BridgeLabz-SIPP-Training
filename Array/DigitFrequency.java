import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int original = number;

        // Step 4: Frequency array of digits (0–9)
        int[] frequency = new int[10];

        // Step 2 & 3: Extract digits and update frequency
        while (number != 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }

        // Step 5: Display frequency
        System.out.println("Digit frequencies in " + original + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}
