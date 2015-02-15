package com.harcyah.kata.codingbat.warmup2.doubleX;

public class DoubleX {

	boolean doubleX(String str) {
		int idx = str.indexOf('x');
		if (idx == -1) {
			return false;
		}
		if (idx + 1 == str.length()) {
			return false;
		}
		return str.charAt(idx + 1) == 'x';
	}

}
