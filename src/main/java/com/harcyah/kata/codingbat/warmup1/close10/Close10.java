package com.harcyah.kata.codingbat.warmup1.close10;

public class Close10 {

	public int close10(int a, int b) {
		int distA = Math.abs(10 - a);
		int distB = Math.abs(10 - b);
		if (distA < distB) {
			return a;
		}
		if (distA > distB) {
			return b;
		}
		return 0;
	}

}