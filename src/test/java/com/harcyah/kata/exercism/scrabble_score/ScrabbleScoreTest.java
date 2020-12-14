package com.harcyah.kata.exercism.scrabble_score;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScrabbleScoreTest {

    public static Collection<Object[]> getTestData() {
        return List.of(new Object[][]{
            {"", 0},
            {" \t\n", 0},
            {null, 0},
            {"a", 1},
            {"f", 4},
            {"street", 6},
            {"quirky", 22},
            {"oxyphenbutazone", 41},
            {"alacrity", 13},
        });
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void test(String input, int score) {
        Scrabble scrabble = new Scrabble(input);

        assertEquals(score, scrabble.getScore());
    }

}
