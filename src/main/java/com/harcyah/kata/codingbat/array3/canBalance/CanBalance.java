package com.harcyah.kata.codingbat.array3.canBalance;

public class CanBalance {

	public boolean canBalance(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int left = 0;
			int right = 0;
			for (int j = 0; j < nums.length; j++) {
				if (j <= i) {
					left += nums[j];
				}
				if (j > i) {
					right += nums[j];
				}
			}
			if (left == right) {
				return true;
			}
		}
		return false;
	}

}
