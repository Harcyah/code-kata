package com.harcyah.kata.codingbat.string1.lastTwo;

public class LastTwo {

    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }

        char a = str.charAt(str.length() - 2);
        char b = str.charAt(str.length() - 1);
        return str.substring(0, str.length() - 2) + b + a;
    }

}
