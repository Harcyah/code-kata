package com.harcyah.kata.misc.spreadsheet;

import junit.framework.TestCase;

public class SpreadsheetTest_Part2 extends TestCase {

    private Sheet sheet;

    @Override
    protected void setUp() {
        sheet = new Sheet();
    }

    public void testSupportsConstantFormula() {
        sheet.put("A1", "=7");
        assertEquals("=7", sheet.getLiteral("A1"));
        assertEquals("7", sheet.get("A1"));
    }

    public void testFormulasSupportMultiplications() {
        sheet.put("A1", "=2*3*4");
        assertEquals("24", sheet.get("A1"));
    }

    public void testSupportFormulasMixingOperations() {
        sheet.put("A1", "=24/8*2");
        assertEquals("6", sheet.get("A1"));
    }

    public void testSupportAdditionsInFormulas() {
        sheet.put("A1", "=3+4+2");
        assertEquals("9", sheet.get("A1"));
    }

    public void testFormulasSupportDivisions() {
        sheet.put("A1", "=24/3/2");
        assertEquals("4", sheet.get("A1"));
    }

    public void testFormulasSupportDecimalValues() {
        sheet.put("A1", "=10/2.5");
        assertEquals("4", sheet.get("A1"));
    }

    /*
     * public void testThatDecimalValuesAreRecognizedAsNumerics() {
     * sheet.put("A1", "  2.5  "); assertEquals("2.5", sheet.get("A1"));
     *
     * sheet.put("A1", "  .5  "); assertEquals(".5", sheet.get("A1"));
     *
     * String invalidDecimal = "  2..5  "; sheet.put("A1", invalidDecimal);
     * assertEquals("  2..5  ", sheet.get("A1")); }
     */
    public void testFormulasRespectOperatorsPrecedence() {
        Sheet sheet = new Sheet();
        sheet.put("A1", "=7+2*3");
        assertEquals("13", sheet.get("A1"));
    }

}
