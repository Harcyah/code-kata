package com.harcyah.kata.reddit.easy_2014_02_24;

import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;

public class Disemvoweler {

    private static final char[] VOWELS = new char[]{'a', 'e', 'i', 'o', 'u'};

    public Pair<String, String> disemvowele(String src) {
        MutablePair<String, String> pair = new MutablePair<>();
        pair.setLeft("");
        pair.setRight("");
        for (int i = 0; i < src.length(); i++) {
            char c = src.charAt(i);
            if (!Character.isAlphabetic(c)) {
                continue;
            }

            if (Arrays.binarySearch(VOWELS, c) >= 0) {
                pair.setLeft(pair.getLeft() + c);
            } else {
                pair.setRight(pair.getRight() + c);
            }
        }
        return pair;
    }

}
