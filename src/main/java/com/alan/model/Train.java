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

    public void insertVehicle(Vehicle vehicle) {
        if (arrayOfVehicles.size() >= vehicleCapacity.capacity ){
            System.out.println("Vlak je pun. Nemoze vise");
            return;
        }
        arrayOfVehicles.add(vehicle);
    }

    public String getName() {
        return name;
    }

    public TrainCapacity getVehicleCapacity() {
        return vehicleCapacity;
    }
}
