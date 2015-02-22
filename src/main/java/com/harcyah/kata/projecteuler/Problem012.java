package com.harcyah.kata.projecteuler;

public class Problem012 {

	private static int getNumberOfDivisors(long number) {
		int nod = 0;
		long sqrt = (long) Math.sqrt(number);

		for (int i = 1; i <= sqrt; i++) {
			if (number % i == 0) {
				nod += 2;
			}
		}
		// Correction if the number is a perfect square
		if (sqrt * sqrt == number) {
			nod--;
		}

		return nod;
	}

	public static void main(String[] args) {

		// loop over triangle numbers
		long max = 1;
		long sum = max;
		while (true) {
			max += 1;
			sum += max;

			if (getNumberOfDivisors(sum) > 500) {
				System.out.println("Number magic power = " + sum);
				System.exit(0);
			}
		}

	}

}
