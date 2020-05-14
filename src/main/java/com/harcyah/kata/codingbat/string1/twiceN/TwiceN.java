package com.harcyah.kata.codingbat.string1.twiceN;

public class TwiceN {

    public String twiceN(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

}
