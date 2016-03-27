package com.harcyah.kata.codingbat.array2.notAlone;

public class NotAlone {

	public int[] notAlone(int[] nums, int val) {
		for (int i = 1; i < (nums.length - 1); i++) {
			int left = nums[i - 1];
			int me = nums[i];
			int right = nums[i + 1];
			if ((me == val) && (left != me) && (right != me)) {
				nums[i] = Math.max(left, right);
			}
		}
		return nums;
	}

}
