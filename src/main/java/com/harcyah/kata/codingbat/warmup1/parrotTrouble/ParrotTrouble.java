package com.harcyah.kata.codingbat.warmup1.parrotTrouble;

public class ParrotTrouble {

	public boolean parrotTrouble(boolean talking, int hour) {
		return talking && (hour < 7 || hour > 20);
	}

}
