package com.harcyah.kata.exercism.hexadecimal;

import java.util.Arrays;

public class Hexadecimal {

    private static final char[] LEGAL = "0123456789abcdef".toCharArray();

    public static int toDecimal(String hex) {
        int decimal = 0;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            try {
                int v = getCharValue(c);
                decimal += v * Math.pow(16, hex.length() - i - 1);
            } catch (Exception e) {
                return 0;
            }
        }
        return decimal;
    }

    private static int getCharValue(char c) {
        int index = Arrays.binarySearch(LEGAL, c);
        if (index < 0) {
            throw new IllegalArgumentException();
        }
        return index;
    }

}
