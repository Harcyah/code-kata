package com.harcyah.kata.projecteuler;

import java.math.BigInteger;

public class Problem_025 {

	public int getFibonacciSequenceLength(int limit) {
		BigInteger p = BigInteger.ONE;
		BigInteger v = BigInteger.ONE;
		int f = 2;
		while (String.valueOf(v).length() < limit) {
			BigInteger p_p = p;
			BigInteger p_v = v;
			p = v;
			v = p_p.add(p_v);
			f++;
		}
		return f;
	}

}
