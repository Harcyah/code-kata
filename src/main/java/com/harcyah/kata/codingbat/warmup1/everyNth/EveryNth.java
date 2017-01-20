package com.harcyah.kata.codingbat.warmup1.everyNth;

public class EveryNth {

    public String everyNth(String str, int n) {
        StringBuffer f = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (i % n == 0) {
                f.append(str.charAt(i));
            }
        }
        return f.toString();
    }

}