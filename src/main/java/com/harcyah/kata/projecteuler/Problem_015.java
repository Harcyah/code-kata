package com.harcyah.kata.projecteuler;

public class Problem_015 {

	public long countLatticePaths(int gridSize) {
		long[][] map = new long[gridSize + 1][gridSize + 1];

		for (int i = 0; i <= gridSize; i++) {
			map[i][0] = 1;
			map[0][i] = 1;
		}

		for (int i = 1; i <= gridSize; i++) {
			for (int j = 1; j <= gridSize; j++) {
				map[i][j] = map[i - 1][j] + map[i][j - 1];
			}
		}

		return map[gridSize][gridSize];
	}

}
