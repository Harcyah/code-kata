package com.harcyah.kata.codingbat.map2.wordAppend;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {

    public String wordAppend(String[] strings) {
        String out = "";
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            Integer appears = map.get(s);
            if (appears == null) {
                appears = 1;
            } else {
                appears = appears + 1;
            }
            map.put(s, appears);

            if ((appears > 0) && ((appears % 2) == 0)) {
                out = out + s;
            }
        }
        return out;
    }

}
