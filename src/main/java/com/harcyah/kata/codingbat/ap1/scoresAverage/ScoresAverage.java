package com.harcyah.kata.codingbat.ap1.scoresAverage;

public class ScoresAverage {

    public int scoresAverage(int[] scores) {
        if (scores.length == 2)
            return Math.max(scores[0], scores[1]);

        int mid = scores.length / 2;
        return Math.max(
                average(scores, 0, mid),
                average(scores, mid + 1, scores.length));
    }

    int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += scores[i];
        }
        return sum / (end - start);
    }

}
