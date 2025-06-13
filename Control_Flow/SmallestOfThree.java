import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take input for three numbers
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();

        // Check if the first number is smaller than both second and third
        boolean isSmallest = (number1 < number2) && (number1 < number3);

        // Print the result
        System.out.println("Is the first number the smallest? " + (isSmallest ? "Yes" : "No"));

        // Close scanner
        scanner.close();
    }
}
