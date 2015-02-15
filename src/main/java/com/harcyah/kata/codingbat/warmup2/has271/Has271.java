package com.harcyah.kata.codingbat.warmup2.has271;

public class Has271 {

	public boolean has271(int[] nums) {
		if (nums.length < 3) {
			return false;
		}
		for (int i = 0; i < nums.length - 2; i++) {
			if (hasPattern(nums[i], nums[i + 1], nums[i + 2])) {
				return true;
			}
		}
		return false;
	}

	public boolean hasPattern(int a, int b, int c) {
		int expectedC = a - 1;
		int delta = Math.abs(c - expectedC);
		return b == (a + 5) && (delta <= 2);
	}

}
