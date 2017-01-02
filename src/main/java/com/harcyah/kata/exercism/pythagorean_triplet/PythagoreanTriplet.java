package com.harcyah.kata.exercism.pythagorean_triplet;

import java.util.ArrayList;
import java.util.List;

public class PythagoreanTriplet  {

    private final int a;
    private final int b;
    private final int c;

    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public long calculateProduct() {
        return a * b * c;
    }

    public int calculateSum() {
        return a + b + c;
    }

    public boolean isPythagorean() {
        return a * a + b * b == c * c;
    }

    public static class TripletsListBuilder {

        private int min = 1;
        private int max = 100;
        private Integer sum = null;

        public TripletsListBuilder withFactorsLessThanOrEqualTo(int max) {
            this.max = max;
            return this;
        }

        public TripletsListBuilder withFactorsGreaterThanOrEqualTo(int min) {
            this.min = min;
            return this;
        }

        public TripletsListBuilder thatSumTo(int sum) {
            this.sum = sum;
            return this;
        };

        public List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> triplets = new ArrayList<>();
            for (int a = min; a <= max; a++) {
                for (int b = a; b <= max; b++) {
                    for (int c = b; c <= max; c++) {
                        PythagoreanTriplet triplet = new PythagoreanTriplet(a, b, c);
                        if (!triplet.isPythagorean()) {
                            continue;
                        }

                        if (sum == null || (sum != null && triplet.calculateSum() == sum)) {
                            triplets.add(triplet);
                        }
                    }
                }
            }
            return triplets;
        }

    }

    public static TripletsListBuilder makeTripletsList() {
        return new TripletsListBuilder();
    }

}
