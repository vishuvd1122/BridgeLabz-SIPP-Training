import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take year input from user
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        // Step 2: Check if year is in Gregorian calendar range
        if (year >= 1582) {
            // Step 3: Use single if condition to check leap year logic
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        } else {
            System.out.println("The year " + year + " is not in the Gregorian calendar. Please enter year >= 1582.");
        }

        scanner.close();
    }
}
