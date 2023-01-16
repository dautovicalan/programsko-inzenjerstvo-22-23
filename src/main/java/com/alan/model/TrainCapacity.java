package com.alan.model;

public enum TrainCapacity {
    BIG_TRAIN(6),
    SMALL_TRAIN(8);

    public final int capacity;
    TrainCapacity(int capacity) {
        this.capacity = capacity;
    }
}
