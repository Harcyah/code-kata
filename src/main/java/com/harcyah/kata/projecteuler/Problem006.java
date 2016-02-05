package com.harcyah.kata.projecteuler;

public class Problem006 {

	public static void main(String[] args) {

		long sumSquares = 0;
		long squareSum = 0;

		// sum of squares
		for (int i = 1; i < 101; i++) {
			sumSquares += i * i;
			squareSum += i;
		}
		squareSum *= squareSum;

		System.out.println(squareSum - sumSquares);
	}

}
