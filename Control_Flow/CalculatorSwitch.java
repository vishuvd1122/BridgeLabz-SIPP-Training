import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get inputs
        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = scanner.next();

        double result;

        // 5. Use switch to handle operations
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid Operator.");
        }

        scanner.close();
    }
}
