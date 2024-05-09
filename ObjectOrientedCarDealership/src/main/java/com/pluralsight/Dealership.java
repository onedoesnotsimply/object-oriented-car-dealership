package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    ArrayList<Vehicle> inventory;
    ArrayList<Vehicle> searchResults;

    public Dealership(String name, String address, String phone) {
        this.name=name;
        this.address=address;
        this.phone=phone;
        inventory = new ArrayList<>();
        searchResults = new ArrayList<>();
    }

    public List<Vehicle> getVehiclesByPrice(double min, double max){
        // Ensure that the searchResults list only returns the results for the CURRENT search
        searchResults.clear();
        // For each vehicle in inventory
        for (Vehicle vehicle : inventory){
            // If the price is within the input range
            if ((vehicle.getPrice() >= min) && (vehicle.getPrice() <= max)){
                // Add it to searchResults
                searchResults.add(vehicle);
            }
        }
        return searchResults;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model){
        searchResults.clear(); // Clear old searchResults
        // For each vehicle in inventory
        for (Vehicle vehicle:inventory){
            // If the make and model match
            if (make.equalsIgnoreCase(vehicle.getMake()) && model.equalsIgnoreCase(vehicle.getModel())) {
                searchResults.add(vehicle);
            }
        }
        return searchResults;
    }

    public List<Vehicle> getVehiclesByYear(int min, int max) {
        searchResults.clear(); // Clear old search results
        // Loop through inventory
        for (Vehicle vehicle:inventory){
            // If the year is within the range
            if (vehicle.getYear() >= min && vehicle.getYear() <= max){
                searchResults.add(vehicle);
            }
        }
        return searchResults;
    }

    public List<Vehicle> getVehiclesByColor(String color){
        searchResults.clear();
        // Loop through inventory
        for (Vehicle vehicle:inventory){
            if (color.equalsIgnoreCase(vehicle.getColor())){
                searchResults.add(vehicle);
            }
        }
        return searchResults;
    }

    public List<Vehicle> getVehiclesByMileage(int min, int max) {
        return null;
    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {
        return null;
    }

    public List<Vehicle> getAllVehicles() {
        // Return all Vehicles in the inventory ArrayList
        return inventory;
    }

    public void addVehicle(Vehicle vehicle){
        // Allow the user to add a car to the dealership inventory
        inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){

    }



    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
