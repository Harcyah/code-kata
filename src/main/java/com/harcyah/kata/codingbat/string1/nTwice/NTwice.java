package com.harcyah.kata.codingbat.string1.nTwice;

public class NTwice {

	public String nTwice(String str, int n) {
		return str.substring(0, n) + str.substring(str.length() - n);
	}

}
