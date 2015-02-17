package com.harcyah.kata.codingbat.string1.atFirst;

public class AtFirst {

	public String atFirst(String str) {
		StringBuffer at = new StringBuffer("@@");
		if (str.length() >= 2)
			at.setCharAt(1, str.charAt(1));
		if (str.length() >= 1)
			at.setCharAt(0, str.charAt(0));
		return at.toString();
	}

}
