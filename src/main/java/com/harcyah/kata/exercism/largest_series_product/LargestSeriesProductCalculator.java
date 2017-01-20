package com.harcyah.kata.exercism.largest_series_product;

import java.util.ArrayList;
import java.util.List;

public class LargestSeriesProductCalculator {

    private final List<Integer> characters;

    public LargestSeriesProductCalculator(String characters) {
        if (characters == null) {
            throw new IllegalArgumentException("String to search must be non-null.");
        }

        for (int i = 0; i < characters.length(); i++) {
            if (!Character.isDigit(characters.charAt(i))) {
                throw new IllegalArgumentException("String to search may only contains digits.");
            }
        }

        this.characters = new ArrayList<>();
        for (int i = 0; i < characters.length(); i++) {
            this.characters.add(Integer.parseInt(characters.substring(i, i + 1)));
        }
    }

    public long calculateLargestProductForSeriesLength(int length) {
        if (length < 0) {
            throw new IllegalArgumentException("Series length must be non-negative.");
        }

        if (length > characters.size()) {
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }

        if (length == 0) {
            return 1;
        }

        long max = 0;
        for (int i = 0; i < ((characters.size() - length) + 1); i++) {
            long product = 1;
            for (int j = i; j < (i + length); j++) {
                product *= characters.get(j);
            }

            if (product > max) {
                max = product;
            }
        }
        return max;
    }

}