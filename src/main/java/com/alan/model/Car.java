package com.alan.model;

public class Car extends Vehicle {
    public Car(String manufacturer, String model, Engine engine) {
        super(manufacturer, model, engine);
    }
    @Override
    public int calculateTransportationPrice() {
        return 50;
    }
}
