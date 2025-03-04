import java.util.Scanner;

public class MeanHeightFootball {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define an array for 11 players' heights
        double[] heights = new double[11];
        double sum = 0.0;

        // Get user input for heights
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + " in cm: ");
            heights[i] = input.nextDouble();
            sum += heights[i]; // Add height to sum
        }

        // Calculate mean height
        double meanHeight = sum / heights.length;

        // Display the mean height
        System.out.println("Mean height of the football team: " + meanHeight + " cm");

        input.close();
    }
}
