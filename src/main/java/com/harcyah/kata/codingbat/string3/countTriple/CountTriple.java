package com.harcyah.kata.codingbat.string3.countTriple;

public class CountTriple {

	public int countTriple(String source) {
		int counter = 0;
		for (int i = 0; i < (source.length() - 2); i++) {
			int c = source.charAt(i);
			int c1 = source.charAt(i + 1);
			int c2 = source.charAt(i + 2);
			if ((c == c1) && (c == c2)) {
				counter++;
			}
		}
		return counter;
	}

}
