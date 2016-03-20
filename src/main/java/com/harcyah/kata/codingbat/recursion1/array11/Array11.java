package com.harcyah.kata.codingbat.recursion1.array11;

public class Array11 {

	public int array11(int[] nums, int index) {
		if (index == nums.length) {
			return 0;
		}

		return nums[index] == 11 ? 1 + array11(nums, index + 1) : 0 + array11(nums, index + 1);
	}

}
