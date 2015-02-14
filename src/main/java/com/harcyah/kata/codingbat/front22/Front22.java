package com.harcyah.kata.codingbat.front22;

public class Front22 {

	public String front22(String str) {
		String prefix = str.length() < 2 ? str : str.substring(0, 2);
		return prefix + str + prefix;
	}

}