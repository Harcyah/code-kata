package com.harcyah.kata.codingbat.array3.maxSpan;

public class MaxSpan {

	public int maxSpan(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		int largest = 1;
		for (int tests = 0; tests < nums.length; tests++) {
			int value = nums[tests];
			int current = 1;
			for (int i = tests + 1; i < nums.length; i++) {
				int span = nums[i];
				if (span == value) {
					current = (i - tests) + 1;
				}
			}
			largest = Math.max(largest, current);
		}
		return largest;
	}

}
