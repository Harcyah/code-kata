package com.harcyah.kata.codingbat.string2.sameStarChar;

public class SameStarChar {

	public boolean sameStarChar(String source) {
		for (int i = 1; i < (source.length() - 1); i++) {
			char b = source.charAt(i - 1);
			char c = source.charAt(i);
			char a = source.charAt(i + 1);
			if ((c == '*') && (b != a)) {
				return false;
			}
		}
		return true;
	}

}
