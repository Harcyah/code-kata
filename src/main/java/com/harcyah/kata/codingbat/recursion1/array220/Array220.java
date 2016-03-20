package com.harcyah.kata.codingbat.recursion1.array220;

public class Array220 {

	public boolean array220(int[] nums, int index) {
		if ((index == nums.length) || (index == (nums.length - 1))) {
			return false;
		}

		if ((nums[index] * 10) == nums[index + 1]) {
			return true;
		}

		return array220(nums, index + 1);
	}

}
