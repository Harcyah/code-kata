package com.harcyah.kata.pape;

// http://www.home.hs-karlsruhe.de/~pach0003/informatik_1/aufgaben/en/arrays.html#distance
public class SmallestDistanceBetweenTwoNeighbouring {

	public int get(int[] nums) {
		int smallestValue = Integer.MAX_VALUE;
		int smallestIndex = Integer.MAX_VALUE;
		for (int i = 0; i < (nums.length - 1); i++) {
			int distance = Math.abs(nums[i] - nums[i + 1]);
			if (distance < smallestValue) {
				smallestValue = distance;
				smallestIndex = i;
			}
		}
		return smallestIndex;
	}

}
