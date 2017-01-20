package com.harcyah.kata.projecteuler;

public class Problem_014 {

    private static final int MAX = 1000000;

    public int getLongestCollatzSequence(int limit) {
        int max = MAX;
        int maxSteps = 0;
        int maxStepsNumber = 0;

        while (max >= 1) {
            int steps = 0;
            long value = max;
            do {
                if ((value % 2) == 0) {
                    value = value / 2;
                } else {
                    value = (3 * value) + 1;
                }
                steps++;
            } while (value > 1);

            if (steps > maxSteps) {
                maxSteps = steps;
                maxStepsNumber = max;
            }
            max--;
        }

        return maxStepsNumber;
    }

}
