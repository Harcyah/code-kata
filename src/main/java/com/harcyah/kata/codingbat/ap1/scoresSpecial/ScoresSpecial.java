package com.harcyah.kata.codingbat.ap1.scoresSpecial;

public class ScoresSpecial {

	public int scoresSpecial(int[] scoresLeft, int[] scoresRight) {
		return largestMultipleOf(scoresLeft, 10) + largestMultipleOf(scoresRight, 10);
	}

	private int largestMultipleOf(int[] scoresLeft, int target) {
		int max = 0;
		for (int i = 0; i < scoresLeft.length; i++) {
			if ((scoresLeft[i] % 10) == 0) {
				if (max < scoresLeft[i]) {
					max = scoresLeft[i];
				}
			}
		}
		return max;
	}

}
