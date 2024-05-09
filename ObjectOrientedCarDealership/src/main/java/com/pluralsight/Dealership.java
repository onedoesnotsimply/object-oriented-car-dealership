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
        return null;
    }

    public List<Vehicle> getVehiclesByYear(int min, int max) {
        return null;
    }

    public List<Vehicle> getVehiclesByColor(String color){
        return null;
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
