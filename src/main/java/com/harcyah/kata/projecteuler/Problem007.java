package com.harcyah.kata.projecteuler;

import java.util.ArrayList;
import java.util.List;

public class Problem007 {

	public static void main(String[] args) {
		List<Integer> primes = new ArrayList<Integer>();

		int number = 2;
		while (primes.size() != 10001) {

			boolean isPrime = true;
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrime = false;
					continue;
				}
			}

			if (isPrime) {
				primes.add(number);
				System.out.println("found prime : " + number);
			}

			number++;
		}

	}

}
