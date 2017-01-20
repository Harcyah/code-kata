package com.harcyah.kata.codingbat.recursion1.countAbc;

public class CountAbc {

    public int countAbc(String str) {
        if (str.length() < 3) {
            return 0;
        }

        if (str.equals("abc") || str.equals("aba")) {
            return 1;
        }

        if (str.startsWith("abc") || str.startsWith("aba")) {
            return 1 + countAbc(str.substring(1));
        } else {
            return 0 + countAbc(str.substring(1));
        }
    }

}
