import java.util.Scanner;

public class LeapYear2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get input year from user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // 2. Check if the year is valid (Gregorian calendar started in 1582)
        if (year < 1582) {
            System.out.println("Year must be 1582 or later. Not a valid input for Gregorian calendar.");
        } else {
            // 3. Check leap year conditions using if-else statements
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else if (year % 100 == 0) {
                System.out.println(year + " is NOT a Leap Year.");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }

        scanner.close();
    }
}
