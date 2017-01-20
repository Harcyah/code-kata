package com.harcyah.kata.reddit.easy_2016_02_16;

import java.util.Arrays;

public class AtbashCipher {

    private static final char[] PLAIN = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] CIPHER = "zyxwvutsrqponmlkjihgfedcba".toCharArray();

    public String encode(String raw) {
        StringBuffer out = new StringBuffer();
        for (char c : raw.toCharArray()) {
            int index = Arrays.binarySearch(PLAIN, c);
            if (index < 0) {
                out.append(c);
            } else {
                out.append(CIPHER[index]);
            }
        }
        return out.toString();
    }

}
