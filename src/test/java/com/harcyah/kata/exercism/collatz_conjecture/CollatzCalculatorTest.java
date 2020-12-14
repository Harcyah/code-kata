package com.harcyah.kata.exercism.collatz_conjecture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollatzCalculatorTest {

    private CollatzCalculator collatzCalculator;

    @BeforeEach
    public void setUp() {
        collatzCalculator = new CollatzCalculator();
    }

    @Test
    public void testZeroStepsRequiredWhenStartingFrom1() {
        assertEquals(0, collatzCalculator.computeStepCount(1));
    }

    @Test
    public void testCorrectNumberOfStepsWhenAllStepsAreDivisions() {
        assertEquals(4, collatzCalculator.computeStepCount(16));
    }

    @Test
    public void testCorrectNumberOfStepsWhenBothStepTypesAreNeeded() {
        assertEquals(9, collatzCalculator.computeStepCount(12));
    }

    @Test
    public void testAVeryLargeInput() {
        assertEquals(152, collatzCalculator.computeStepCount(1000000));
    }

    @Test
    public void testZeroIsConsideredInvalidInput() {
        assertThatThrownBy(() -> collatzCalculator.computeStepCount(0))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Only natural numbers are allowed");
    }

    @Test
    public void testNegativeIntegerIsConsideredInvalidInput() {
        assertThatThrownBy(() -> collatzCalculator.computeStepCount(-15))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Only natural numbers are allowed");
    }

}
