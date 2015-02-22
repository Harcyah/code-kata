package com.harcyah.kata.projecteuler;

import org.apache.commons.lang3.StringUtils;

public class Problem004 {

	public int getLargestPalindrome(int width) {
		int rMin = (int) Math.pow(10, width - 1);
		int rMax = (int) (Math.pow(10, width) - 1);
		int max = 0;
		for (int i = rMin; i <= rMax; i++) {
			for (int j = rMin; j <= rMax; j++) {
				int product = i * j;
				if (max <= product && isPalindrome(product)) {
					max = product;
				}
			}
		}
		return max;
	}

	private boolean isPalindrome(long number) {
		String v = String.valueOf(number);
		return v.equals(StringUtils.reverse(v));
	}

}
