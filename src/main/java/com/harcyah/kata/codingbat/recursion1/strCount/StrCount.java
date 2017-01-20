package com.harcyah.kata.codingbat.recursion1.strCount;

public class StrCount {

    public int strCount(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }

        if (str.equals(sub)) {
            return 1;
        }

        if (str.startsWith(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        } else {
            return 0 + strCount(str.substring(1), sub);
        }
    }

}
