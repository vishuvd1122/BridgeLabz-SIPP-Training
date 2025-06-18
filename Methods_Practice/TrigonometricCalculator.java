import java.util.Scanner;

public class TrigonometricCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] trigValues = calculateTrigonometricFunctions(angle);

        System.out.println("For angle " + angle + " degrees:");
        System.out.println("Sine: " + trigValues[0]);
        System.out.println("Cosine: " + trigValues[1]);
        System.out.println("Tangent: " + trigValues[2]);

        sc.close();
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // Convert to radians

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }
}
