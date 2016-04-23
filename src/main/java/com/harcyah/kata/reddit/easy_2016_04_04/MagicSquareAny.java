package com.harcyah.kata.reddit.easy_2016_04_04;

import java.util.stream.IntStream;

public class MagicSquareAny {

	public boolean isMagicSquare(int[] square) {
		int size = (int) Math.sqrt(square.length);
		int magicConstant = computeMagicConstant(size);
		int[][] checks = new int[size + size + 2][];
		int check = 0;

		// Horizontal checks
		for (int i = 0; i < size; i++) {
			checks[check++] = IntStream.iterate(i * size, k -> k + 1).limit(size).toArray();
		}

		// Vertical checks
		for (int i = 0; i < size; i++) {
			checks[check++] = IntStream.iterate(i, k -> k + size).limit(size).toArray();
		}

		// Diagonals checks
		checks[check++] = getTopLeftBottomRightDiagonalCheck(size);
		checks[check++] = getTopRightBottomLeftDiagonalCheck(size);

		return isMagicSquare(square, checks, magicConstant);
	}

	protected int[] getTopLeftBottomRightDiagonalCheck(int size) {
		return IntStream.iterate(0, k -> k + size + 1).limit(size).toArray();
	}

	protected int[] getTopRightBottomLeftDiagonalCheck(int size) {
		return IntStream.iterate(size - 1, k -> (k + size) - 1).limit(size).toArray();
	}

	public static int computeMagicConstant(int size) {
		return (size * ((size * size) + 1)) / 2;
	}

	protected boolean isMagicSquare(int[] square, int[][] checks, int magicConstant) {
		for (int[] check : checks) {
			int sum = 0;
			for (int i = 0; i < check.length; i++) {
				sum += square[check[i]];
			}
			if (sum != magicConstant) {
				return false;
			}
		}
		return true;
	}

}
