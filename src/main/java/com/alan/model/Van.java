package com.alan.model;

public class Van extends SmallVehicle{
    public Van(String manufacturer, String model, Engine engine) {
        super(manufacturer, model, engine);
    }
    @Override
    public int calculateTransportationPrice() {
        return 80;
    }
}
