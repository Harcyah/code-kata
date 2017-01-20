package com.harcyah.kata.codingbat.recursion1.strDist;

public class StrDist {

    public int strDist(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }

        if (str.startsWith(sub)) {
            if (str.endsWith(sub)) {
                return str.length();
            } else {
                return strDist(str.substring(0, str.length() - 1), sub);
            }
        } else {
            return strDist(str.substring(1), sub);
        }
    }

}
