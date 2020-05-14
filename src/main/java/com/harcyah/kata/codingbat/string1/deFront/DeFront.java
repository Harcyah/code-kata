package com.harcyah.kata.codingbat.string1.deFront;

public class DeFront {

    public String deFront(String str) {
        String a = str.charAt(0) == 'a' ? "a" : "";
        String b = str.charAt(1) == 'b' ? "b" : "";
        return a + b + str.substring(2);
    }

}
