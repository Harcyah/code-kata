package com.harcyah.kata.codingbat.map2.firstChar;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {
            String firstChar = s.substring(0, 1);
            String appended = map.get(firstChar);
            if (appended == null) {
                appended = "";
            }
            map.put(firstChar, appended + s);
        }
        return map;
    }

}
