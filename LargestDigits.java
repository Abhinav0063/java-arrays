import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking number input
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        int[] digits = new int[10]; // Max 10 digits
        int index = 0;

        // Extract digits
        while (number != 0 && index < 10) {
            digits[index++] = number % 10;
            number /= 10;
        }

        int largest = 0, secondLargest = 0;

        // Finding largest and second-largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("\nLargest digit: " + largest);
        System.out.println("Second Largest digit: " + secondLargest);

        scanner.close();
    }
}
