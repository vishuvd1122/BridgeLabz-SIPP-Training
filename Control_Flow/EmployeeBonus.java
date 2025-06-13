import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        // Create Scanner object to read input from user
        Scanner scanner = new Scanner(System.in);

        // Prompt for salary
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        // Prompt for years of service
        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();

        // Check eligibility for bonus
        if (yearsOfService > 5) {
            // Calculate 5% bonus
            double bonus = salary * 0.05;
            System.out.println("Bonus awarded: ₹" + bonus);
        } else {
            System.out.println("No bonus awarded (less than or equal to 5 years of service).");
        }

        // Close the scanner
        scanner.close();
    }
}
