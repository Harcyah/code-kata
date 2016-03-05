package com.harcyah.kata.codingbat.array1.makeLast;

public class MakeLast {

	public int[] makeLast(int[] nums) {
		int[] out = new int[nums.length * 2];
		out[(nums.length * 2) - 1] = nums[nums.length - 1];
		return out;
	}

}
