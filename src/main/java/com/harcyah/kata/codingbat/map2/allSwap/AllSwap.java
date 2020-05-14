package com.harcyah.kata.codingbat.map2.allSwap;

import java.util.HashMap;
import java.util.Map;

public class AllSwap {

    public String[] allSwap(String[] strings) {
        Map<Integer, Boolean> swapped = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            swapped.put(i, false);
        }

        for (int i = 0; i < strings.length; i++) {
            if (swapped.get(i)) {
                continue;
            }

            String s = strings[i];
            for (int j = 0; j < i; j++) {
                if (swapped.get(j)) {
                    continue;
                }

                String needle = strings[j];

                if (match(s, needle)) {
                    swapped.put(i, true);
                    swapped.put(j, true);
                    strings[i] = needle;
                    strings[j] = s;
                }
            }
        }
        return strings;
    }

    private boolean match(String s, String needle) {
        return s.substring(0, 1).equals(needle.substring(0, 1));
    }

}
