package com.harcyah.kata.codingbat.array2.has12;

public class Has12 {

	public boolean has12(int[] nums) {
		int indexOfOne = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				indexOfOne = i;
				break;
			}
		}

		if (indexOfOne == -1) {
			return false;
		}

		for (int i = indexOfOne + 1; i < nums.length; i++) {
			if (nums[i] == 2) {
				return true;
			}
		}
		return false;
	}

}
