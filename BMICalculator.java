import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of persons
        System.out.println("Enter the number of persons:");
        int n = scanner.nextInt();

        // Arrays to store height, weight, BMI, and weight status
        double[] heights = new double[n];
        double[] weights = new double[n];
        double[] bmis = new double[n];
        String[] statuses = new String[n];

        // Taking input for height and weight
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            // Taking weight input
            System.out.print("Enter weight (kg): ");
            weights[i] = scanner.nextDouble();

            // Taking height input
            System.out.print("Enter height (m): ");
            heights[i] = scanner.nextDouble();

            // Validate height and weight inputs
            if (weights[i] <= 0 || heights[i] <= 0) {
                System.out.println("Invalid input! Weight and height must be positive numbers. Please enter again.");
                i--; // Decrement to re-enter valid data
                continue;
            }

            // Calculate BMI
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            // Determine weight status based on BMI
            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] >= 25.0 && bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nBMI Report:");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(m)", "Weight(kg)", "BMI", "Status");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", heights[i], weights[i], bmis[i], statuses[i]);
        }

        scanner.close();
    }
}
