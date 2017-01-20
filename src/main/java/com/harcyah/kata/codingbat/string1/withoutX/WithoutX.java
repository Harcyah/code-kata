package com.harcyah.kata.codingbat.string1.withoutX;

public class WithoutX {

    public String withoutX(String str) {
        String suffix = str.startsWith("x") ? str.substring(1) : str;
        String prefix = suffix.endsWith("x") ? suffix.substring(0, suffix.length() - 1) : suffix;
        return prefix;
    }

}
