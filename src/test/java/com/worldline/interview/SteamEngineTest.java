package com.worldline.interview;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SteamEngineTest {

	@Test
	public void testSupportType_WOOD() {
		try{
			SteamEngine steamEngine = new SteamEngine(FuelType.WOOD);
			Assert.assertEquals(true, FuelType.WOOD == steamEngine.getFuelType() );
		}catch(IllegalStateException e){
			fail("only support wood or coal");
		}
	}
	@Test
	public void testSupportType_COAL() {
		try{
			SteamEngine steamEngine = new SteamEngine(FuelType.COAL);
			Assert.assertEquals(true, FuelType.COAL == steamEngine.getFuelType() );
		}catch(IllegalStateException e){
			fail("only support wood or coal");
		}
	}
	
	@Test(expected = IllegalStateException.class)
	public void testSupportType_PETROL() {
		new SteamEngine(FuelType.PETROL);
	}
	
	@Test(expected = IllegalStateException.class)
	public void testSupportType_DIESEL() {
		new SteamEngine(FuelType.DIESEL);
	}

}
