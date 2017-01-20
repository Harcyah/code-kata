package com.harcyah.kata.codingbat.string1.lastChars;

public class LastChars {

    public String lastChars(String a, String b) {
        String _a = a.length() > 0 ? a.substring(0, 1) : "@";
        String _b = b.length() > 0 ? b.substring(b.length() - 1) : "@";
        return _a + _b;
    }

}
