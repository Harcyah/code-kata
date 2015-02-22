package com.harcyah.kata.projecteuler;

public class Problem005 {

	public static void main(String[] args) {
		int value = 1;
		boolean found = false;
		while (found == false) {

			boolean isDivisible = true;
			for (int i = 1; i < 21; i++) {
				if (value % i != 0) {
					isDivisible = false;

				}
			}

			if (isDivisible) {
				System.out.println(value);
				System.exit(0);
			}

			value++;

			if (value % 5000 == 0)
				System.out.println("Testing: " + value);
		}

	}

}
