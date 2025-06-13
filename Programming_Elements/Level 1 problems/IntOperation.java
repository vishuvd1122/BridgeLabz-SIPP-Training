
import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values for a, b, and c
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();

        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();

        // Perform operations considering operator precedence
        int result1 = a + b * c;       // Multiplication has higher precedence than addition
        int result2 = a * b + c;       // Multiplication first, then addition
        int result3 = c + a / b;       // Division before addition
        int result4 = a % b + c;       // Modulo before addition

        // Output the results
        System.out.printf("The results of Int Operations are %d, %d, %d, and %d%n",
                result1, result2, result3, result4);
    }
}
