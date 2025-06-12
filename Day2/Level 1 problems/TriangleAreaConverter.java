import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base and height in centimeters
        System.out.print("Enter the base of the triangle in cm: ");
        double baseCm = scanner.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double heightCm = scanner.nextDouble();

        // Calculate area in square centimeters
        double areaCm2 = 0.5 * baseCm * heightCm;

        // Conversion factor: 1 inch = 2.54 cm
        double centimetersPerInch = 2.54;

        // Convert base and height to inches
        double baseIn = baseCm / centimetersPerInch;
        double heightIn = heightCm / centimetersPerInch;

        // Calculate area in square inches
        double areaIn2 = 0.5 * baseIn * heightIn;

        // Output the results
        System.out.printf("The Area of the triangle in sq in is %.2f and in sq cm is %.2f%n", areaIn2, areaCm2);
    }
}