package com.harcyah.kata.codingbat.array3.fix34;

public class Fix34 {

	public int[] fix34(int[] nums) {
		int lastFour = 0;
		for (int i = 0; i < nums.length; i++) {
			int value = nums[i];
			if (value != 3) {
				continue;
			}

			// Let's find a 4 somewhere but not after a 3
			int four = -1;
			for (int j = lastFour; (j < nums.length) && (four == -1); j++) {
				if ((nums[j] == 4) && ((j > 0) && (nums[j - 1] != 3))) {
					four = j;
				}
			}

			// Swap them
			if (four != -1) {
				int temp = nums[i + 1];
				nums[i + 1] = nums[four];
				nums[four] = temp;
			}

			lastFour = four;
		}

		return nums;
	}

}
