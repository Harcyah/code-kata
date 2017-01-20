package com.harcyah.kata.codingbat.recursion1.countPairs;

public class CountPairs {

    public int countPairs(String str) {
        if (str.length() < 3) {
            return 0;
        }

        char h = str.charAt(0);
        char t = str.charAt(2);

        if (h == t) {
            return 1 + countPairs(str.substring(1));
        } else {
            return 0 + countPairs(str.substring(1));
        }
    }

}
