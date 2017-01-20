package com.harcyah.kata.misc.spreadsheet;

import junit.framework.TestCase;

public class SpreadsheetTest_Part4 extends TestCase {

    private Sheet sheet;

    @Override
    protected void setUp() {
        sheet = new Sheet();
    }

    public void testSupportsParenthesesInFormula() {
        sheet.put("A1", "=(7)");
        assertEquals("7", sheet.get("A1"));
    }

    public void testThatParensOverruleOperatorsPrecedence() {
        sheet.put("A1", "=(7+2)*(2+1)");
        assertEquals("27", sheet.get("A1"));
    }

    public void testShouldSupportNestedParenthesesToo() {
        sheet.put("A1", "=((((10))))");
        assertEquals("10", sheet.get("A1"));
        sheet.put("A1", "=((((10)+(10))))");
        assertEquals("20", sheet.get("A1"));
    }

    public void testSupportsSubstractions() {
        sheet.put("A1", "=7-2-1");
        assertEquals("4", sheet.get("A1"));
    }

	/*
     * public void testSupportsExponentiation() { sheet.put("A1", "=3^2^2");
	 * assertEquals("81", sheet.get("A1")); }
	 * 
	 * public void testHandlesComplexExpressions() { Sheet sheet = new Sheet();
	 * sheet.put("A1", "=((7*(2+3)*((((2+1))))-15)/10)^2"); assertEquals("81",
	 * sheet.get("A1")); }
	 * 
	 * public void testCanDetectMalformedFormulas() { sheet.put("A1", "=7*");
	 * assertEquals("#Error", sheet.get("A1")); }
	 * 
	 * public void testCanDetectParenthesisErrorInFormula() { sheet.put("A1",
	 * "=(((((7))"); assertEquals("#Error", sheet.get("A1")); }
	 * 
	 * public void testCanDetectArithmeticErrorsInFormula() { sheet.put("A1",
	 * "=7/0"); assertEquals("#Error", sheet.get("A1")); }
	 */
}
