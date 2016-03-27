package com.harcyah.kata.codingbat.array2.modThree;

public class ModThree {

	public boolean modThree(int[] nums) {
		int oddRow = 0;
		int evenRow = 0;
		for (int i = 0; i < nums.length; i++) {
			int v = nums[i];
			if ((v % 2) == 0) {
				evenRow++;
				oddRow = 0;
				if (evenRow == 3) {
					return true;
				}
			} else {
				oddRow++;
				evenRow = 0;
				if (oddRow == 3) {
					return true;
				}
			}
		}
		return false;
	}

}
