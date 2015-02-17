package com.harcyah.kata.codingbat.string1.twoChar;

public class TwoChar {

	public String twoChar(String str, int index) {
		if (index + 1 >= str.length() || index < 0) {
			index = 0;
		}
		return str.substring(index, index + 2);
	}

}
