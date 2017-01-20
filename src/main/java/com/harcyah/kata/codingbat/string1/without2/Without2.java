package com.harcyah.kata.codingbat.string1.without2;

public class Without2 {

    public String without2(String str) {
        if (str.length() < 2) {
            return str;
        }
        String suffix = str.substring(str.length() - 2);
        return str.startsWith(suffix) ? str.substring(2) : str;
    }

}
