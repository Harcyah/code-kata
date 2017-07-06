package com.harcyah.kata.exercism.isogram;

import java.util.HashSet;
import java.util.Set;

public class IsogramChecker {

    public boolean isIsogram(String duplicates) {
        Set<Character> characters = new HashSet<>();
        char[] haystack = duplicates.toLowerCase().toCharArray();
        for (char c : haystack) {
            if (!Character.isAlphabetic(c)) {
                continue;
            }

            if (characters.contains(c)) {
                return false;
            }
            characters.add(c);
        }
        return true;
    }

}
