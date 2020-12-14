package com.harcyah.kata.codingbat.functional2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class NoNegTest {

    @Test
    public void testNoNeg() {
        NoNeg noNeg = new NoNeg();
        assertThat(noNeg.noNeg(List.of(1, -2)))
            .containsExactly(1);
        assertThat(noNeg.noNeg(List.of(3, -10, 1, -1, 4, -400)))
            .containsExactly(3, 1, 4);
        assertThat(noNeg.noNeg(List.of(-1, 3, 1, -1, -10, -100, -111, 5)))
            .containsExactly(3, 1, 5);
    }

}
