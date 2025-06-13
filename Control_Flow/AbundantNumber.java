import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Take the integer from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int sum = 0;
        //Perform Calculations
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        //Check conditions and print accordingly
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }
        scanner.close();
    }
}