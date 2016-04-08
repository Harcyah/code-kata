package com.harcyah.kata.codingbat.array3.fix45;

public class Fix45 {

	public int[] fix45(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int value = nums[i];
			if (value != 4) {
				continue;
			}

			// Let's find a 5 somewhere but not after a 4
			int five = -1;
			for (int j = 0; (j < nums.length) && (five == -1); j++) {
				if (nums[j] == 5) {
					if ((j == 0) || ((j > 0) && (nums[j - 1] != 4))) {
						five = j;
					}
				}
			}

			// Swap them
			if (five != -1) {
				int temp = nums[i + 1];
				nums[i + 1] = nums[five];
				nums[five] = temp;
			}
		}

		return nums;
	}

}
