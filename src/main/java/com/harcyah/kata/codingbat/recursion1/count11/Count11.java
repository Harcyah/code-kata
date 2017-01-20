package com.harcyah.kata.codingbat.recursion1.count11;

public class Count11 {

    public int count11(String str) {
        if (str.length() < 2) {
            return 0;
        }

        if (str.startsWith("11")) {
            return 1 + count11(str.substring(2));
        }

        return 0 + count11(str.substring(1));
    }

}
