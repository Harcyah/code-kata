package com.harcyah.kata.codingbat.warmup1.monkeytrouble;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MonkeyTroubleTest {

    @Test
    public void testMonkeyTrouble() {
        MonkeyTrouble monkeyTrouble = new MonkeyTrouble();
        assertTrue(monkeyTrouble.monkeyTrouble(true, true));
        assertTrue(monkeyTrouble.monkeyTrouble(false, false));
        assertFalse(monkeyTrouble.monkeyTrouble(true, false));
        assertFalse(monkeyTrouble.monkeyTrouble(false, true));
    }

}
