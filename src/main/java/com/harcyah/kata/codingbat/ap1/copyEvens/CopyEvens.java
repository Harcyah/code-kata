package com.harcyah.kata.codingbat.ap1.copyEvens;

public class CopyEvens {

	public int[] copyEvens(int[] nums, int count) {
		int[] evens = new int[count];
		int j = 0;
		for (int i = 0; i < nums.length && j < count; i++)
			if (nums[i] % 2 == 0) {
				evens[j] = nums[i];
				j++;
			}
		return evens;
	}

}
