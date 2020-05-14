package com.harcyah.kata.exercism.flatten_arrays;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static java.util.Collections.singletonList;
import static org.junit.Assert.assertEquals;

public final class FlattenerTest {

    private Flattener flattener;

    @Before
    public void setUp() {
        flattener = new Flattener();
    }

    @Test
    public void testASingleLevelOfNestingWithNoNulls() {
        assertEquals(
            List.of(1, '2', 3, 4, 5, "six", "7", 8),
            flattener.flatten(List.of(1, List.of('2', 3, 4, 5, "six", "7"), 8)));
    }

    @Test
    public void testFiveLevelsOfNestingWithNoNulls() {
        assertEquals(
            List.of(0, '2', 2, "three", '8', 100, "four", 50, "-2"),
            flattener.flatten(List.of(0, '2', List.of(List.of(2, "three"), '8', 100, "four", List.of(List.of(List.of(50)))), "-2")));
    }

    @Test
    public void testSixLevelsOfNestingWithNoNulls() {
        assertEquals(
            List.of("one", '2', 3, '4', 5, "six", 7, "8"),
            flattener.flatten(List.of("one", List.of('2', List.of(List.of(3)), List.of('4', List.of(List.of(5))), "six", 7), "8")));
    }

    @Test
    public void testSixLevelsOfNestingWithNulls() {
        assertEquals(
            List.of("0", 2, "two", '3', "8", "one hundred", "negative two"),
            flattener.flatten(List.of("0", 2, List.of(List.of("two", '3'), "8", List.of(List.of("one hundred")), singletonList(singletonList(null))), "negative two")));
    }

}
