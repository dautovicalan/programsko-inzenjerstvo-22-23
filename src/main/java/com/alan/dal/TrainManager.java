package com.alan.dal;

import com.alan.model.*;

public final class TrainManager {
    private static TrainManager instance;
    private Train smallTrain;
    private Train bigTrain;

    public Train getSmallTrain() {
        return smallTrain;
    }

    public Train getBigTrain() {
        return bigTrain;
    }

    private TrainManager(){
        smallTrain = new SmallTransportTrain("Mali vlakic");
        bigTrain = new BigTransportTrain("Velik vlakic");
    }
    public static TrainManager getInstance(){
        if (instance == null){
            instance = new TrainManager();
        }
        return instance;
    }

    public void insertVehicleInTrain(Vehicle vehicle) {
        EmployeeManager
                .getInstance()
                .getRandomEmployee()
                .checkFuelStatus(vehicle);
        if (vehicle instanceof SmallVehicle){
            smallTrain.insertVehicle(vehicle);
        }
        if (vehicle instanceof BigVehicle){
            bigTrain.insertVehicle(vehicle);
        }
        TicketManager
                .getInstance()
                .addTicketIncome(
                        vehicle.calculateTransportationPrice()
                );
    }
}
