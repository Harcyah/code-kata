package com.harcyah.kata.codingbat.string2.catDog;

public class CatDog {

    public boolean catDog(String str) {
        int cats = count("cat", str);
        int dogs = count("dog", str);
        return cats == dogs;
    }

    private int count(String needle, String haystack) {
        int nl = needle.length();
        int count = 0;
        for (int i = 0; i < haystack.length() - (nl - 1); i++) {
            String test = haystack.substring(i, i + nl);
            count += test.equals(needle) ? 1 : 0;
        }
        return count;
    }

}
