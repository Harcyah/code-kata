package com.harcyah.kata.codingbat.array2.bigDiff;

public class BigDiff {

	public int bigDiff(int[] nums) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i=0; i<nums.length; i++) {
			min = Math.min(min, nums[i]);
			max = Math.max(max, nums[i]);
		}
		return max - min;
	}


}


