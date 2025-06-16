import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //Take the input from the user 
        int num = sc.nextInt();
        
        //Check if the number is neagtive
        if (num<1) {
            System.err.println("Number can not be negative");
            System.exit(0);
        }
        String arr []= new String [num];
        //Replace fizz and buzz
        for(int i=1;i<arr.length;i++){
            if (i%3==0) {
                arr[i]="Position "+ i +"= Fizz";
            }
            else if (i%5==0) {
                arr[i]="Position "+ i +"= Buzz";
            }
            else{
                arr[i]="Position "+ i +"= " + i;
            }
        }
        //Print the array
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
