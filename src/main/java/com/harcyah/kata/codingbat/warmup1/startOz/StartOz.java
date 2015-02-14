package com.harcyah.kata.codingbat.warmup1.startOz;

public class StartOz {

	public String startOz(String str) {
		StringBuffer results = new StringBuffer();
		if (str.length() >= 1 && str.charAt(0) == 'o') {
			results.append('o');
		}
		if (str.length() >= 2 && str.charAt(1) == 'z') {
			results.append('z');
		}
		return results.toString();
	}

}