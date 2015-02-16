package com.harcyah.kata.codingbat.warmup1.diff21;

public class Diff21 {

	public int diff21(int i) {
		int diff = Math.abs(21 - i);
		return diff * (i > 21 ? 2 : 1);
	}

}
