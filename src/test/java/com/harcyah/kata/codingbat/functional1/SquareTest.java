package com.harcyah.kata.codingbat.functional1;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SquareTest {

    @Test
    public void testSquare() {
        Square square = new Square();
        assertThat(square.square(List.of(1, 2, 3)))
            .containsExactly(1, 4, 9);
        assertThat(square.square(List.of(6, 8, -6, -8, 1)))
            .containsExactly(36, 64, 36, 64, 1);
        assertThat(square.square(List.of()))
            .containsExactly();
        assertThat(square.square(List.of(12)))
            .containsExactly(144);
        assertThat(square.square(List.of(5, 10)))
            .containsExactly(25, 100);
        assertThat(square.square(List.of(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2)))
            .containsExactly(36, 9, 144, 529, 16, 1, 361, 121, 4, 9, 4);
    }

}
