package com.harcyah.kata.codingbat.string3.sameEnds;

public class SameEnds {

	public String sameEnds(String source) {
		String sub = "";
		for (int i = 0; i <= Math.ceil(source.length() / 2); i++) {
			String prefix = source.substring(0, i);
			String suffix = source.substring(source.length() - i, source.length());
			if (prefix.equals(suffix)) {
				sub = prefix;
			}
		}
		return sub;
	}

}
