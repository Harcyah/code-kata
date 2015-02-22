package com.harcyah.kata.codingbat.logic2.makeChocolate;

public class MakeChocolate {

	public int makeChocolate(int small, int big, int goal) {
		int bigUsed = 0;
		for (int i = 1; i <= big; i++) {
			if (i * 5 <= goal) {
				bigUsed++;
			}
		}
		int achievableWithBigOnly = bigUsed * 5;
		if (achievableWithBigOnly == goal) {
			return 0;
		}
		int smallNeeded = goal - achievableWithBigOnly;
		if (smallNeeded <= small) {
			return smallNeeded;
		}
		return -1;
	}

}
