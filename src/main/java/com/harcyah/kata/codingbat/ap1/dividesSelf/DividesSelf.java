package com.harcyah.kata.codingbat.ap1.dividesSelf;

public class DividesSelf {

	public boolean dividesSelf(int n) {
		int r = n;
		do {
			int t = r % 10;
			if ((t == 0) || (n % t != 0))
				return false;
			r = r / 10;
		} while (r > 0);
		return true;
	}

}
