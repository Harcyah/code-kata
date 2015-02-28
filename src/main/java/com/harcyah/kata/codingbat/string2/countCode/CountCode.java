package com.harcyah.kata.codingbat.string2.countCode;

public class CountCode {

	public int countCode(String str) {
		if (str.length() < 4) {
			return 0;
		}

		int counter = 0;
		for (int i = 0; i < str.length() - 3; i++) {
			String test = str.substring(i, i + 4);
			if (test.charAt(0) == 'c' && test.charAt(1) == 'o' && test.charAt(3) == 'e') {
				counter++;
			}
		}
		return counter;
	}

}
