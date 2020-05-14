package com.harcyah.kata.codingbat.logic2.makeBricks;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MakeBricksTest {

    @Test
    public void testMakeBricks() {
        MakeBricks makeBricks = new MakeBricks();
        assertTrue(makeBricks.makeBricks(3, 1, 8));
        assertFalse(makeBricks.makeBricks(3, 1, 9));
        assertTrue(makeBricks.makeBricks(3, 2, 10));
        assertTrue(makeBricks.makeBricks(3, 2, 8));
        assertFalse(makeBricks.makeBricks(3, 2, 9));
        assertTrue(makeBricks.makeBricks(6, 1, 11));
        assertFalse(makeBricks.makeBricks(6, 0, 11));
        assertTrue(makeBricks.makeBricks(1, 4, 11));
        assertTrue(makeBricks.makeBricks(0, 3, 10));
        assertFalse(makeBricks.makeBricks(1, 4, 12));
        assertTrue(makeBricks.makeBricks(3, 1, 7));
        assertFalse(makeBricks.makeBricks(1, 1, 7));
        assertTrue(makeBricks.makeBricks(2, 1, 7));
        assertTrue(makeBricks.makeBricks(7, 1, 11));
        assertTrue(makeBricks.makeBricks(7, 1, 8));
        assertFalse(makeBricks.makeBricks(7, 1, 13));
        assertTrue(makeBricks.makeBricks(43, 1, 46));
        assertFalse(makeBricks.makeBricks(40, 1, 46));
        assertTrue(makeBricks.makeBricks(40, 2, 47));
        assertTrue(makeBricks.makeBricks(40, 2, 50));
        assertFalse(makeBricks.makeBricks(40, 2, 52));
        assertFalse(makeBricks.makeBricks(22, 2, 33));
        assertTrue(makeBricks.makeBricks(0, 2, 10));
        assertTrue(makeBricks.makeBricks(1000000, 1000, 1000100));
        assertFalse(makeBricks.makeBricks(2, 1000000, 100003));
        assertTrue(makeBricks.makeBricks(20, 0, 19));
        assertFalse(makeBricks.makeBricks(20, 0, 21));
        assertFalse(makeBricks.makeBricks(20, 4, 51));
        assertTrue(makeBricks.makeBricks(20, 4, 39));
    }

}
