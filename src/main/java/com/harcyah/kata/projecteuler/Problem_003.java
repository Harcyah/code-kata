package com.harcyah.kata.projecteuler;

import java.util.ArrayList;
import java.util.List;

public class Problem_003 {

	public long largestPrimeFactor(long n) {
		List<Long> factors = new ArrayList<Long>();
		for (long i = 2; i <= n; i++) {
			while (n % i == 0) {
				factors.add(i);
				n /= i;
			}
		}
		return factors.get(factors.size() - 1);
	}

}
