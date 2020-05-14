package com.harcyah.kata.codingbat.map2.firstSwap;

import java.util.HashSet;
import java.util.Set;

public class FirstSwap {

    public String[] firstSwap(String[] strings) {
        Set<Character> swapped = new HashSet<>();

        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            char sInitial = string.charAt(0);

            if (swapped.contains(sInitial)) {
                continue;
            }

            for (int j = 0; j < i; j++) {
                String needle = strings[j];
                char nInitial = string.charAt(0);

                if (swapped.contains(nInitial)) {
                    continue;
                }

                if (match(string, needle)) {
                    swapped.add(sInitial);
                    swapped.add(nInitial);
                    strings[i] = needle;
                    strings[j] = string;
                }
            }
        }
        return strings;
    }

    private boolean match(String s, String needle) {
        return s.substring(0, 1).equals(needle.substring(0, 1));
    }

}
