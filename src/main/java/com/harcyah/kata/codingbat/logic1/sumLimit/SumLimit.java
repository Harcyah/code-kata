package com.harcyah.kata.codingbat.logic1.sumLimit;

public class SumLimit {

	public int sumLimit(int a, int b) {
		int sum = a + b;
		int sumLength = (int) (Math.log10(sum) + 1);
		int aLength = (int) (Math.log10(a) + 1);
		return (aLength == sumLength) ? sum : a;
	}

}
