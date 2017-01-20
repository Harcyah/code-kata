package com.harcyah.kata.codingbat.string1.minCat;

public class MinCat {

    public String minCat(String a, String b) {
        String va = a.length() > b.length() ? a.substring(a.length() - b.length()) : a;
        String vb = b.length() > a.length() ? b.substring(b.length() - a.length()) : b;
        return va + vb;
    }

}
