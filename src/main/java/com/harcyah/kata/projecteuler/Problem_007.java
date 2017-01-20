package com.harcyah.kata.projecteuler;

import com.google.common.io.Resources;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

public class Problem_007 {

	protected List<Integer> primes;

	public Problem_007() throws NumberFormatException, IOException {
		primes = Resources.readLines(Resources.getResource("primes-2-to-1299827.txt"), StandardCharsets.UTF_8)
			.stream()
			.map(x -> {
				return Integer.parseInt(x);
			})
			.collect(Collectors.toList());
	}

	public long getNthPrime(int nth) throws NumberFormatException, IOException {
		return primes.get(nth - 1);
	}

}
