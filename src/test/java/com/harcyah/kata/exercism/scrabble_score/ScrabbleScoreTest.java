package com.harcyah.kata.exercism.scrabble_score;

import lombok.AllArgsConstructor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@AllArgsConstructor
@RunWith(Parameterized.class)
public class ScrabbleScoreTest {

    private final String input;
    private final int expectedOutput;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
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

    @Test
    public void test() {
        Scrabble scrabble = new Scrabble(input);

        assertEquals(expectedOutput, scrabble.getScore());
    }

}
