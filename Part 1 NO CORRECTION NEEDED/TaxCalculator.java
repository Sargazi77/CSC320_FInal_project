//Mohammad Sargazi
//Module 3 - CSCI320
import java.util.Scanner;
public class TaxCalculator {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for weekly income
        System.out.print("Enter your weekly income: ");
        double income = scanner.nextDouble();

        // Calculate tax withholding
        double taxWithholding = calculateTax(income);

        // Output the result
        System.out.printf("Your weekly tax withholding is: $%.2f%n", taxWithholding);

        // Close the scanner
        scanner.close();
    }

    // Function to calculate tax withholding based on income
    public static double calculateTax(double income) {
        double taxRate;
        if (income < 500) {
            taxRate = 10;
        } else if (income >= 500 && income < 1500) {
            taxRate = 15;
        } else if (income >= 1500 && income < 2500) {
            taxRate = 20;
        } else {
            taxRate = 30;
        }
        return income * (taxRate / 100);
    }
}
