package com.harcyah.kata.codingbat.array2.has77;

public class Has77 {

	public boolean has77(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 7) {
				int plus1 = i + 1;
				int plus2 = i + 2;
				if ((plus1 < nums.length) && (nums[plus1] == 7)) {
					return true;
				}
				if ((plus2 < nums.length) && (nums[plus2] == 7)) {
					return true;
				}
			}
		}
		return false;
	}

}
