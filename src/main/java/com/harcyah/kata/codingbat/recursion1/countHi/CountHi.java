package com.harcyah.kata.codingbat.recursion1.countHi;

public class CountHi {

	public int countHi(String str) {
		if (str.length() < 2) {
			return 0;
		}

		if (str.startsWith("hi")) {
			return 1 + countHi(str.substring(2));
		}

		return 0 + countHi(str.substring(1));
	}

}
