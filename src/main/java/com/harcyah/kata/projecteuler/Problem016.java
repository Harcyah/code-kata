package com.harcyah.kata.projecteuler;

import java.math.BigInteger;

public class Problem016 {

	public static void main(String[] args) {

		BigInteger bi = new BigInteger("2");
		bi = bi.pow(1000);

		String v = bi.toString();
		char[] chars = v.toCharArray();

		int sum = 0;
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			String s = new String(c + "");
			int value = Integer.valueOf(s);
			sum += value;
		}

		System.out.println(sum);

	}

}
