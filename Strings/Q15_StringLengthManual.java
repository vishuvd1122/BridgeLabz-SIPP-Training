import java.util.Scanner;

public class Q15_StringLengthManual {
    // Method to find length without using length()
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // End of string
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        int manualLen = getLength(input);
        int builtInLen = input.length();
        System.out.println("Manual length: " + manualLen);
        System.out.println("Built-in length: " + builtInLen);
    }
}
