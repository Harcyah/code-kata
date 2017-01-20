package com.harcyah.kata.exercism.anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

    protected String original;
    protected char[] letters;

    public Anagram(String word) {
        this.original = word.toLowerCase();
        this.letters = word.toLowerCase().toCharArray();
        Arrays.sort(letters);
    }

    public List<String> match(List<String> items) {
        List<String> matching = new ArrayList<>();
        for (String item : items) {
            if (original.equalsIgnoreCase(item)) {
                continue;
            }

            char[] characters = item.toLowerCase().toCharArray();
            Arrays.sort(characters);
            if (Arrays.equals(letters, characters)) {
                matching.add(item);
            }
        }
        return matching;
    }

}
