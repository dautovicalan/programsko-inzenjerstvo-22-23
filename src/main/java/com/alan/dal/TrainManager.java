package com.alan.dal;

import com.alan.model.*;

public final class TrainManager {
    private static TrainManager instance;
    private Train smallTrain;
    private Train bigTrain;
    private TrainManager(){
        smallTrain = new Train("Mali vlakic", TrainCapacity.SMALL_TRAIN);
        bigTrain = new Train("Velik vlakic", TrainCapacity.BIG_TRAIN);
    }
    public static TrainManager getInstance(){
        if (instance == null){
            instance = new TrainManager();
        }
        return instance;
    }

    public void insertVehicleInTrain(Vehicle vehicle) {
        Employee employee = EmployeeManager.getInstance().getRandomEmployee();
        if (vehicle.getEngine().showCapacity() < 10){
            employee.fillVehicle(vehicle);
        }
        if (vehicle instanceof Car){
            smallTrain.insertVehicle(vehicle);
        }
        if (vehicle instanceof Van){
            smallTrain.insertVehicle(vehicle);
        }
        if (vehicle instanceof Bus){
            bigTrain.insertVehicle(vehicle);
        }
        if (vehicle instanceof Bus){
            bigTrain.insertVehicle(vehicle);
        }
        TicketManager
                .getInstance()
                .addTicketIncome(
                        vehicle.calculateTransportationPrice()
                );
    }
}
