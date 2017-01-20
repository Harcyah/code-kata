package com.harcyah.kata.codingbat.ap1.scoresIncreasing;

public class ScoresIncreasing {

    public boolean scoresIncreasing(int[] scores) {
        int score = Integer.MIN_VALUE;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < score) {
                return false;
            }
            score = scores[i];
        }
        return true;
    }

}
