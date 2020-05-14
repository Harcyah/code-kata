package com.harcyah.kata.codingbat.string2.xyBalance;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class XyBalanceTest {

    @Test
    public void testXyBalance() {
        XyBalance xyBalance = new XyBalance();
        assertTrue(xyBalance.xyBalance("aaxbby"));
        assertFalse(xyBalance.xyBalance("aaxbb"));
        assertFalse(xyBalance.xyBalance("yaaxbb"));
        assertTrue(xyBalance.xyBalance("yaaxbby"));
        assertTrue(xyBalance.xyBalance("xaxxbby"));
        assertFalse(xyBalance.xyBalance("xaxxbbyx"));
        assertTrue(xyBalance.xyBalance("xxbxy"));
        assertFalse(xyBalance.xyBalance("xxbx"));
        assertTrue(xyBalance.xyBalance("bbb"));
        assertFalse(xyBalance.xyBalance("bxbb"));
        assertTrue(xyBalance.xyBalance("bxyb"));
        assertTrue(xyBalance.xyBalance("xy"));
        assertTrue(xyBalance.xyBalance("y"));
        assertFalse(xyBalance.xyBalance("x"));
        assertTrue(xyBalance.xyBalance(""));
        assertFalse(xyBalance.xyBalance("yxyxyxyx"));
        assertTrue(xyBalance.xyBalance("yxyxyxyxy"));
        assertTrue(xyBalance.xyBalance("12xabxxydxyxyzz"));
    }

}
