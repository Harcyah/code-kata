package com.harcyah.kata.projecteuler;

import java.util.Arrays;

public class Problem_018 {

	public int getMaximumSumPath(int[][] triangle) {
		int[][] weights = new int[triangle.length][];
		weights[0] = new int[] { triangle[0][0] };
		for (int level = 1; level < triangle.length; level++) {
			int[] upper = weights[level - 1];
			int[] row = triangle[level];
			weights[level] = new int[row.length];
			for (int i = 0; i < row.length; i++) {
				int value = triangle[level][i];
				int left = getTopLeftOf(i, upper);
				int right = getTopRightOf(i, upper);
				weights[level][i] = value + Math.max(left, right);
			}
		}
		int[] routes = weights[weights.length - 1];
		Arrays.sort(routes);
		return routes[weights.length - 1];
	}

	private int getTopLeftOf(int i, int[] upper) {
		int left = i - 1;
		return left >= 0 ? upper[left] : 0;
	}

	private int getTopRightOf(int i, int[] upper) {
		return i < upper.length ? upper[i] : 0;
	}

}
