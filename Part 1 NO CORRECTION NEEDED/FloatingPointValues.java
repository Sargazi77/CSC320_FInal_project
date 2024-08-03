//Mohammad Sargazi
// Module 4, Critical Thinking, CSCI320

import java.util.ArrayList;
import java.util.Scanner;

public class FloatingPointValues {
    public static void main(String[] args) {
        // Initialize the list to store the floating-point values
        ArrayList<Double> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Initialize the counter
        int count = 0;

        // While loop to read 5 floating-point values
        while (count < 5) {
            System.out.print("Enter floating-point value " + (count + 1) + ": ");
            try {
                // Prompt the user to enter a floating-point value
                double userInput = Double.parseDouble(scanner.nextLine());
                // Append the valid input to the list
                values.add(userInput);
                // Increment the counter
                count++;
            } catch (NumberFormatException e) {
                // Handle the error if input is not a valid floating-point number
                System.out.println("Invalid input. Please enter a valid floating-point number.");
            }
        }

        // Calculate the total of the values in the list
        double total = 0;
        for (double value : values) {
            total += value;
        }

        // Calculate the average of the values in the list
        double average = total / values.size();

        // Find the maximum value in the list
        double maximum = values.get(0);
        for (double value : values) {
            if (value > maximum) {
                maximum = value;
            }
        }

        // Find the minimum value in the list
        double minimum = values.get(0);
        for (double value : values) {
            if (value < minimum) {
                minimum = value;
            }
        }

        // Calculate the interest on the total at 20%
        double interest = total * 0.20;

        // Print the results
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        System.out.println("Interest on total at 20%: " + interest);

        scanner.close();
    }
}
