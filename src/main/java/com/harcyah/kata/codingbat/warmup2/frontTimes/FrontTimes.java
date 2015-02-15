package com.harcyah.kata.codingbat.warmup2.frontTimes;

public class FrontTimes {

	public String frontTimes(String str, int n) {
		String prefix = str.length() < 3 ? str : str.substring(0, 3);
		StringBuffer f = new StringBuffer();
		for (int i = 0; i < n; i++) {
			f.append(prefix);
		}
		return f.toString();
	}

}
