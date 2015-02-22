package com.harcyah.kata.codingbat.ap1.wordsWithoutList;

import java.util.ArrayList;
import java.util.List;

public class WordsWithoutList {

	public List<String> wordsWithoutList(String[] words, int len) {
		List<String> output = new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() != len)
				output.add(words[i]);
		}
		return output;
	}

}
