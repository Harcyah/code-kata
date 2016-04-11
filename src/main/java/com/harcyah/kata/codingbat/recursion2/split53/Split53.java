package com.harcyah.kata.codingbat.recursion2.split53;

public class Split53 {

	public boolean split53(int[] nums) {
		return canSplit(0, nums, 0, 0);
	}

	private boolean canSplit(int start, int[] nums, int fives, int threes) {
		if (start >= nums.length) {
			return fives == threes;
		}

		int next = start + 1;
		int value = nums[start];
		if ((value % 5) == 0) {
			return canSplit(next, nums, fives + value, threes);
		} else if ((value % 3) == 0) {
			return canSplit(next, nums, fives, threes + value);
		} else {
			return canSplit(next, nums, fives + value, threes) || canSplit(next, nums, fives, threes + value);
		}
	}

}
