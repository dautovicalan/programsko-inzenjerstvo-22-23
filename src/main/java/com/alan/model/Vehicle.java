package com.alan.model;

public abstract class Vehicle {

    protected String manufacturer;
    protected String model;
    protected Engine engine;

    public abstract int calculateTransportationPrice();

    public Vehicle(String manufacturer, String model, Engine engine) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", engine capacity = " + this.engine.showCapacity() +
                '}';
    }
}
