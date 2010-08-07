package com.don.trading.MovingAverages;

import junit.framework.Assert;

import org.junit.Test;

public class SMATest {

	@Test
	public void testSMA() {
		
		double[] arr = { 1,2,3,4,3,2,1 };
		int period = 2;
		int startIndex = period;
		double avg2 = MovingAverages.SMA(period, arr, startIndex++);
		Assert.assertEquals(avg2,1.5);
		Assert.assertEquals( MovingAverages.SMA(period,arr,startIndex++), 2.5 );
		Assert.assertEquals( MovingAverages.SMA(period,arr,startIndex++), 3.5 );
		Assert.assertEquals( MovingAverages.SMA(period,arr,startIndex++), 3.5 );
		Assert.assertEquals( MovingAverages.SMA(period,arr,startIndex++), 2.5 );
		Assert.assertEquals( MovingAverages.SMA(period,arr,startIndex++), 1.5 );

	}
}
