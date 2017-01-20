package com.harcyah.kata.codingbat.string1.hasBad;

public class HasBad {

    public boolean hasBad(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("bad"))
            return true;

        if (str.length() >= 4 && str.substring(1, 4).equals("bad"))
            return true;

        return false;
    }

}
