import java.util.Scanner;

public class AbundantNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2. Get user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;

        // 4. Loop through all numbers less than the input
        for (int i = 1; i < number; i++) {
            // 5. If 'i' is a divisor, add it to sum
            if (number % i == 0) {
                sum += i;
            }
        }

        // 6. Check if sum is greater than number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is NOT an Abundant Number.");
        }

        scanner.close();
    }
}
