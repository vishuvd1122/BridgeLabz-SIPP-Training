import java.util.Scanner;

public class CanVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ask the user for his age
        int age = sc.nextInt();
        //Check wether age is greater than 18 and print the result accordindly
        if (age>18) {
            System.out.println("You can vote!");
        }
        else {
            System.out.println("You can not vote");
        }
    }
}
