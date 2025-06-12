import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceFeet = scanner.nextDouble();

        // Calculate distance in yards
        double distanceYards = distanceFeet / 3;

        // Calculate distance in miles
        double distanceMiles = distanceYards / 1760;

        // Output the results
        System.out.printf("The distance in yards is %.2f while the distance in miles is %.2f%n", distanceYards, distanceMiles);
    }
}