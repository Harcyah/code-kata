package com.harcyah.kata.codingbat.logic1.twoAsOne;

public class TwoAsOne {

	public boolean twoAsOne(int a, int b, int c) {
		return (a + b == c) || (a + c == b) || (b + c == a);
	}

}
