package com.harcyah.kata.codingbat.warmup2.stringTimes;

public class StringTimes {

    public String stringTimes(String str, int n) {
        StringBuffer f = new StringBuffer();
        for (int i = 0; i < n; i++) {
            f.append(str);
        }
        return f.toString();
    }

}
