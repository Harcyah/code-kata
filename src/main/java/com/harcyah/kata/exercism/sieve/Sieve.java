package com.harcyah.kata.exercism.sieve;

import java.util.ArrayList;
import java.util.List;

public class Sieve {

	protected int value;

	public Sieve(int value) {
		this.value = value;
	}

	public List<Integer> getPrimes() {
		boolean[] numbers = new boolean[value + 1];

		for (int i = 2; i < numbers.length; i++) {
			if (numbers[i]) {
				continue;
			}

			// mark all multiples
			int prime = i;
			for (int j = prime + 1; j < numbers.length; j++) {
				if (j % prime == 0) {
					numbers[j] = true;
				}
			}
		}

		// keep only non marked numbers
		List<Integer> primes = new ArrayList<>();
		for (int i = 2; i < numbers.length; i++) {
			if (numbers[i] == false) {
				primes.add(i);
			}
		}
		return primes;
	}

}