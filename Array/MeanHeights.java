import java.util.Scanner;

public class MeanHeights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int [11];
        
        //Ask the user for the height of the 11 players
        System.out.println("Enter the age of 11 players:");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        //Run the loop and calculate the sum
        int sum=0;
        for(int i=0; i<arr.length;i++){
            sum=sum+arr[i];
        }
        //Calculate the average
        int avg = sum/11;
        //Print the average
        System.out.println("The average of the heights is: " + avg);
    }
}
