package com.harcyah.kata.codingbat.string1.firstTwo;

public class FirstTwo {

    public String firstTwo(String str) {
        return str.substring(0, Math.min(str.length(), 2));
    }

}
