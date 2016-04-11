package com.harcyah.kata.codingbat.recursion2.groupSum5;

public class GroupSum5 {

	public boolean groupSum5(int start, int[] nums, int target) {
		if (start == nums.length) {
			return target == 0;
		}

		int curr = nums[start];
		if ((curr % 5) == 0) {
			int next = start + 1;
			if ((next < nums.length) && (nums[next] == 1)) {
				return groupSum5(start + 2, nums, target - curr);
			} else {
				return groupSum5(start + 1, nums, target - curr);
			}
		}

		return groupSum5(start + 1, nums, target - curr) || groupSum5(start + 1, nums, target);

	}

}
