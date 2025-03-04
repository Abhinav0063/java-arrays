import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking number input
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        int count = 0, temp = number;
        
        // Count digits
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int[] digits = new int[count];

        // Extract digits
        for (int i = 0; number != 0; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Display digits in reverse order
        System.out.print("Reversed number: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();

        scanner.close();
    }
}
