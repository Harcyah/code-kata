package com.harcyah.kata.codingbat.array3.squareUp;

public class SquareUp {

	public int[] squareUp(int n) {
		int[] results = new int[n * n];
		int max = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int v = (n - j);
				if (v <= max) {
					results[(i * n) + j] = v;
				}
			}
			max++;
		}
		return results;
	}

}
