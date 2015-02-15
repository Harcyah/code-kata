package com.harcyah.kata.codingbat.warmup2.noTriples;

public class NoTriples {

	public boolean noTriples(int[] nums) {
		if (nums.length < 3) {
			return true;
		}
		for (int i = 2; i < nums.length; i++) {
			if (nums[i - 2] == nums[i - 1] && nums[i - 2] == nums[i]) {
				return false;
			}
		}
		return true;
	}

}
