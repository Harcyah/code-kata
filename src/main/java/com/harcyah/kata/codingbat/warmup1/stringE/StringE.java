package com.harcyah.kata.codingbat.warmup1.stringE;

public class StringE {

	public boolean stringE(String str) {
		int es = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e') {
				es++;
			}
		}
		return es >= 1 && es <= 3;
	}

}