package com.harcyah.kata.codingbat.array2.haveThree;

public class HaveThree {

	public boolean haveThree(int[] nums) {
		if (nums.length < 5) {
			return false;
		}

		int[] indeces = new int[] { -1, -1, -1 };
		int currentIndex = 0;

		for (int i = 0; i < nums.length; i++) {
			int value = nums[i];
			if (value == 3) {
				if (currentIndex < indeces.length) {
					indeces[currentIndex] = i;
					currentIndex++;
				} else {
					return false;
				}
			}
		}

		return (indeces[0] != -1)
			&& (indeces[1] != -1)
			&& (indeces[2] != -1)
			&& ((indeces[1] - indeces[0]) > 1)
			&& ((indeces[2] - indeces[1]) > 1);
	}

}
