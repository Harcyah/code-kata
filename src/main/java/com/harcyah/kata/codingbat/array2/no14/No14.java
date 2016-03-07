package com.harcyah.kata.codingbat.array2.no14;

public class No14 {

	public boolean no14(int[] nums) {
		boolean no1 = true;
		boolean no4 = true;
		for (int i=0; i<nums.length; i++) {
			if (nums[i] == 1) {
				no1 = false;
			}
			if (nums[i] == 4) {
				no4 = false;
			}
		}
		return no1 || no4;
	}


}


