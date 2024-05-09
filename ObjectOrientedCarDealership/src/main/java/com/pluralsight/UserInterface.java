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
        scanner.nextLine();

        // Call the search method
        displayVehicles(this.dealership.getVehiclesByPrice(min, max));
    }

    public void processGetByMakeModelRequest() {}

    public void processGetByYearRequest() {}

    public void processGetByColorRequest() {}

    public void processGetByMileageRequest() {}

    public void processGetByVehicleType() {}

    public void processGetAllVehiclesRequest() {
        // Display vehicles in the inventory
        displayVehicles(this.dealership.getAllVehicles());
    }

    public void processAddVehicleRequest() {}

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
