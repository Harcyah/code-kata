package com.harcyah.kata.codingbat.ap1.scoreUp;

public class ScoreUp {

	public int scoreUp(String[] key, String[] answers) {
		int score = 0;
		for (int i = 0; i < key.length; i++) {
			String correct = key[i];
			String student = answers[i];
			if (student.equals(correct))
				score += 4;
			else if (student.equals("?") == false)
				score -= 1;
		}
		return score;
	}

}
