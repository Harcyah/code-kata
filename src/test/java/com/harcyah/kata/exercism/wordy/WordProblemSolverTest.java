package com.harcyah.kata.exercism.wordy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordProblemSolverTest {

    @Test
    public void testSingleAddition1() {
        assertEquals(2, new WordProblemSolver().solve("What is 1 plus 1?"));
    }

    @Test
    public void testSingleAddition2() {
        assertEquals(55, new WordProblemSolver().solve("What is 53 plus 2?"));
    }

    @Test
    public void testSingleAdditionWithNegativeNumbers() {
        assertEquals(-11, new WordProblemSolver().solve("What is -1 plus -10?"));
    }

    @Test
    public void testSingleAdditionOfLargeNumbers() {
        assertEquals(45801, new WordProblemSolver().solve("What is 123 plus 45678?"));
    }

    @Test
    public void testSingleSubtraction() {
        assertEquals(16, new WordProblemSolver().solve("What is 4 minus -12?"));
    }

    @Test
    public void testSingleMultiplication() {
        assertEquals(-75, new WordProblemSolver().solve("What is -3 multiplied by 25?"));
    }

    @Test
    public void testSingleDivision() {
        assertEquals(-11, new WordProblemSolver().solve("What is 33 divided by -3?"));
    }

    @Test
    public void testMultipleAdditions() {
        assertEquals(3, new WordProblemSolver().solve("What is 1 plus 1 plus 1?"));
    }

    @Test
    public void testAdditionThenSubtraction() {
        assertEquals(8, new WordProblemSolver().solve("What is 1 plus 5 minus -2?"));
    }

    @Test
    public void testMultipleSubtractions() {
        assertEquals(3, new WordProblemSolver().solve("What is 20 minus 4 minus 13?"));
    }

    @Test
    public void testSubtractionThenAddition() {
        assertEquals(14, new WordProblemSolver().solve("What is 17 minus 6 plus 3?"));
    }

    @Test
    public void testMultipleMultiplications() {
        assertEquals(-12, new WordProblemSolver().solve("What is 2 multiplied by -2 multiplied by 3?"));
    }

    @Test
    public void testAdditionThenMultiplication() {
        assertEquals(-8, new WordProblemSolver().solve("What is -3 plus 7 multiplied by -2?"));
    }

    @Test
    public void testMultipleDivisions() {
        assertEquals(2, new WordProblemSolver().solve("What is -12 divided by 2 divided by -3?"));
    }

    @Test
    public void testUnknownOperation() {
        assertThatThrownBy(() -> new WordProblemSolver().solve("What is 52 cubed?"))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("I'm sorry, I don't understand the question!");
    }

    @Test
    public void testInvalidQuestionFormat() {
        // See https://en.wikipedia.org/wiki/President_of_the_United_States if you really need to know!
        assertThatThrownBy(() -> new WordProblemSolver().solve("Who is the President of the United States?"))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("I'm sorry, I don't understand the question!");
    }

}
