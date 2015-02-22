package com.harcyah.kata.codingbat.ap1.copyEndy;

public class CopyEndy {

	public int[] copyEndy(int[] nums, int count) {
		int index = 0;
		int[] ends = new int[count];
		for (int i = 0; (i < nums.length) && (index < (count)); i++) {
			int a = nums[i];
			if (isEndy(a)) {
				ends[index] = a;
				index++;
			}
		}
		return ends;
	}

	public boolean isEndy(int n) {
		return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
	}

}
