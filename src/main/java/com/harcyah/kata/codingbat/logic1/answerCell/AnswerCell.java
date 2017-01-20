package com.harcyah.kata.codingbat.logic1.answerCell;

public class AnswerCell {

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep)
            return false;

        if (isMorning)
            return isMom;

        return true;
    }

}
