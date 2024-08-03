import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AutomobileInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Automobile automobile = new Automobile();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a new vehicle");
            System.out.println("2. Remove a vehicle");
            System.out.println("3. Update a vehicle");
            System.out.println("4. List vehicle information");
            System.out.println("5. Print vehicle information to a file");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    System.out.println("\nEnter vehicle details to add a new vehicle:");
                    System.out.print("Make: ");
                    String make = scanner.nextLine();
                    System.out.print("Model: ");
                    String model = scanner.nextLine();
                    System.out.print("Color: ");
                    String color = scanner.nextLine();
                    System.out.print("Year: ");
                    int year = scanner.nextInt();
                    System.out.print("Mileage: ");
                    int mileage = scanner.nextInt();
                    scanner.nextLine(); // consume the newline
                    System.out.println(automobile.addVehicle(make, model, color, year, mileage));
                    break;
                case 2:
                    System.out.println("\nRemoving vehicle...");
                    System.out.println(automobile.removeVehicle());
                    break;
                case 3:
                    System.out.println("\nEnter updated vehicle details:");
                    System.out.print("Make: ");
                    make = scanner.nextLine();
                    System.out.print("Model: ");
                    model = scanner.nextLine();
                    System.out.print("Color: ");
                    color = scanner.nextLine();
                    System.out.print("Year: ");
                    year = scanner.nextInt();
                    System.out.print("Mileage: ");
                    mileage = scanner.nextInt();
                    scanner.nextLine(); // consume the newline
                    System.out.println(automobile.updateVehicle(make, model, color, year, mileage));
                    break;
                case 4:
                    System.out.println("\nListing vehicle information:");
                    for (String info : automobile.listVehicle()) {
                        System.out.println(info);
                    }
                    break;
                case 5:
                    System.out.print("\nDo you want to print the vehicle information to a file? (Y/N): ");
                    String response = scanner.nextLine();
                    if (response.equalsIgnoreCase("Y")) {
                        try {
                            printToFile(automobile.listVehicle(), "C:\\Temp\\Autos.txt");
                            System.out.println("Vehicle information printed to C:\\Temp\\Autos.txt");
                        } catch (IOException e) {
                            System.out.println("Failed to print to file: " + e.getMessage());
                        }
                    } else {
                        System.out.println("File will not be printed.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void printToFile(String[] data, String filePath) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        for (String line : data) {
            writer.write(line + System.lineSeparator());
        }
        writer.close();
    }
}