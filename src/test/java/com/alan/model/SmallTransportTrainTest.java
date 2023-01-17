package com.alan.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallTransportTrainTest {

    @Test
    void shouldReturnTrueForCorrectTypeOfVehicle() {
        Train train = new SmallTransportTrain("Pero");
        assertTrue(train.insertVehicle(new Car("Test", "Test", new GasEngine())));
    }
    @Test
    void shouldReturnFalseForIncorrectTypeOfVehicle() {
        Train train = new SmallTransportTrain("Pero");
        assertFalse(train.insertVehicle(new Bus("Test", "Test", new GasEngine())));
    }
}