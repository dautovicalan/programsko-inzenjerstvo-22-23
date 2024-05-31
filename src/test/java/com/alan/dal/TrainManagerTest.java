package com.alan.dal;

import com.alan.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainManagerTest {

    @Test
    void shouldReturnFullyInitializableTrainManagerObject() {
        assertNotNull(TrainManager.getInstance());
    }

    @Test
    void shouldCorrectlyInsertCarToDesiredTrain() {
        TrainManager instance = TrainManager.getInstance();
        instance.insertVehicleInTrain(
                new Car("Bus", "Bus", new GasEngine())
        );
        assertEquals(1,instance.getSmallTrain().getArrayOfVehicles().size());
    }

    @Test
    void shouldCorrectlyInsertVanToDesiredTrain() {
        TrainManager instance = TrainManager.getInstance();
        instance.insertVehicleInTrain(
                        new Van("Volkswagen", "Caddy", new GasEngine())
                );
        assertEquals(1,instance.getSmallTrain().getArrayOfVehicles().size());
    }

    @Test
    void shouldCorrectlyInsertBusToDesiredTrain() {
        TrainManager instance = TrainManager.getInstance();
        instance.insertVehicleInTrain(
                new Bus("Bus", "Bus", new GasEngine())
        );
        assertEquals(1,instance.getBigTrain().getArrayOfVehicles().size());
    }

    @Test
    void shouldCorrectlyInsertTruckToDesiredTrain() {
        TrainManager instance = TrainManager.getInstance();
        instance.insertVehicleInTrain(
                new Truck("Bus", "Bus", new GasEngine())
        );
        assertEquals(1,instance.getBigTrain().getArrayOfVehicles().size());
    }
}