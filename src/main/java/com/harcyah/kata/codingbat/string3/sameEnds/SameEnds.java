package com.harcyah.kata.codingbat.string3.sameEnds;

public class SameEnds {

    public String sameEnds(String source) {
        String sub = "";
        for (int i = 0; i <= Math.floor(source.length() / 2.0); i++) {
            String prefix = source.substring(0, i);
            String suffix = source.substring(source.length() - i);
            if (prefix.equals(suffix)) {
                sub = prefix;
            }
        }
        return sub;
    }

}
