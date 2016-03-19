package com.harcyah.kata.codingbat.recursion1.count7;

public class Count7 {

	public int count7(int n) {
		if ((n % 10) == n) {
			return n == 7 ? 1 : 0;
		}
		int v = (n % 10) == 7 ? 1 : 0;
		return v + count7(n / 10);
	}

}
