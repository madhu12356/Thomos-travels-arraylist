   package com;

   import java.util.ArrayList;

   public class Testdriver {
    public static void main(String[] args) {
        ArrayList<Driver> drivers = new ArrayList<>();

        drivers.add(new Driver(1, "Vijay", "car", 8000));
        drivers.add(new Driver(2, "Varchas", "lorry", 6000));
        drivers.add(new Driver(3, "Rohan", "auto", 7000));
        drivers.add(new Driver(4, "Gowtham", "auto", 8000));
        drivers.add(new Driver(5, "Vijay", "car", 8000));

        Travel travel = new Travel();

        // Check if a specific driver is a car driver
        boolean isCarDriver = travel.isCarDriver(drivers.get(4));
        System.out.println("Is " + drivers.get(4).getdrivername() + " a car driver? -> " + isCarDriver);
        System.out.println();

        // Retrieve by ID
        String driverInfo = travel.retriveByDriverId(drivers, 5);
        System.out.println(driverInfo);
        System.out.println();

        // Count by category
        int carDriverCount = travel.retrieveCountOfDriver(drivers, "car");
        System.out.println("Number of car drivers: " + carDriverCount);
        System.out.println();

        // Retrieve drivers by category
        ArrayList<Driver> carDrivers = travel.retrieveDriversByCategory(drivers, "car");
        System.out.println("Drivers with category 'car':");
        for (Driver d : carDrivers) {
            System.out.println(d);
        }
        System.out.println();

        Driver maxDriver = travel.retrieveMaximumDistanceTravelledDriver(drivers);
        System.out.println("Maximum Distance Travelled: " + maxDriver);
     }
    }