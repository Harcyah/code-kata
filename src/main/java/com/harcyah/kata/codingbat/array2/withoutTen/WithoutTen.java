package com.harcyah.kata.codingbat.array2.withoutTen;

public class WithoutTen {

	public int[] withoutTen(int[] nums) {
		int[] out = new int[nums.length];
		int sIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			int v = nums[i];
			if (v != 10) {
				out[sIndex] = v;
				sIndex++;
			}
		}
		return out;
	}

}
