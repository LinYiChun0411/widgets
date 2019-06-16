package com.worldline.interview;

public abstract class Engine {

    private boolean running;
    private int fuelLevel;
    private FuelType requiredFuelType;
    private FuelType fuelType;
   
    public void start() {
        if (fuelLevel > 0 && requiredFuelType.equals(fuelType)) {
            running = true;
        } else {
            throw new IllegalStateException("Not able to start engine.");
        }
    }

    public void stop() {
        running = false;
    }

    public boolean isRunning() {
        return running;
    }

    public abstract void fill(FuelType fuelType, int fuelLevel);

    public abstract int getBatchSize();
    
    public FuelType getFuelType() {
        return  requiredFuelType;
    }
}
