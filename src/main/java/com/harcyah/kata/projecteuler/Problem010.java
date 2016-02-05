package com.harcyah.kata.projecteuler;

public class Problem010 {

	public static void main(String[] args) {

		int number = 2;
		long sum = 0;
		while (number < 2000000) {
			boolean isPrime = true;
			for (int i = 2; i < number / 2; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				sum += number;
			}

			number++;

			if (number % 50000 == 0) {
				System.out.println("processed " + number);
			}
		}

		System.out.println(sum);

	}

	// 143042032116 faux
	// 142913828926 faux
	// 142913828922

}
