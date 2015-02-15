package com.harcyah.kata.codingbat.warmup2.arrayFront9;

public class ArrayFront9 {

	public boolean arrayFront9(int[] nums) {
		for (int i = 0; i < nums.length && i < 4; i++) {
			if (nums[i] == 9)
				return true;
		}
		return false;
	}

}
