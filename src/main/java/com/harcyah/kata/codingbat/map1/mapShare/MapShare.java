package com.harcyah.kata.codingbat.map1.mapShare;

import java.util.Map;

public class MapShare {

	public Map<String, String> mapShare(Map<String, String> map) {
		if (map.containsKey("a")) {
			map.put("b", map.get("a"));
		}
		map.remove("c");
		return map;
	}

}