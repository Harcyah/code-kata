package com.harcyah.kata.codingbat.map1.mapAb;

import java.util.Map;

public class MapAb {

    public Map<String, String> mapAb(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

}
