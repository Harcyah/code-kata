package com.harcyah.kata.projecteuler;

import java.util.HashSet;
import java.util.Set;

public class Problem009 {

	private static class Triplet {
		public int a;
		public int b;
		public int c;
	}

	public static void main(String[] args) {

		// Search all triplets where a+b+c == 1000
		Set<Triplet> triplets = new HashSet<Problem009.Triplet>();
		for (int a = 1; a < 1000; a++) {
			for (int b = 2; b < 1000; b++) {
				for (int c = 3; c < 1000; c++) {
					if (a + b + c == 1000) {
						Triplet t = new Triplet();
						t.a = a;
						t.b = b;
						t.c = c;
						triplets.add(t);
					}
				}
			}
		}
		System.out.println("found " + triplets.size() + " triplets");

		// Search in this set the one where a�+b�=c�
		for (Triplet triplet : triplets) {
			if ((triplet.a * triplet.a) + (triplet.b * triplet.b) == (triplet.c * triplet.c)) {
				System.out.println("Found! : ");
				System.out.println("a: " + triplet.a);
				System.out.println("b: " + triplet.b);
				System.out.println("c: " + triplet.c);
				System.out.println("product: " + (triplet.a * triplet.b * triplet.c));
			}
		}

	}

}
