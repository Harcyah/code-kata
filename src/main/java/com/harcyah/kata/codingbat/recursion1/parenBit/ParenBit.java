package com.harcyah.kata.codingbat.recursion1.parenBit;

public class ParenBit {

    public String parenBit(String str) {
        if (str.startsWith("(")) {
            if (str.endsWith(")")) {
                return str;
            } else {
                return parenBit(str.substring(0, str.length() - 1));
            }
        } else {
            return parenBit(str.substring(1));
        }
    }

}
