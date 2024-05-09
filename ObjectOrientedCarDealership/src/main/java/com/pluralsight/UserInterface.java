package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    static Scanner scanner = new Scanner(System.in);
    private Dealership dealership;

    public UserInterface(){
    }

    public void display() {
        init();
        while(true) {
            System.out.println("Menu Screen");
            System.out.println("1) Search by Price");
            System.out.println("2) Search by Make and Model");
            System.out.println("3) Search by Year");
            System.out.println("4) Search by Color");
            System.out.println("5) Search by Mileage");
            System.out.println("6) Search by Vehicle Type");
            System.out.println("7) Display All Vehicles");
            System.out.println("8) Add a Vehicle");
            System.out.println("9) Remove a Vehicle");
            System.out.println("0) Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleType();
                    break;
                case 7:
                    processGetAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

    public void processGetByPriceRequest() {
        // Prompt for price range
        System.out.print("Enter the minimum price : $");
        double min = scanner.nextDouble();
        System.out.print("Enter the maximum price : $");
        double max = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline

        // Call the search method
        displayVehicles(this.dealership.getVehiclesByPrice(min, max));
    }

    public void processGetByMakeModelRequest() {
        // Prompt
        System.out.print("Enter the make : ");
        String make = scanner.nextLine();
        System.out.print("Enter the model : ");
        String model = scanner.nextLine();

        // Display
        displayVehicles(this.dealership.getVehiclesByMakeModel(make,model));
    }

    public void processGetByYearRequest() {
        // Prompt
        System.out.print("Enter the minimum year : ");
        int min = scanner.nextInt();
        System.out.print("Enter the maximum year : ");
        int max = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Display
        displayVehicles(this.dealership.getVehiclesByYear(min,max));
    }

    public void processGetByColorRequest() {
        // Prompt
        System.out.print("Enter a color : ");
        String color = scanner.nextLine();

        // Display
        displayVehicles(this.dealership.getVehiclesByColor(color));
    }

    public void processGetByMileageRequest() {
        // Prompt
        System.out.print("Enter minimum mileage : ");
        int min = scanner.nextInt();
        System.out.print("Enter maximum mileage : ");
        int max = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Display
        displayVehicles(this.dealership.getVehiclesByMileage(min,max));
    }

    public void processGetByVehicleType() {
        // Prompt
        System.out.print("Enter the vehicle type : ");
        String vehicleType = scanner.nextLine();

        // Display
        displayVehicles(this.dealership.getVehiclesByType(vehicleType));
    }

    public void processGetAllVehiclesRequest() {
        // Display vehicles in the inventory
        displayVehicles(this.dealership.getAllVehicles());
    }

    public void processAddVehicleRequest() {
        // Prompt
        System.out.println("Please enter the following information");
        System.out.print("Vin : ");
        
    }

    public void processRemoveVehicleRequest() {}

    // Private methods
    private void init() {
        this.dealership = DealershipFileManager.getDealership();
    }

    private void displayVehicles(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
