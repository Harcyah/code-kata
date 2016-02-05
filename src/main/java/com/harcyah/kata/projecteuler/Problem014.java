package com.harcyah.kata.projecteuler;

public class Problem014 {

	private static final int MAX = 1000000;

	public static void main(String[] args) {

		int max = MAX;

		int maxSteps = 0;
		int maxStepsNumber = 0;

		while (max >= 1) {

			int steps = 0;
			long value = max;

			do {
				if (value % 2 == 0) {
					value = value / 2;
				} else {
					value = 3 * value + 1;
				}
				steps++;
			} while (value > 1);

			if (steps > maxSteps) {
				maxSteps = steps;
				maxStepsNumber = max;
			}

			System.out.println("Number : " + max + " has " + steps + " steps");

			max--;

			if (max % 5000 == 0) {
				System.out.println("Processed " + (MAX - max) + " values");
			}

		}

		System.out.println("Max steps " + maxSteps + " with number " + maxStepsNumber);

	}

}
