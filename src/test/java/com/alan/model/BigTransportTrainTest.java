package com.alan.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigTransportTrainTest {

    @Test
    void shouldReturnTrueForCorrectTypeOfVehicle() {
        Train train = new BigTransportTrain("Pero");
        assertTrue(train.insertVehicle(new Truck("Test", "Test", new GasEngine())));
    }
    @Test
    void shouldReturnFalseForIncorrectTypeOfVehicle() {
        Train train = new BigTransportTrain("Pero");
        assertFalse(train.insertVehicle(new Car("Test", "Test", new GasEngine())));
    }
}