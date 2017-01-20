package com.harcyah.kata.codingbat.recursion1.countHi2;

public class CountHi2 {

    public int countHi2(String str) {
        if (str.length() < 2) {
            return 0;
        }

        if (str.startsWith("xhi")) {
            return 0 + countHi2(str.substring(3));
        }

        if (str.startsWith("hi")) {
            return 1 + countHi2(str.substring(2));
        }

        return 0 + countHi2(str.substring(1));
    }

}
