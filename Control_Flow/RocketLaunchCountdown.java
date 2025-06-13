import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the countdown starting value
        System.out.print("Enter countdown start value: ");
        int counter = scanner.nextInt();  // Read user input

        // Use a for loop to count down from the counter to 1
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);  
        }

        // After countdown launch it
        System.out.println("Launch!");
        scanner.close();
    }
}
