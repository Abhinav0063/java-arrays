import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input for number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define an array to store multiplication results
        int[] table = new int[10];

        // Compute multiplication table
        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
        }

        // Display multiplication table
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        input.close();
    }
}
