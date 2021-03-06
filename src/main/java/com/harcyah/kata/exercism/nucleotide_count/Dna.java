package com.harcyah.kata.exercism.nucleotide_count;

import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
public class Dna {

    private static final char[] VALID_NUCLEOTIDES = new char[]{'A', 'C', 'G', 'T'};

    protected String string;

    public int count(char c) {
        if (Arrays.binarySearch(VALID_NUCLEOTIDES, c) < 0) {
            throw new IllegalArgumentException();
        }
        return (int) string.chars().filter(x -> x == c).count();
    }

    public Map<Character, Integer> nucleotideCounts() {
        Map<Character, Integer> counts = new HashMap<>();
        for (char nucleotide : VALID_NUCLEOTIDES) {
            counts.put(nucleotide, count(nucleotide));
        }
        return counts;
    }

}
