import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input for number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define an array to store results for 6 to 9
        int[] multiplicationResult = new int[4];

        // Compute multiplication for numbers 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Display multiplication table from 6 to 9
        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }

        input.close();
    }
}
