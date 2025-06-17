import java.util.Scanner;

public class FactorsArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Take input from user
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Only positive integers have factors.");
            return;
        }

        // 2. Initialize array to store factors
        int maxFactor = 10; // initial size
        int[] factors = new int[maxFactor];
        int index = 0; // to track number of factors added

        // 3. Loop from 1 to number to find all factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Resize if array is full
                if (index == maxFactor) {
                    // Double the size of array
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];

                    // Copy existing elements to new array
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }

                    // Reassign reference
                    factors = temp;
                }

                // Store the factor
                factors[index] = i;
                index++;
            }
        }

        // 4. Display all factors stored
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        scanner.close();
    }
}
