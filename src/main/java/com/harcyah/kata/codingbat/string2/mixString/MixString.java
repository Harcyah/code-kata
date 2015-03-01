package com.harcyah.kata.codingbat.string2.mixString;

public class MixString {

	public String mixString(String a, String b) {
		int l = Math.max(a.length(), b.length());
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < l; i++) {
			if (a.length() >= i + 1) {
				sb.append(a.charAt(i));
			}
			if (b.length() >= i + 1) {
				sb.append(b.charAt(i));
			}
		}
		return sb.toString();
	}

}
