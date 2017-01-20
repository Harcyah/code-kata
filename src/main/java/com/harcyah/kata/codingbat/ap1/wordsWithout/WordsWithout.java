package com.harcyah.kata.codingbat.ap1.wordsWithout;

import java.util.Arrays;

public class WordsWithout {

    public String[] wordsWithout(String[] source, String target) {
        String[] out = new String[source.length];
        int outIndex = 0;

        for (int i = 0; i < source.length; i++) {
            String current = source[i];
            if (!current.equals(target)) {
                out[outIndex++] = current;
            }
        }

        return Arrays.copyOfRange(out, 0, outIndex);
    }

}
