package com.harcyah.kata.codingbat.string1.extraEnd;

public class ExtraEnd {

	public String extraEnd(String str) {
		String suffix = str.substring(str.length() - 2, str.length());
		return suffix + suffix + suffix;
	}

}
