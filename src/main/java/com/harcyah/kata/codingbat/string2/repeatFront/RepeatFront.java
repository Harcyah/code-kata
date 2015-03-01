package com.harcyah.kata.codingbat.string2.repeatFront;

public class RepeatFront {

	public String repeatFront(String str, int n) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++) {
			sb.append(str.substring(0, n - i));
		}
		return sb.toString();
	}

}
