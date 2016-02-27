package com.harcyah.kata.codingbat.logic1.in1To10;

public class In1To10 {

	public boolean in1To10(int n, boolean outsideMode) {
		if (outsideMode) {
			return ((n <= 1) || (n >= 10));
		}
		return ((n >= 1) && (n <= 10));
	}

}
