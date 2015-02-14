package com.harcyah.kata.codingbat.loneTeen;

public class LoneTeen {

	public boolean loneTeen(int a, int b) {
		return (isTeen(a) && !isTeen(b)) || (!isTeen(a) && isTeen(b));
	}

	public boolean isTeen(int v) {
		return v >= 13 && v <= 19;
	}

}