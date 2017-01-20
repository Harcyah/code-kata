package com.harcyah.kata.codingbat.warmup2.stringMatch;

public class StringMatch {

    public int stringMatch(String a, String b) {
        int counter = 0;
        int max = Math.min(a.length(), b.length());
        for (int i = 0; i < max - 1; i++) {
            String subA = a.substring(i, i + 2);
            String subB = b.substring(i, i + 2);
            counter += subA.equals(subB) ? 1 : 0;
        }
        return counter;
    }

}
