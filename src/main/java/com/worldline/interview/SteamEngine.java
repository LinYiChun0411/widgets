package com.worldline.interview;

public class SteamEngine extends Engine{
	private boolean running;
    private int fuelLevel;
    private FuelType requiredFuelType;
    private FuelType fuelType;
	private final int BATCH_SIZE = 2;
	
	public SteamEngine(FuelType requiredFuelType) {
			if(requiredFuelType.equals(FuelType.WOOD) || requiredFuelType.equals(FuelType.COAL)){
				this.requiredFuelType = requiredFuelType;
		        running = false;
		        fuelLevel = 0;
			}else{
				throw new IllegalStateException("only support wood or coal");
			}
	        
	}
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
	@Override
	public void fill(FuelType fuelType, int fuelLevel) {
		if (fuelLevel >= 0 && fuelLevel <= 100) {
            this.fuelLevel = fuelLevel;
        }
        else if (fuelLevel > 100) {
            this.fuelLevel = 100;
        }
        else {
            this.fuelLevel = 0;
        }

        this.fuelType = fuelType;
	}
	@Override
	public int getBatchSize() {
		return BATCH_SIZE;
	}
	public FuelType getFuelType() {
	    return  requiredFuelType;
	}

}
