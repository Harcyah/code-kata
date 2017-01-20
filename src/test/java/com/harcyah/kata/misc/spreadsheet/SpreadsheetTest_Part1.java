package com.harcyah.kata.misc.spreadsheet;

import junit.framework.TestCase;

public class SpreadsheetTest_Part1 extends TestCase {

    public void testThatCellsAreEmptyByDefault() {
        Sheet sheet = new Sheet();
        assertEquals("", sheet.get("A1"));
        assertEquals("", sheet.get("ZX347"));
    }

    public void testThatCellsAreStored() {
        Sheet sheet = new Sheet();
        String theCell = "A21";

        sheet.put(theCell, "A string");
        assertEquals("A string", sheet.get(theCell));

        sheet.put(theCell, "A different string");
        assertEquals("A different string", sheet.get(theCell));

        sheet.put(theCell, "");
        assertEquals("", sheet.get(theCell));
    }

    public void testThatManyCellsExist() {
        Sheet sheet = new Sheet();
        sheet.put("A1", "First");
        sheet.put("X27", "Second");
        sheet.put("ZX901", "Third");

        assertEquals("A1", "First", sheet.get("A1"));
        assertEquals("X27", "Second", sheet.get("X27"));
        assertEquals("ZX901", "Third", sheet.get("ZX901"));

        sheet.put("A1", "Fourth");
        assertEquals("A1 after", "Fourth", sheet.get("A1"));
        assertEquals("X27 same", "Second", sheet.get("X27"));
        assertEquals("ZX901 same", "Third", sheet.get("ZX901"));
    }

    public void testThatCellLiteralValuesArePreservedForEditing() {
        Sheet sheet = new Sheet();
        String theCell = "A21";

        sheet.put(theCell, "Some string");
        assertEquals("Some string", sheet.getLiteral(theCell));

        sheet.put(theCell, " 1234 ");
        assertEquals(" 1234 ", sheet.getLiteral(theCell));

        sheet.put(theCell, "=7"); // Foreshadowing formulas:)
        assertEquals("=7", sheet.getLiteral(theCell));
    }

    public void testThatNumericCellsAreRecognized() {
        Sheet sheet = new Sheet();
        String theCell = "A21";

        sheet.put(theCell, "X99"); // "Obvious" string
        assertEquals("X99", sheet.get(theCell));

        sheet.put(theCell, "14"); // "Obvious" number
        assertEquals("14", sheet.get(theCell));

        sheet.put(theCell, " 99 X"); // Whole string must be numeric
        assertEquals(" 99 X", sheet.get(theCell));

        sheet.put(theCell, " 1234 "); // Blanks ignored
        assertEquals("1234", sheet.get(theCell));

        sheet.put(theCell, " "); // Just a blank
        assertEquals(" ", sheet.get(theCell));
    }

}
