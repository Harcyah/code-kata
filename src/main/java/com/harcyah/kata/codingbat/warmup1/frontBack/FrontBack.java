package com.harcyah.kata.codingbat.warmup1.frontBack;

public class FrontBack {

    public String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }
        int length = str.length();
        return str.charAt(length - 1) + str.substring(1, length - 1) + str.charAt(0);
    }

}