package com.harcyah.kata.exercism.pascals_triangle;

import java.util.Arrays;

public class PascalsTriangle {

	public static int[][] computeTriangle(int height) {
		if (height < 0) {
			throw new IllegalArgumentException();
		}

		int[][] triangle = new int[height][];
		if (height == 0) {
			return triangle;
		}

		triangle[0] = new int[] { 1 };
		for (int i = 1; i < height; i++) {
			triangle[i] = buildRow(triangle[i - 1]);
		}
		return triangle;
	}

	public static int[] buildRow(int[] previous) {
		int[] row = new int[previous.length + 1];
		row[0] = 1;
		row[previous.length] = 1;
		for (int i = 0; i < previous.length - 1; i++) {
			row[i + 1] = previous[i] + previous[i + 1];
		}
		return row;
	}

	public static boolean isTriangle(int[][] input) {
		return Arrays.deepEquals(input, computeTriangle(input.length));
	}

}