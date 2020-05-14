package com.harcyah.kata.codingbat.map2.wordLen;

import java.util.HashMap;
import java.util.Map;

public class WordLen {

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, s.length());
        }
        return map;
    }

}
