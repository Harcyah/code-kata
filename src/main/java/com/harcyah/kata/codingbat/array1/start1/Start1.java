package com.harcyah.kata.codingbat.array1.start1;

public class Start1 {

	public int start1(int[] a, int[] b) {
		int ones = 0;
		ones += (a.length > 0) && (a[0] == 1) ? 1 : 0;
		ones += (b.length > 0) && (b[0] == 1) ? 1 : 0;
		return ones;
	}

}
