package com.harcyah.kata.codingbat.warmup2.countXX;

public class CountXX {

	int countXX(String str) {
		int x = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
				x++;
			}
		}
		return x;
	}

}
