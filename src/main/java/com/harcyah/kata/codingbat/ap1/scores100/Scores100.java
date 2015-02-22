package com.harcyah.kata.codingbat.ap1.scores100;

public class Scores100 {

	public boolean scores100(int[] scores) {
		int score = Integer.MIN_VALUE;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == 100 && score == 100) {
				return true;
			}
			score = scores[i];
		}
		return false;
	}

}
