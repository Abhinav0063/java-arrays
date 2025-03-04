import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define an array for 5 numbers
        int[] numbers = new int[5];

        // Get user input for numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Check each number
        for (int number : numbers) {
            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println(number + " is positive and even.");
                } else {
                    System.out.println(number + " is positive and odd.");
                }
            } else if (number < 0) {
                System.out.println(number + " is negative.");
            } else {
                System.out.println(number + " is zero.");
            }
        }

        // Compare first and last elements
        if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is greater than the last.");
        } else if (numbers[0] < numbers[numbers.length - 1]) {
            System.out.println("First element is less than the last.");
        } else {
            System.out.println("First and last elements are equal.");
        }

        input.close();
    }
}
