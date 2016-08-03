package com.harcyah.kata.exercism.word_count;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

	public Map<String, Integer> phrase(String source) {
		Map<String, Integer> counter = new HashMap<>();
		String[] tokens = source.split("\\W");
		for (String token : tokens) {
			if (token.trim().isEmpty()) {
				continue;
			}

			String needle = token.toLowerCase();
			int count = counter.getOrDefault(needle, 0) + 1;
			counter.put(needle, count);
		}
		return counter;
	}


}
