package com.harcyah.kata.codingbat.recursion2.groupSum;

public class GroupSum {

	public boolean groupSum(int start, int[] nums, int target) {
		if (start == nums.length) {
			return target == 0;
		}

		int curr = nums[start];
		return groupSum(start + 1, nums, target - curr) || groupSum(start + 1, nums, target);
	}

}
