package com.harcyah.kata.codingbat.warmup1.parrotTrouble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParrotTroubleTest {

    @Test
    public void testParrotTrouble() {
        ParrotTrouble parrotTrouble = new ParrotTrouble();
        assertTrue(parrotTrouble.parrotTrouble(true, 6));
        assertFalse(parrotTrouble.parrotTrouble(true, 7));
        assertFalse(parrotTrouble.parrotTrouble(false, 6));
        assertTrue(parrotTrouble.parrotTrouble(true, 21));
        assertFalse(parrotTrouble.parrotTrouble(false, 21));
        assertFalse(parrotTrouble.parrotTrouble(false, 20));
        assertTrue(parrotTrouble.parrotTrouble(true, 23));
        assertFalse(parrotTrouble.parrotTrouble(false, 23));
        assertFalse(parrotTrouble.parrotTrouble(true, 20));
        assertFalse(parrotTrouble.parrotTrouble(false, 12));
    }

}
