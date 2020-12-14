package com.harcyah.kata.codingbat.logic1.squirrelPlay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SquirrelPlayTest {

    @Test
    public void testSquirrelPlay() {
        SquirrelPlay squirrelPlay = new SquirrelPlay();
        assertTrue(squirrelPlay.squirrelPlay(70, false));
        assertFalse(squirrelPlay.squirrelPlay(95, false));
        assertTrue(squirrelPlay.squirrelPlay(95, true));
        assertTrue(squirrelPlay.squirrelPlay(90, false));
        assertTrue(squirrelPlay.squirrelPlay(90, true));
        assertFalse(squirrelPlay.squirrelPlay(50, false));
        assertFalse(squirrelPlay.squirrelPlay(50, true));
        assertFalse(squirrelPlay.squirrelPlay(100, false));
        assertTrue(squirrelPlay.squirrelPlay(100, true));
        assertFalse(squirrelPlay.squirrelPlay(105, true));
        assertFalse(squirrelPlay.squirrelPlay(59, false));
        assertFalse(squirrelPlay.squirrelPlay(59, true));
        assertTrue(squirrelPlay.squirrelPlay(60, false));
    }

}
