package com.harcyah.kata.projecteuler;

import java.math.BigInteger;

public class Problem020 {

	public static void main(String[] args) {

		BigInteger bi = new BigInteger("1");
		for (int i = 1; i < 101; i++) {
			BigInteger b = new BigInteger(i + "");
			bi = bi.multiply(b);
		}

		String str = bi.toString();
		char[] chars = str.toCharArray();

		int sum = 0;
		for (int i = 0; i < chars.length; i++) {
			int number = Integer.parseInt(chars[i] + "");
			sum += number;
		}

		System.out.println(sum);
	}

}
