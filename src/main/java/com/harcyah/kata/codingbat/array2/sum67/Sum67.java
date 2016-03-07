package com.harcyah.kata.codingbat.array2.sum67;

public class Sum67 {

	public int sum67(int[] nums) {
		int sum = 0;
		boolean inPattern = false;
		for (int i=0; i<nums.length; i++) {
			int v = nums[i];
			if (v == 6) {
				inPattern = true;
				continue;
			}

			if (v == 7 && inPattern) {
				inPattern = false;
				continue;
			}

			if (!inPattern) {
				sum += v;
			}
		}
		return sum;
	}


}
