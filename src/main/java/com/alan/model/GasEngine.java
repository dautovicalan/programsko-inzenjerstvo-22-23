package com.alan.model;

import java.util.Random;

public class GasEngine implements Engine{

    private final int upperBound = 101;
    private int randomCapacity;

    public GasEngine() {
        this.randomCapacity = new Random().nextInt(upperBound);
    }

    @Override
    public void start() {
        System.out.println("I am driving with gas");
    }

    @Override
    public void stop() {
        System.out.println("I am stopping with gas");
    }

    @Override
    public int showCapacity() {
        return randomCapacity;
    }
}
