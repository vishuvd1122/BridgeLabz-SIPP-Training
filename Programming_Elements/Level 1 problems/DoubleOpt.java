
import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values for a, b, and c as doubles
        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble();

        // Perform operations with doubles
        double result1 = a + b * c;       // Multiplication first, then addition
        double result2 = a * b + c;       // Multiplication first, then addition
        double result3 = c + a / b;       // Division before addition
        double result4 = a % b + c;       // Modulo operation (remainder), then addition

        // Output the results
        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f%n",
                result1, result2, result3, result4);
    }
}
