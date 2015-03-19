package com.harcyah.kata.codingbat.string1.frontAgain;

public class FrontAgain {

	public boolean frontAgain(String str) {
		if (str.length() < 2) {
			return false;
		}

		char a1 = str.charAt(0);
		char b1 = str.charAt(1);
		char a2 = str.charAt(str.length() - 2);
		char b2 = str.charAt(str.length() - 1);
		return a1 == a2 && b1 == b2;
	}

}
