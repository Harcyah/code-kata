package com.harcyah.kata.codingbat.string1.middleThree;

public class MiddleThree {

    public String middleThree(String str) {
        int length = str.length();
        int half = length / 2;
        return str.substring(half - 1, half + 2);
    }

}
