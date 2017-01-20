package com.harcyah.kata.misc.excel;

import org.junit.Assert;
import org.junit.Test;

public class ExcelNumberingTest {

    @Test
    public void testGetLabelWhile() throws Exception {
        ExcelNumberingWhileImpl en = new ExcelNumberingWhileImpl();
        Assert.assertEquals("A", en.getLabel(1));
        Assert.assertEquals("Z", en.getLabel(26));
        Assert.assertEquals("AA", en.getLabel(27));
        Assert.assertEquals("AC", en.getLabel(29));
        Assert.assertEquals("BA", en.getLabel(53));
        Assert.assertEquals("BB", en.getLabel(54));
    }

    @Test
    public void testGetLabelRecursive() throws Exception {
        ExcelNumberingRecursiveImpl en = new ExcelNumberingRecursiveImpl();
        Assert.assertEquals("A", en.getLabel(1));
        Assert.assertEquals("Z", en.getLabel(26));
        Assert.assertEquals("AA", en.getLabel(27));
        Assert.assertEquals("AC", en.getLabel(29));
        Assert.assertEquals("BA", en.getLabel(53));
        Assert.assertEquals("BB", en.getLabel(54));
    }

}
