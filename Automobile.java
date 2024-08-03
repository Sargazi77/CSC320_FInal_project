import java.io.FileWriter;
import java.io.IOException;

public class Automobile {
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    // Default constructor
    public Automobile() {
        this.make = "";
        this.model = "";
        this.color = "";
        this.year = 0;
        this.mileage = 0;
    }

    // Parameterized constructor
    public Automobile(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    // Add a new vehicle
    public String addVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle added successfully";
        } catch (Exception e) {
            return "Failed to add vehicle: " + e.getMessage();
        }
    }

    // List vehicle information
    public String[] listVehicle() {
        String[] vehicleInfo = new String[5];
        try {
            vehicleInfo[0] = "Make: " + this.make;
            vehicleInfo[1] = "Model: " + this.model;
            vehicleInfo[2] = "Color: " + this.color;
            vehicleInfo[3] = "Year: " + this.year;
            vehicleInfo[4] = "Mileage: " + this.mileage;
        } catch (Exception e) {
            vehicleInfo = new String[]{"Failed to list vehicle information: " + e.getMessage()};
        }
        return vehicleInfo;
    }

    // Remove a vehicle
    public String removeVehicle() {
        try {
            this.make = "";
            this.model = "";
            this.color = "";
            this.year = 0;
            this.mileage = 0;
            return "Vehicle removed successfully";
        } catch (Exception e) {
            return "Failed to remove vehicle: " + e.getMessage();
        }
    }

    // Update vehicle attributes
    public String updateVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle updated successfully";
        } catch (Exception e) {
            return "Failed to update vehicle: " + e.getMessage();
        }
    }
}