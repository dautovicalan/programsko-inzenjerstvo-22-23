package com.alan.model;

public class BigTransportTrain extends Train {

    public BigTransportTrain(String name) {
        super(name);
        this.vehicleCapacity = TrainCapacity.BIG_TRAIN;
    }

    @Override
    public boolean insertVehicle(Vehicle vehicle) {
        if (vehicle instanceof BigVehicle){
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
