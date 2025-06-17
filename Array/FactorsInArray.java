import java.util.Scanner;

public class FactorsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.err.println("Error: Please enter a positive number.");
            return;
        }

        int maxFactor = 10;                     // Initial size of the array
        int[] factors = new int[maxFactor];     // Array to store factors
        int index = 0;                          // Tracks number of factors stored

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Resize array if capacity is full
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp; // Assign expanded array
                }
                factors[index++] = i; // Add factor to array
            }
        }

        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
