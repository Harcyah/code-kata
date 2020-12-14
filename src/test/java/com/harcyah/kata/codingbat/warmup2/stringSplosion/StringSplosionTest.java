package com.harcyah.kata.codingbat.warmup2.stringSplosion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringSplosionTest {

    @Test
    public void testStringSplosion() {
        StringSplosion stringSplosion = new StringSplosion();
        assertEquals("CCoCodCode", stringSplosion.stringSplosion("Code"));
        assertEquals("aababc", stringSplosion.stringSplosion("abc"));
        assertEquals("aab", stringSplosion.stringSplosion("ab"));
        assertEquals("x", stringSplosion.stringSplosion("x"));
        assertEquals("ffafadfade", stringSplosion.stringSplosion("fade"));
        assertEquals("TThTheTherThere", stringSplosion.stringSplosion("There"));
        assertEquals("KKiKitKittKitteKitten", stringSplosion.stringSplosion("Kitten"));
        assertEquals("BByBye", stringSplosion.stringSplosion("Bye"));
        assertEquals("GGoGooGood", stringSplosion.stringSplosion("Good"));
        assertEquals("BBaBad", stringSplosion.stringSplosion("Bad"));
    }

}
