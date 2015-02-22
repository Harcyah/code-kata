package com.harcyah.kata.projecteuler;

import java.util.ArrayList;
import java.util.List;

public class Problem002 {

	public static void main(String[] args) {

		// Fill fibo
		List<Integer> fibo = new ArrayList<Integer>();
		fibo.add(1);
		fibo.add(2);
		do {
			int previous = fibo.get(fibo.size() - 1);
			int preprevious = fibo.get(fibo.size() - 2);
			fibo.add(previous + preprevious);
		} while (fibo.get(fibo.size() - 1) < 4000000);
		System.out.println(fibo);

		// Sum even numbers
		int evenSum = 0;
		for (Integer f : fibo) {
			if (f % 2 == 0) {
				evenSum += f;
			}
		}

		System.out.println(evenSum);

	}

}
