package com.harcyah.kata.codingbat.posNeg;

public class PosNeg {

	public boolean posNeg(int a, int b, boolean negative) {
		return negative ? a < 0 && b < 0 : (a < 0 && b > 0) || (a > 0 && b < 0);
	}

}