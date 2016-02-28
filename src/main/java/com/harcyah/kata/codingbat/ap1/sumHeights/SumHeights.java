package com.harcyah.kata.codingbat.ap1.sumHeights;

public class SumHeights {

	public int sumHeights(int[] heights, int start, int end) {
		int sum = 0;
		for (int i = start; i < end; i++) {
			int lo = heights[i];
			int hi = heights[i + 1];
			sum += Math.abs(lo - hi);
		}
		return sum;
	}

}
