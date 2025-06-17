import java.util.Scanner;

public class MatrixTo1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get dimensions from user
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.err.println("Error: Rows and columns must be positive.");
            return;
        }

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter " + (rows * cols) + " elements:");

        // Input 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Copy to 1D array
        int[] flatArray = new int[rows * cols];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flatArray[index++] = matrix[i][j];
            }
        }

        System.out.println("1D array after copying:");
        for (int val : flatArray) {
            System.out.print(val + " ");
        }
    }
}
