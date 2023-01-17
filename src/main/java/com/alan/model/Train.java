package com.alan.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Train {

    protected String name;
    protected TrainCapacity vehicleCapacity;
    protected List<Vehicle> arrayOfVehicles;

    public List<Vehicle> getArrayOfVehicles() {
        return new ArrayList<>(arrayOfVehicles);
    }

    public Train(String name) {
        this.name = name;
        arrayOfVehicles = new ArrayList<>();
    }

    public abstract boolean insertVehicle(Vehicle vehicle);

    public String getName() {
        return name;
    }

    public TrainCapacity getVehicleCapacity() {
        return vehicleCapacity;
    }
}
