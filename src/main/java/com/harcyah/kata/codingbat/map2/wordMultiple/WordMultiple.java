package com.harcyah.kata.codingbat.map2.wordMultiple;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {

	public Map<String, Boolean> wordMultiple(String[] strings) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		for (String s : strings) {
			Boolean presence = map.get(s);
			if (presence == null) {
				map.put(s, false);
			} else if (presence == false) {
				map.put(s, true);
			}
		}
		return map;
	}

}