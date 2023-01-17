package com.alan.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainTest {

    @Test
    void shouldReturnFalseWhenBigTrainCapacityFull() {
        Train train = new BigTransportTrain("Test Train");
        train.insertVehicle(new Car("BMW", "M8", new GasEngine()));
        train.insertVehicle(new Car("BMW", "M8", new GasEngine()));
        train.insertVehicle(new Car("BMW", "M8", new GasEngine()));
        train.insertVehicle(new Car("BMW", "M8", new GasEngine()));
        train.insertVehicle(new Car("BMW", "M8", new GasEngine()));

        assertFalse(train.insertVehicle(new Car("Final BMW", "M8", new GasEngine())));
    }

    @Test
    void shouldReturnFalseWhenSmallTrainCapacityFull() {
        Train train = new SmallTransportTrain("Test Train");
        train.insertVehicle(new Car("BMW", "M8", new GasEngine()));
        train.insertVehicle(new Car("BMW", "M8", new GasEngine()));
        train.insertVehicle(new Car("BMW", "M8", new GasEngine()));
        train.insertVehicle(new Car("BMW", "M8", new GasEngine()));
        train.insertVehicle(new Car("BMW", "M8", new GasEngine()));
        train.insertVehicle(new Car("BMW", "M8", new GasEngine()));
        train.insertVehicle(new Car("BMW", "M8", new GasEngine()));
        train.insertVehicle(new Car("BMW", "M8", new GasEngine()));

        assertFalse(train.insertVehicle(new Car("Final BMW", "M8", new GasEngine())));
    }
}