package com.harcyah.kata.exercism.etl;

import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Etl {
	public Map<String, Integer> transform(Map<Integer, List<String>> old) {
		Map<String, Integer> scores = Maps.newHashMap();
		for (Entry<Integer, List<String>> entry : old.entrySet()) {
			List<String> names = entry.getValue();
			for (String name : names) {
				scores.put(name.toLowerCase(), entry.getKey());
			}
		}
		return scores;
	}

}
