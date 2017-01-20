package com.harcyah.kata.misc.josephus;

public class JosephusLoopImpl implements Josephus {

    private static final int DEAD = -1;

    @Override
    public int getLastManStanding(int people, int step) {
        int[] men = new int[people];
        int alive = people;
        int current = -1;
        while (alive > 1) {
            current = getNextAliveManNumber(men, current, step);
            men[current] = DEAD;
            alive--;
        }

        return lastAliveMan(men);
    }

    private int getNextAliveManNumber(int[] men, int current, int step) {
        int steps = 0;
        do {
            current++;
            if (current == men.length) {
                current = 0;
            }

            if (men[current] == DEAD) {
                continue;
            }

            steps++;
        } while (steps < step);
        return current;
    }

    private int lastAliveMan(int[] men) {
        for (int i = 0; i < men.length; i++) {
            if (men[i] != DEAD) {
                return i;
            }
        }
        throw new IllegalArgumentException();
    }

}
