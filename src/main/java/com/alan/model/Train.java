package com.alan.model;

import java.util.ArrayList;
import java.util.List;

public class Train {

    private String name;
    private TrainCapacity vehicleCapacity;
    private List<Vehicle> arrayOfVehicles;

    public Train(String name, TrainCapacity vehicleCapacity) {
        this.name = name;
        this.vehicleCapacity = vehicleCapacity;
        arrayOfVehicles = new ArrayList<>();
    }

    public boolean insertVehicle(Vehicle vehicle) {
        if (arrayOfVehicles.size() >= vehicleCapacity.capacity ){
            System.out.println("Vlak je pun. Nemoze vise");
            return false;
        }
        arrayOfVehicles.add(vehicle);
        return true;
    }

    public String getName() {
        return name;
    }

    public TrainCapacity getVehicleCapacity() {
        return vehicleCapacity;
    }
}
