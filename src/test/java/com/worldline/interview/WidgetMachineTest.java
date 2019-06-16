package com.worldline.interview;


import org.junit.Assert;
import org.junit.Test;

public class WidgetMachineTest {
	
	@Test
	public void testProduceWidgets_InternalCombustionEngine_PETROL() {
		Engine internalCombustionEngine= new InternalCombustionEngine(FuelType.PETROL);
		internalCombustionEngine.fill(FuelType.PETROL, 1);
		WidgetMachine widgetMachine= new WidgetMachine(internalCombustionEngine);
	    Assert.assertEquals(true, 18.0==widgetMachine.produceWidgets(16) );// 16 / 8 = 2(batch) -> 2 * 9 = 18 (cost)
	}
	@Test
	public void testProduceWidgets_InternalCombustionEngine_DIESEL() {
		Engine internalCombustionEngine= new InternalCombustionEngine(FuelType.DIESEL);
		internalCombustionEngine.fill(FuelType.DIESEL, 1);
		WidgetMachine widgetMachine= new WidgetMachine(internalCombustionEngine);
	    Assert.assertEquals(true, 24.0==widgetMachine.produceWidgets(16));// 16 / 8 = 2(batch) -> 2 * 12 = 24 (cost)
	}
	@Test
	public void testProduceWidgets_SteamEngine_WOOD() {
		Engine steamEngine= new SteamEngine(FuelType.WOOD);
		steamEngine.fill(FuelType.WOOD, 1);
		WidgetMachine widgetMachine= new WidgetMachine(steamEngine);
	    Assert.assertEquals(true, 21.75 == widgetMachine.produceWidgets(10) );// 10 / 2 = 5(batch) -> 5 * 4.35 = 21.75 (cost)
	}
	@Test
	public void testProduceWidgets_SteamEngine_COAL() {
		Engine steamEngine= new SteamEngine(FuelType.COAL);
		steamEngine.fill(FuelType.COAL, 1);
		WidgetMachine widgetMachine= new WidgetMachine(steamEngine);
	    Assert.assertEquals(true, 28.25 == widgetMachine.produceWidgets(10));// 10 / 2 = 5(batch) -> 5 * 5.65 = 28.25 (cost)
	}

}
