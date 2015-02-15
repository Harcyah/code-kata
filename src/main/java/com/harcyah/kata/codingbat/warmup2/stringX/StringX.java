package com.harcyah.kata.codingbat.warmup2.stringX;

public class StringX {

	public String stringX(String str) {
		if (str.equals("") || str.equals("x")) {
			return str;
		}
		StringBuffer f = new StringBuffer();
		f.append(str.charAt(0));
		for (int i = 1; i < str.length() - 1; i++) {
			if (str.charAt(i) != 'x') {
				f.append(str.charAt(i));
			}
		}
		f.append(str.charAt(str.length() - 1));
		return f.toString();
	}

}
