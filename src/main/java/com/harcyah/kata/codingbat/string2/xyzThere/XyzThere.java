package com.harcyah.kata.codingbat.string2.xyzThere;

public class XyzThere {

    public boolean xyzThere(String str) {
        if (str.startsWith("xyz"))
            return true;

        for (int i = 0; i < str.length() - 3; i++) {
            String test = str.substring(i, i + 4);
            String end = test.substring(1);
            if (test.charAt(0) != '.' && end.equalsIgnoreCase("xyz")) {
                return true;
            }
        }
        return false;
    }

}
