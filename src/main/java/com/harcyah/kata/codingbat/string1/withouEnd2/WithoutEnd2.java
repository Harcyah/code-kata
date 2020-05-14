package com.harcyah.kata.codingbat.string1.withouEnd2;

public class WithoutEnd2 {

    public String withouEnd2(String str) {
        if (str.length() < 2) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }

}
