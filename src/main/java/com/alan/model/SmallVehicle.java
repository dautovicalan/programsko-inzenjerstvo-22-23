package com.alan.model;

public abstract class SmallVehicle extends Vehicle{
    public SmallVehicle(String manufacturer, String model, Engine engine) {
        super(manufacturer, model, engine);
    }
    public abstract int calculateTransportationPrice();
}
