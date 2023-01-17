package com.alan.model;

public class Truck extends BigVehicle{
    public Truck(String manufacturer, String model, Engine engine) {
        super(manufacturer, model, engine);
    }
    @Override
    public int calculateTransportationPrice() {
        return 90;
    }
}
