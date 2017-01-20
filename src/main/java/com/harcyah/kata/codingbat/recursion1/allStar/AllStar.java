package com.harcyah.kata.codingbat.recursion1.allStar;

public class AllStar {

    public String allStar(String str) {
        if (str.length() < 2) {
            return str;
        }

        return str.charAt(0) + "*" + allStar(str.substring(1));

    }

}
