package com.alan.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainTest {

    @Test
    void shouldReturnFalseWhenTrainCapacityFull() {
        Train train = new Train("Test Train", TrainCapacity.BIG_TRAIN);
        train.insertVehicle(new Car("BMW", "M8", new GasEngine()));
        train.insertVehicle(new Car("BMW", "M8", new GasEngine()));
        train.insertVehicle(new Car("BMW", "M8", new GasEngine()));
        train.insertVehicle(new Car("BMW", "M8", new GasEngine()));
        train.insertVehicle(new Car("BMW", "M8", new GasEngine()));
        train.insertVehicle(new Car("BMW", "M8", new GasEngine()));

        assertFalse(train.insertVehicle(new Car("Final BMW", "M8", new GasEngine())));
    }
}