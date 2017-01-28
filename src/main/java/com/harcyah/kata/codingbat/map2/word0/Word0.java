package com.harcyah.kata.codingbat.map2.word0;

import java.util.HashMap;
import java.util.Map;

public class Word0 {

	public Map<String, Integer> word0(String[] strings) {
		Map<String, Integer> map = new HashMap<>();
		for (String s : strings) {
			map.put(s, 0);
		}
		return map;
	}

}