import java.util.Scanner;

public class CheckNumberSign {
    public static int checkSign(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = s.nextInt();

        int result = checkSign(number);
        if (result == 1) {
            System.out.println("The number is positive.");
        }
        else if (result == -1) {
            System.out.println("The number is negative.");
        }
        else {
            System.out.println("The number is zero.");
        }

    }
}