package com.harcyah.kata.codingbat.warmup2.stringSplosion;

public class StringSplosion {

    public String stringSplosion(String str) {
        StringBuffer f = new StringBuffer();
        for (int i = 1; i <= str.length(); i++) {
            f.append(str.substring(0, i));
        }
        return f.toString();
    }

}
