package com.alan.model;

public class Bus extends BigVehicle{
    public Bus(String manufacturer, String model, Engine engine) {
        super(manufacturer, model, engine);
    }
    @Override
    public int calculateTransportationPrice() {
        return 70;
    }
}
