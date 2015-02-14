package com.harcyah.kata.codingbat.notString;

public class NotString {

	public String notString(String str) {
		return str.startsWith("not") ? str : "not " + str;
	}

}