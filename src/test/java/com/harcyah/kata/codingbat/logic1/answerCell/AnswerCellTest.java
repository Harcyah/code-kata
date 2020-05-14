package com.harcyah.kata.codingbat.logic1.answerCell;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnswerCellTest {

    @Test
    public void testAnswerCell() {
        AnswerCell answerCell = new AnswerCell();
        assertTrue(answerCell.answerCell(false, false, false));
        assertFalse(answerCell.answerCell(false, false, true));
        assertFalse(answerCell.answerCell(true, false, false));
        assertTrue(answerCell.answerCell(true, true, false));
        assertTrue(answerCell.answerCell(false, true, false));
        assertFalse(answerCell.answerCell(true, true, true));
    }

}
