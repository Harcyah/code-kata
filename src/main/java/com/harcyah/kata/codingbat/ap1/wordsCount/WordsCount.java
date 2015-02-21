package com.harcyah.kata.codingbat.ap1.wordsCount;

public class WordsCount {

	public int wordsCount(String[] words, int len) {
		int count = 0;
		for (String word : words) {
			count += word.length() == len ? 1 : 0;
		}
		return count;
	}

}
