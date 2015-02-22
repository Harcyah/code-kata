package com.harcyah.kata.reddit.medium_20150218;

import org.joda.time.LocalDate;

// http://www.reddit.com/r/dailyprogrammer/comments/2wbvuu/20150218_challenge_202_intermediate_easter/
public class EasterComputer {

	// Butcher/Meess algorithm
	public LocalDate compute(int year) {
		int n = year % 19;
		int c = year / 100;
		int u = year % 100;
		int q = (c - ((c + 8) / 25) + 1) / 3;
		int e = (19 * n + c - (c / 4) - q + 15) % 30;
		int L = (32 + 2 * (c % 5) + 2 * (u / 4) - e - (u % 4)) % 7;
		int h = (n + 11 * e + 22 * L) / 451;
		int r = (e + L - 7 * h + 114);
		int m = r / 31;
		int j = r % 31;
		return new LocalDate(year, m, j + 1);
	}

}
