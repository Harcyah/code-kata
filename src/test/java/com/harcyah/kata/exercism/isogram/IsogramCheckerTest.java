package com.harcyah.kata.exercism.isogram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsogramCheckerTest {

    @Test
    public void testIsogram() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("duplicates"));
    }

    @Test
    public void testNotIsogram() {
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("eleven"));
    }

    @Test
    public void testMediumLongIsogram() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("subdermatoglyphic"));
    }

    @Test
    public void testCaseInsensitive() {
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("Alphabet"));
    }

    @Test
    public void testIsogramWithHyphen() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("thumbscrew-japingly"));
    }

    @Test
    public void testIgnoresMultipleHyphens() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("Hjelmqvist-Gryb-Zock-Pfund-Wax"));
    }

    @Test
    public void testWorksWithGermanLetters() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("Heizölrückstoßabdämpfung"));
    }

    @Test
    public void testIgnoresSpaces() {
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("the quick brown fox"));
    }

    @Test
    public void testIgnoresSpaces2() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("Emily Jung Schwartzkopf"));
    }

    @Test
    public void testDuplicateAccentedLetters() {
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("éléphant"));
    }

}
