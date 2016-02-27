package com.harcyah.kata.codingbat.logic1.nearTen;

public class NearTen {

	public boolean nearTen(int n) {
		int m2 = n - 2;
		int m1 = n - 1;
		int p1 = n + 1;
		int p2 = n + 2;
		return ((m2 % 10) == 0) || ((m1 % 10) == 0) || ((n % 10) == 0) || ((p1 % 10) == 0) || ((p2 % 10) == 0);
	}

}
