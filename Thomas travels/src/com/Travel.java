   package com;

 import java.util.ArrayList;

   public class Travel {

    public boolean isCarDriver(Driver driver) {
        return driver.getcategory().equalsIgnoreCase("car");
    }

    public String retriveByDriverId(ArrayList<Driver> drivers, int driverid) {
        for (Driver d : drivers) {
            if (driverid == d.getdriverid()) {
                return "Driver name is: " + d.getdrivername() + " belonging to the category: " + d.getcategory();
            }
        }
        return "Driver is not found for given ID.";
    }

    public int retrieveCountOfDriver(ArrayList<Driver> drivers, String category) {
        int count = 0;
        for (Driver d : drivers) {
            if (d.getcategory().equalsIgnoreCase(category)) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<Driver> retrieveDriversByCategory(ArrayList<Driver> drivers, String category) {
        ArrayList<Driver> result = new ArrayList<>();
        for (Driver d : drivers) {
            if (d.getcategory().equalsIgnoreCase(category)) {
                result.add(d);
            }
        }
        return result;
    }

    public Driver retrieveMaximumDistanceTravelledDriver(ArrayList<Driver> drivers) {
        Driver maxDriver = null;
        double maxDistance = 0;
        for (Driver d : drivers) {
            if (d.gettotaldistance() > maxDistance) {
                maxDistance = d.gettotaldistance();
                maxDriver = d;
            }
        }
        return maxDriver;
    }
}