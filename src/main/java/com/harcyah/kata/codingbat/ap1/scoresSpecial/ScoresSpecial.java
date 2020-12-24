package com.harcyah.kata.codingbat.ap1.scoresSpecial;

public class ScoresSpecial {

    public int scoresSpecial(int[] scoresLeft, int[] scoresRight) {
        return largestMultipleOf(scoresLeft) + largestMultipleOf(scoresRight);
    }

    private int largestMultipleOf(int[] scoresLeft) {
        int max = 0;
        for (int j : scoresLeft) {
            if (((j % 10) == 0) && (max < j)) {
                max = j;
            }
        }
        return max;
    }

}
