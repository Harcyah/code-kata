package com.harcyah.kata.codingbat.array2.pre4;

public class Pre4 {

	public int[] pre4(int[] nums) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				index = i;
				break;
			}
		}

		int[] out = new int[index];
		for (int i = 0; i < out.length; i++) {
			out[i] = nums[i];
		}
		return out;
	}

}
