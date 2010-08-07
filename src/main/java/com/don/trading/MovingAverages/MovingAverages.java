package com.don.trading.MovingAverages;

public class MovingAverages {

	/**
	 * Calculate the Simple Moving Average value, summing up the previous N-period up to N element
	 * Basically if we have period of 5, we ignore the first 4 values in the array, only starts calculating from 5th element.  
	 * @param period
	 * @param vals
	 * @param skipdays
	 * @return
	 */
	public static double SMA(int period, double[] vals, int skipdays) {
		// arr 1 2 3 4 5 5 4
		// period 3
		// skipdays = 2
		// avg = arr[0] + arr[1] + arr[2] /  period
		// arr[skipdays-period] + arr[skipdays-period+1] ...+ arr[skipdays]
		double value = 0.0;

		// calculate using previous values, not later values
		for(int i=skipdays-period; i<skipdays; i++) {
			value += vals[i];
		}

		value /= (double) period;

		return value;
	}

	
}
