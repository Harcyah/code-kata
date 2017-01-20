package com.harcyah.kata.exercism.trinary;

public class Trinary {

    public static int toDecimal(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        int value = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c != '0' && c != '1' && c != '2') {
                return 0;
            }

            int t = Math.abs('2' - c - 2);
            int r = chars.length - i - 1;
            value += t * Math.pow(3, r);
        }
        return value;
    }

}