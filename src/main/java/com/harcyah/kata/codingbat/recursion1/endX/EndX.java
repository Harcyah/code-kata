package com.harcyah.kata.codingbat.recursion1.endX;

public class EndX {

	public String endX(String str) {
		if (str.isEmpty()) {
			return "";
		}

		if (str.length() == 1) {
			return str;
		}

		char c = str.charAt(0);
		if (c == 'x') {
			return endX(str.substring(1)) + 'x';
		} else {
			return c + endX(str.substring(1));
		}
	}

}
