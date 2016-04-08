package com.harcyah.kata.codingbat.array3.seriesUp;

public class SeriesUp {

	public int[] seriesUp(int n) {
		int[] results = new int[(n * (n + 1)) / 2];
		int index = 0;
		int rank = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < rank; j++) {
				results[index++] = j + 1;
			}
			rank++;
		}
		return results;
	}

}
