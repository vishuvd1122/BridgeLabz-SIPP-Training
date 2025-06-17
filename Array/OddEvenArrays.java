import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.err.println("Error: Please enter a positive natural number.");
            return;
        }

        int size = number / 2 + 1;  // Enough space for either odd or even numbers
        int[] oddNumbers = new int[size];
        int[] evenNumbers = new int[size];
        int oddIndex = 0, evenIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        System.out.print("\nOdd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
    }
}
