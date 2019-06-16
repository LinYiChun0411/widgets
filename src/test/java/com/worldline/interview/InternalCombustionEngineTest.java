package com.worldline.interview;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class InternalCombustionEngineTest {

	@Test
	public void testSupportType_PETROL() {
		try{
			InternalCombustionEngine internalCombustionEngine = new InternalCombustionEngine(FuelType.PETROL);
			Assert.assertEquals(true, FuelType.PETROL==internalCombustionEngine.getFuelType() );
		}catch(IllegalStateException e){
			fail("only support petrol or diesel");
		}
	}
	
	@Test
	public void testSupportType_DIESEL() {
		try{
			InternalCombustionEngine internalCombustionEngine = new InternalCombustionEngine(FuelType.DIESEL);
			Assert.assertEquals(true, FuelType.DIESEL==internalCombustionEngine.getFuelType());
		}catch(IllegalStateException e){
			fail("only support petrol or diesel");
		}
	}
	
	@Test(expected = IllegalStateException.class)
	public void testSupportType_WOOD() {
		new InternalCombustionEngine(FuelType.WOOD);
	}
	
	@Test(expected = IllegalStateException.class)
	public void testSupportType_COAL() {
		new InternalCombustionEngine(FuelType.COAL);
	}
}
