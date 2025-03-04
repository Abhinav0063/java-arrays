import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of students
        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();

        // Arrays to store marks, percentage, and grades
        int[][] marks = new int[numStudents][3]; // Stores marks for Physics, Chemistry, and Maths
        double[] percentages = new double[numStudents]; // Stores percentage of each student
        String[] grades = new String[numStudents]; // Stores grade of each student

        // Taking input for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                // Input validation for marks
                while (true) {
                    System.out.print("Enter marks for " + subject + " (out of 100): ");
                    marks[i][j] = scanner.nextInt();

                    if (marks[i][j] >= 0 && marks[i][j] <= 100) break;
                    System.out.println("Invalid input! Marks should be between 0 and 100. Try again.");
                }
            }

            // Calculate percentage
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Determine grade based on percentage
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R"; // Remedial standards
            }
        }

        // Display results
        System.out.println("\nStudent Report:");
        System.out.printf("%-10s %-10s %-10s %-10s %-15s %-10s%n",
                "Physics", "Chemistry", "Maths", "Total", "Percentage", "Grade");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            System.out.printf("%-10d %-10d %-10d %-10d %-15.2f %-10s%n",
                    marks[i][0], marks[i][1], marks[i][2], totalMarks, percentages[i], grades[i]);
        }

        scanner.close();
    }
}
