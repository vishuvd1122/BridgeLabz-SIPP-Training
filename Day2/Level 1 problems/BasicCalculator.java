import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask for user input
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        // Perform operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;

        // Handle division by zero
        double division;
        if (number2 != 0) {
            division = number1 / number2;
        } else {
            division = Double.NaN; // Not a Number, indicating division by zero
        }

        // Output the results
        System.out.printf("The addition, subtraction, multiplication, and division value of %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f%n",
                number1, number2, addition, subtraction, multiplication, division);
    }
}