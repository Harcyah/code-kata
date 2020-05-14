package com.harcyah.kata.codingbat.array3.squareUp;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SquareUpTest {

    @Test
    public void testSquareUp() {
        SquareUp squareUp = new SquareUp();

        assertThat(squareUp.squareUp(1)).isEqualTo(new int[]{1});

        assertThat(squareUp.squareUp(0)).isEqualTo(new int[]{});

        assertThat(squareUp.squareUp(3)).isEqualTo(new int[]{
            0, 0, 1,
            0, 2, 1,
            3, 2, 1
        });

        assertThat(squareUp.squareUp(2)).isEqualTo(new int[]{
            0, 1,
            2, 1
        });

        assertThat(squareUp.squareUp(4)).isEqualTo(new int[]{
            0, 0, 0, 1,
            0, 0, 2, 1,
            0, 3, 2, 1,
            4, 3, 2, 1
        });

        assertThat(squareUp.squareUp(6)).isEqualTo(new int[]{
            0, 0, 0, 0, 0, 1,
            0, 0, 0, 0, 2, 1,
            0, 0, 0, 3, 2, 1,
            0, 0, 4, 3, 2, 1,
            0, 5, 4, 3, 2, 1,
            6, 5, 4, 3, 2, 1
        });
    }

}
