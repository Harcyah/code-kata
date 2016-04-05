package com.harcyah.kata.reddit.easy_2016_04_04;

public class MagicSquare3x3 {

	private static final int[][] CHECKS = {
		{ 0, 1, 2 },
		{ 3, 4, 5 },
		{ 6, 7, 8 },
		{ 0, 3, 6 },
		{ 1, 4, 7 },
		{ 2, 5, 8 },
		{ 0, 4, 8 },
		{ 2, 4, 6 },
	};

	private static final int MAGIC_CONSTANT = 15;

	public boolean isMagicSquare(int[] square) {
		for (int[] check : CHECKS) {
			int sum = 0;
			for (int i = 0; i < check.length; i++) {
				sum += square[check[i]];
			}
			if (sum != MAGIC_CONSTANT) {
				return false;
			}
		}
		return true;
	}

}
