import java.util.Scanner;

public class Copy2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input for matrix size
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        // Define 2D array
        int[][] matrix = new int[rows][cols];

        // Get user input for 2D array elements
        System.out.println("Enter elements for the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Define 1D array to store 2D array elements
        int[] array = new int[rows * cols];
        int index = 0;

        // Copy elements from 2D to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Display 1D array
        System.out.print("1D Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        input.close();
    }
}
