import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Take the input from the user

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print the table");
        int n = sc.nextInt();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n * (i+1);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        sc.close();

    }

}