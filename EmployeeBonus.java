import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store employee salaries and years of service
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        // Variables to track total salary and bonus payouts
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Taking input for 10 employees
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary for Employee " + (i + 1) + ":");
            double salary = scanner.nextDouble();

            System.out.println("Enter years of service for Employee " + (i + 1) + ":");
            double years = scanner.nextDouble();

            // Validate inputs
            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; // Decrement index to re-enter the correct values
                continue;
            }

            // Store valid values
            salaries[i] = salary;
            yearsOfService[i] = years;
        }

        // Calculate bonuses and update salaries
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05; // 5% bonus
            } else {
                bonuses[i] = salaries[i] * 0.02; // 2% bonus
            }

            // Compute new salary
            newSalaries[i] = salaries[i] + bonuses[i];

            // Update totals
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display results
        System.out.println("\nTotal Bonus Payout: $" + totalBonus);
        System.out.println("Total Old Salary: $" + totalOldSalary);
        System.out.println("Total New Salary: $" + totalNewSalary);

        scanner.close();
    }
}
