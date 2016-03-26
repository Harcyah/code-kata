package com.harcyah.kata.projecteuler;

import java.math.BigInteger;

public class Problem_016 {

	public int getPowerDigitSum(int limit) {
		BigInteger bi = new BigInteger("2");
		bi = bi.pow(limit);

		String str = bi.toString();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += Integer.parseInt(str.charAt(i) + "");
		}

		return sum;
	}

}
