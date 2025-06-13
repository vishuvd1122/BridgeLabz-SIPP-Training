import java.util.Scanner;

public class SumCompare {
    public static void main(String[] args) {

        //Take input from the user
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();

        //Calculate the sum using the loop
        int sum1=0;
        for(int i=0;i<=n;i++){
            sum1=sum1+i;
        }

        //Calculate the sum by using the feormula
        int sum2 = n*(n+1)/2;
        
        //Check if the sum is same
        if (sum1==sum2) {
            System.out.println("Both sum are same");            
        }

        else {
            System.out.println("Sum are not same");
        }
    }
}
