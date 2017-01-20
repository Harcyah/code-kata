package com.harcyah.kata.codingbat.ap1.scoresClump;

public class ScoresClump {

    public boolean scoresClump(int[] scores) {
        if (scores.length < 3)
            return false;

        for (int i = 0; i < scores.length - 2; i++) {
            boolean first = (scores[i + 1] - scores[i]) <= 2;
            boolean second = (scores[i + 2] - scores[i]) <= 2;
            if (first && second)
                return true;
        }

        return false;
    }

}
