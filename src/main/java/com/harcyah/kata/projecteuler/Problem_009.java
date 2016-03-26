package com.harcyah.kata.projecteuler;

public class Problem_009 {

	public long getSpecialPythagoreanTriplet() {
		for (int a = 1; a < 1000; a++) {
			for (int b = 2; b < 1000; b++) {
				for (int c = 3; c < 1000; c++) {
					if ((a + b + c) == 1000) {
						if (((a * a) + (b * b)) == (c * c)) {
							return a * b * c;
						}
					}
				}
			}
		}
		throw new UnsupportedOperationException();
	}

}
