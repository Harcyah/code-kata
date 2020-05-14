package com.harcyah.kata.codingbat.map2.wordCount;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : strings) {
            Integer count = map.get(s);
            if (count == null) {
                count = 0;
            }
            map.put(s, count + 1);
        }
        return map;

    }

}
