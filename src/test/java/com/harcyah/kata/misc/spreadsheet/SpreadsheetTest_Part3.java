package com.harcyah.kata.misc.spreadsheet;

import junit.framework.TestCase;

public class SpreadsheetTest_Part3 extends TestCase {

	private Sheet sheet;

	@Override
	protected void setUp() {
		sheet = new Sheet();
	}

	public void testFormulasRespectOperatorsPrecedence() {
		sheet.put("A1", "=7+2*3");
		assertEquals("13", sheet.get("A1"));
	}

}
