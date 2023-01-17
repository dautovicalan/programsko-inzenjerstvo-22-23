package com.alan.model;

public class SmallTransportTrain extends Train {

    public SmallTransportTrain(String name) {
        super(name);
        this.vehicleCapacity = TrainCapacity.SMALL_TRAIN;
    }

    @Override
    public boolean insertVehicle(Vehicle vehicle) {
        if (vehicle instanceof SmallVehicle){
            if (arrayOfVehicles.size() >= vehicleCapacity.capacity ){
                System.out.println("Vlak je pun. Nemoze vise");
                return false;
            }
            arrayOfVehicles.add(vehicle);
            return true;
        }

        return false;
    }
}
