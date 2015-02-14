package com.harcyah.kata.codingbat.warmup1.delDel;

public class DelDel {

	public String delDel(String str) {
		if (str.length() < 4) {
			return str;
		}
		String almostPrefix = str.substring(1, 4);
		return almostPrefix.equals("del") ? str.charAt(0) + str.substring(4) : str;
	}

}