package com.alan.model;

import java.util.Random;

public class ElectricEngine implements Engine{

    private final int upperBound = 101;
    private int randomCapacity;

    public ElectricEngine() {
        this.randomCapacity = new Random().nextInt(upperBound);
    }

    @Override
    public void start() {
        System.out.println("I am driving with electro");
    }

    @Override
    public void stop() {
        System.out.println("I am stopping with electro");
    }

    @Override
    public int showCapacity() {
        return randomCapacity;
    }
}
