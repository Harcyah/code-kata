package com.harcyah.kata.projecteuler;

import java.util.ArrayList;
import java.util.List;

public class Problem003 {

	public static void main(String[] args) {
		long value = 600851475143L;

		List<Long> factors = new ArrayList<Long>();
		for (long i = 2; i <= value; i++) {
			while (value % i == 0) {
				factors.add(i);
				value /= i;
			}
		}

		System.out.println(factors);

	}

}
