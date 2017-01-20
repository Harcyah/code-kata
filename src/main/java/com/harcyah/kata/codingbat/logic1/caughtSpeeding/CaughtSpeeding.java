package com.harcyah.kata.codingbat.logic1.caughtSpeeding;

public class CaughtSpeeding {

    public int caughtSpeeding(int speed, boolean isBirthday) {
        int s = speed - (isBirthday ? 5 : 0);
        if (s > 80)
            return 2;
        if (s > 60)
            return 1;
        return 0;
    }

}
