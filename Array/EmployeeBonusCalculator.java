import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int EMPLOYEES = 10;

        double[] salaries = new double[EMPLOYEES];
        double[] yearsOfService = new double[EMPLOYEES];
        double[] bonus = new double[EMPLOYEES];
        double[] newSalaries = new double[EMPLOYEES];

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        // Step 4: Input salaries and years of service
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("Enter data for Employee " + (i + 1));

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            System.out.print("Enter years of service: ");
            double service = sc.nextDouble();

            // Validate input
            if (salary <= 0 || service < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; // Decrement to retry input for this employee
                continue;
            }

            salaries[i] = salary;
            yearsOfService[i] = service;
        }

        // Step 5: Compute bonus, new salary and totals
        for (int i = 0; i < EMPLOYEES; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = 0.05 * salaries[i];
            } else {
                bonus[i] = 0.02 * salaries[i];
            }

            newSalaries[i] = salaries[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Step 6: Output results
        System.out.println("\n--- Bonus and Salary Details ---");
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                    (i + 1), salaries[i], bonus[i], newSalaries[i]);
        }

        System.out.println("\n--- Company Summary ---");
        System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);
    }
}
