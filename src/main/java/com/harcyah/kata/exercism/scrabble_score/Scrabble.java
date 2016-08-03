package com.harcyah.kata.exercism.scrabble_score;

import java.util.HashMap;
import java.util.Map;

public class Scrabble {

	private static final Map<Character, Integer> RULES = new HashMap<>();

	static {
		RULES.put('A', 1);
		RULES.put('E', 1);
		RULES.put('I', 1);
		RULES.put('O', 1);
		RULES.put('U', 1);
		RULES.put('L', 1);
		RULES.put('N', 1);
		RULES.put('R', 1);
		RULES.put('S', 1);
		RULES.put('T', 1);
		RULES.put('D', 2);
		RULES.put('G', 2);
		RULES.put('B', 3);
		RULES.put('C', 3);
		RULES.put('M', 3);
		RULES.put('P', 3);
		RULES.put('F', 4);
		RULES.put('H', 4);
		RULES.put('V', 4);
		RULES.put('W', 4);
		RULES.put('Y', 4);
		RULES.put('K', 5);
		RULES.put('J', 8);
		RULES.put('X', 8);
		RULES.put('Q', 10);
		RULES.put('Z', 10);
	}

	protected int score = 0;

	public Scrabble(String input) {
		String word = input == null ? "" : input;
		for (Character c : word.toCharArray()) {
			score += scoreOf(c);
		}
	}

	private int scoreOf(Character c) {
		return RULES.getOrDefault(Character.toUpperCase(c), 0);
	}

	public int getScore() {
		return score;
	}

}