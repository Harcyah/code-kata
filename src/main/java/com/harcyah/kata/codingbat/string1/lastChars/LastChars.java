package com.harcyah.kata.codingbat.string1.lastChars;

public class LastChars {

    public String lastChars(String a, String b) {
        String firstOfA = a.length() > 0 ? a.substring(0, 1) : "@";
        String lastOfB = b.length() > 0 ? b.substring(b.length() - 1) : "@";
        return firstOfA + lastOfB;
    }

}
