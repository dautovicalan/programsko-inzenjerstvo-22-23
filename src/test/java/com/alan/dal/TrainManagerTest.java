package com.alan.dal;

import com.alan.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainManagerTest {

    @Test
    void shouldReturnFullyInitializableTrainManagerObject() {
        assertTrue(TrainManager.getInstance() != null);
    }

    @Test
    void shouldCorrectlyInsertCarToDesiredTrain() {
        TerminalFactory.getTerminal()
                .insertVehicle(
                        new Car("BMW", "M8", new GasEngine())
                );
    }

    @Test
    void shouldCorrectlyInsertVanToDesiredTrain() {
        TerminalFactory.getTerminal()
                .insertVehicle(
                        new Van("BMW", "M8", new GasEngine())
                );
    }

    @Test
    void shouldCorrectlyInsertBusToDesiredTrain() {
        TerminalFactory.getTerminal()
                .insertVehicle(
                        new Bus("BMW", "M8", new GasEngine())
                );
    }

    @Test
    void shouldCorrectlyInsertTruckToDesiredTrain() {
        TerminalFactory.getTerminal()
                .insertVehicle(
                        new Truck("BMW", "M8", new GasEngine())
                );
    }

}