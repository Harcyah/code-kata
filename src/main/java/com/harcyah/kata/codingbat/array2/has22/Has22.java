package com.harcyah.kata.codingbat.array2.has22;

public class Has22 {

	public boolean has22(int[] nums) {
		if (nums.length < 2) {
			return false;
		}

		for (int i=1; i<nums.length; i++) {
			if (nums[i] == 2 && nums[i-1] == 2) {
				return true;
			}
		}
		return false;
	}

}


