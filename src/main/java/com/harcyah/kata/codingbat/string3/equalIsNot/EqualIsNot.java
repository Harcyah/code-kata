package com.harcyah.kata.codingbat.string3.equalIsNot;

public class EqualIsNot {

    public boolean equalIsNot(String source) {
        int is = count(source, "is");
        int not = count(source, "not");
        return is == not;
    }

    private int count(String haystack, String needle) {
        int index;
        int counter = 0;
        int current = 0;
        while ((index = haystack.indexOf(needle, current)) >= 0) {
            counter++;
            current = index + needle.length();
        }
        return counter;
    }

}
