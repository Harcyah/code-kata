package com.harcyah.kata.codingbat.array2.zeroFront;

public class ZeroFront {

	public int[] zeroFront(int[] nums) {
		int[] out = new int[nums.length];
		int sIndex = 0;
		int eIndex = nums.length - 1;
		for (int i = 0; i < nums.length; i++) {
			int v = nums[i];
			if (v == 0) {
				out[sIndex] = v;
				sIndex++;
			} else {
				out[eIndex] = v;
				eIndex--;
			}
		}
		return out;
	}

}
