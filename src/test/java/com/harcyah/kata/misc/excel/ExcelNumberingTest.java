package com.harcyah.kata.misc.excel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcelNumberingTest {

    @Test
    public void testGetLabelWhile() {
        ExcelNumberingWhileImpl en = new ExcelNumberingWhileImpl();
        assertEquals("A", en.getLabel(1));
        assertEquals("Z", en.getLabel(26));
        assertEquals("AA", en.getLabel(27));
        assertEquals("AC", en.getLabel(29));
        assertEquals("BA", en.getLabel(53));
        assertEquals("BB", en.getLabel(54));
    }

    @Test
    public void testGetLabelRecursive() {
        ExcelNumberingRecursiveImpl en = new ExcelNumberingRecursiveImpl();
        assertEquals("A", en.getLabel(1));
        assertEquals("Z", en.getLabel(26));
        assertEquals("AA", en.getLabel(27));
        assertEquals("AC", en.getLabel(29));
        assertEquals("BA", en.getLabel(53));
        assertEquals("BB", en.getLabel(54));
    }

}
