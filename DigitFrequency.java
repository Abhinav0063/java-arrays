import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking number input
        System.out.println("Enter a number:");
        long number = scanner.nextLong(); // Using long for large numbers

        int[] frequency = new int[10]; // Array to store digit frequencies

        // Process each digit of the number
        long temp = Math.abs(number); // Handling negative numbers
        while (temp > 0) {
            int digit = (int) (temp % 10); // Get last digit
            frequency[digit]++; // Increment the count for this digit
            temp /= 10; // Remove last digit
        }

        // Display the frequency of each digit
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) { // Display only digits that appear in the number
                System.out.println("Digit " + i + " appears " + frequency[i] + " times");
            }
        }

        scanner.close();
    }
}
