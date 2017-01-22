package com.harcyah.kata.misc.version;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class VersionComparatorTest {

    private VersionComparator c = new VersionComparator();

    @Test
    public void testNullOrder() {
        assertTrue(c.compare(null, "2") < 0);
        assertTrue(c.compare("2", null) > 0);
        assertTrue(c.compare(null, null) == 0);
    }

    @Test
    public void testBasicNumericOrder() {
        assertTrue(c.compare("1", "2") < 0);
        assertTrue(c.compare("2", "1") > 0);
        assertTrue(c.compare("1", "1") == 0);
        assertTrue(c.compare("1", "12") < 0);
        assertTrue(c.compare("2", "12") < 0);
    }

    @Test
    public void testSubversionNumericOrder() {
        assertTrue(c.compare("1.1", "1.2") < 0);
        assertTrue(c.compare("1.2", "1.1") > 0);
        assertTrue(c.compare("1.1", "1.1") == 0);

        assertTrue(c.compare("1.1", "2.1") < 0);
        assertTrue(c.compare("1.2", "2.1") < 0);
        assertTrue(c.compare("1.12", "1.1") > 0);
    }

    @Test
    public void testSubversionLengthOrder() {
        assertTrue(c.compare("1.1", "1.1.1") < 0);
        assertTrue(c.compare("1.2", "1.1.1") > 0);
    }

    @Test
    public void testNumericLessThanNonNumeric() {
        assertTrue(c.compare("1.1", "1.a") < 0);
        assertTrue(c.compare("1.2", "1.1a") < 0);
        assertTrue(c.compare("1.2", "1.-") < 0);
        assertTrue(c.compare("1.2", "1. ") < 0);
    }

    @Test
    public void testNonNumericOrder() {
        assertTrue(c.compare("a", "b") < 0);
        assertTrue(c.compare("B", "a") < 0);
        assertTrue(c.compare("a", "ab") < 0);
        assertTrue(c.compare("1.1a", "1.1b") < 0);
    }

    @Test
    public void testMixedNumericNonNumeric() {
        assertTrue(c.compare("2.1b", "3.1a") < 0);
        assertTrue(c.compare("3.1.3", "3.1a.2beta") < 0);
        assertTrue(c.compare("1.1a.2", "1.1b.1") < 0);
    }

}
