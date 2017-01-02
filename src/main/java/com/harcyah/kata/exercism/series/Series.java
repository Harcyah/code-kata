package com.harcyah.kata.exercism.series;

import java.util.ArrayList;
import java.util.List;

public class Series {

    private final List<Integer> digits;

    public Series(String source) {
        this.digits = new ArrayList<>();
        for (int i=0; i<source.length(); i++) {
            String character = source.substring(i, i+1);
            Integer value = Integer.parseInt(character);
            digits.add(value);
        }
    }

    public List<Integer> getDigits() {
        return digits;
    }

    public List<List<Integer>> slices(int length) {
        if (length > digits.size()) {
            throw new IllegalArgumentException();
        }

        List<List<Integer>> slices = new ArrayList<>();
        for (int i=0; i<digits.size() - length + 1; i++) {
            slices.add(digits.subList(i, i+length));
        }

        return slices;
    }

}
