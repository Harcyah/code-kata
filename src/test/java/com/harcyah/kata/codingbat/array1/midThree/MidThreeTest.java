package com.harcyah.kata.codingbat.array1.midThree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MidThreeTest {

    @Test
    public void testMidThree() {
        MidThree midThree = new MidThree();
        assertThat(midThree.midThree(new int[]{1, 2, 3, 4, 5})).isEqualTo(new int[]{2, 3, 4});
        assertThat(midThree.midThree(new int[]{8, 6, 7, 5, 3, 0, 9})).isEqualTo(new int[]{7, 5, 3});
        assertThat(midThree.midThree(new int[]{1, 2, 3})).isEqualTo(new int[]{1, 2, 3});
    }

}
