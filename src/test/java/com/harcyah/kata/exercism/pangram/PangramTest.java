package com.harcyah.kata.exercism.pangram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PangramTest {

    @Test
    public void emptySentence() {
        assertFalse(Pangrams.isPangram(""));
    }

    @Test
    public void testLowercasePangram() {
        assertTrue(Pangrams.isPangram("the quick brown fox jumps over the lazy dog"));
    }

    @Test
    public void missingCharacterX() {
        assertFalse(Pangrams.isPangram("a quick movement of the enemy will jeopardize five gunboats"));
    }

    @Test
    public void mixedCaseAndPunctuation() {
        assertTrue(Pangrams.isPangram("\"Five quacking Zephyrs jolt my wax bed.\""));
    }

    @Test
    public void nonAsciiCharacters() {
        assertTrue(Pangrams.isPangram("Victor jagt zwölf Boxkämpfer quer über den großen Sylter Deich."));
    }

}
