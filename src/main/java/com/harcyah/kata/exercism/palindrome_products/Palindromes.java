package com.harcyah.kata.exercism.palindrome_products;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class Palindromes {

    public static class PalindromeListBuilder {

        int minFactor = 1;
        int maxFactor = Integer.MAX_VALUE;

        public PalindromeListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor = maxFactor;
            return this;
        }

        public PalindromeListBuilder withFactorsGreaterThanOrEqualTo(int minFactor) {
            this.minFactor = minFactor;
            return this;
        }

        public SortedMap<Long, List<List<Integer>>> build() {
            SortedMap<Long, List<List<Integer>>> map = new TreeMap<>();
            for (int x=minFactor; x<=maxFactor; x++) {
                for (int y=x; y<=maxFactor; y++) {
                    long product = x * y;
                    if (isPalindromic(product)) {
                        List<List<Integer>> values = map.get(product);
                        if (values == null) {
                            values = new ArrayList<>();
                        }

                        List<Integer> numbers = new ArrayList<>();
                        numbers.add(x);
                        numbers.add(y);

                        values.add(numbers);

                        map.put(product, values);
                    }
                }
            }
            return map;
        }

        private boolean isPalindromic(long product) {
            String ltr = String.valueOf(product);
            for (int i=0; i<ltr.length() / 2; i++) {
                char c = ltr.charAt(i);
                char b = ltr.charAt(ltr.length() - 1 - i);
                if (c != b) {
                    return false;
                }
            }
            return true;
        }
    }

    public static PalindromeListBuilder getPalindromeSortedListBuilder() {
        return new PalindromeListBuilder();
    }

}
