package com.harcyah.kata.codingbat.string2.endOther;

public class EndOther {

    public boolean endOther(String a, String b) {
        return endsWith(a, b) || endsWith(b, a);
    }

    public boolean endsWith(String tested, String suffix) {
        if (tested.length() < suffix.length()) {
            return false;
        }

        String end = tested.substring(tested.length() - suffix.length());
        return end.equalsIgnoreCase(suffix);
    }

}
