import java.util.Scanner;

public class StoreValuesAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] values = new double[10]; // Array to store user inputs
        double total = 0.0;               // Total sum of values
        int index = 0;                    // Tracks number of entries

        // Infinite loop to collect user input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            if (input <= 0) {
                System.err.println("Warning: Input stopped due to 0 or negative value.");
                break;
            }

            if (index == 10) {
                System.err.println("Maximum limit of 10 inputs reached.");
                break;
            }

            values[index++] = input; // Store value in array
        }

        // Calculate total sum
        for (int i = 0; i < index; i++) {
            total += values[i];
        }

        System.out.println("You entered " + index + " numbers.");
        System.out.println("Sum of all numbers: " + total);
    }
}
