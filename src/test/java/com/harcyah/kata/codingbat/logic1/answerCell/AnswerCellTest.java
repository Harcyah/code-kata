package com.harcyah.kata.codingbat.logic1.answerCell;

import org.junit.Assert;
import org.junit.Test;

public class AnswerCellTest {

	@Test
	public void testAnswerCell() {
		AnswerCell answerCell = new AnswerCell();
		Assert.assertEquals(true, answerCell.answerCell(false, false, false));
		Assert.assertEquals(false, answerCell.answerCell(false, false, true));
		Assert.assertEquals(false, answerCell.answerCell(true, false, false));
		Assert.assertEquals(true, answerCell.answerCell(true, true, false));
		Assert.assertEquals(true, answerCell.answerCell(false, true, false));
		Assert.assertEquals(false, answerCell.answerCell(true, true, true));
	}

}
