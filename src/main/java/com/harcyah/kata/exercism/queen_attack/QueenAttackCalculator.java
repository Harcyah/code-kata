package com.harcyah.kata.exercism.queen_attack;

import com.harcyah.kata.exercism.queen_attack.BoardCoordinate;

public final class QueenAttackCalculator {

    private final BoardCoordinate q1;
    private final BoardCoordinate q2;

    public QueenAttackCalculator(BoardCoordinate q1, BoardCoordinate q2) {
        if (q1 == null || q2 == null) {
            throw new IllegalArgumentException("You must supply valid board coordinates for both Queens.");
        }
        if (q1.equals(q2)) {
            throw new IllegalArgumentException("Queens may not occupy the same board coordinate.");
        }
        this.q1 = q1;
        this.q2 = q2;
    }

    public boolean canQueensAttackOneAnother() {
        if (q1.isOnSameRank(q2)) {
            return true;
        }
        if (q1.isOnSameFile(q2)) {
            return true;
        }
        if (q1.isOnSameDiagonal(q2)) {
            return true;
        }
        return false;
    }

}
