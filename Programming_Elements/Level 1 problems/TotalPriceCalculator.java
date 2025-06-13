import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input unit price
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = scanner.nextDouble();

        // Input quantity
        System.out.print("Enter the quantity to be bought: ");
        int quantity = scanner.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Output the result
        System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f%n", totalPrice, quantity, unitPrice);
    }
}