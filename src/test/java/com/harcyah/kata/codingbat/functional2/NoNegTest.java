package com.harcyah.kata.codingbat.functional2;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class NoNegTest {

    @Test
    public void testNoNeg() {
        NoNeg noNeg = new NoNeg();
        assertThat(noNeg.noNeg(Arrays.asList(1, -2))).containsExactly(1);
        assertThat(noNeg.noNeg(Arrays.asList(3, -10, 1, -1, 4, -400))).containsExactly(3, 1, 4);
        assertThat(noNeg.noNeg(Arrays.asList(-1, 3, 1, -1, -10, -100, -111, 5))).containsExactly(3, 1, 5);
    }

}
