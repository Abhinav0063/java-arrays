import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define an array to store up to 10 numbers
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Get user input with an infinite loop
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = input.nextDouble();

            if (num <= 0 || index == 10) {
                break; // Stop if user enters 0, negative, or array is full
            }

            numbers[index++] = num; // Store value in array
        }

        // Compute total sum
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display stored numbers and total sum
        System.out.print("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nTotal Sum: " + total);

        input.close();
    }
}
