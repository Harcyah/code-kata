package com.harcyah.kata.codingbat.array1.makeMiddle;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MakeMiddleTest {

    @Test
    public void testMakeMiddle() {
        MakeMiddle makeMiddle = new MakeMiddle();
        assertThat(makeMiddle.makeMiddle(new int[]{1, 2, 3, 4})).isEqualTo(new int[]{2, 3});
        assertThat(makeMiddle.makeMiddle(new int[]{7, 1, 2, 3, 4, 9})).isEqualTo(new int[]{2, 3});
        assertThat(makeMiddle.makeMiddle(new int[]{1, 2})).isEqualTo(new int[]{1, 2});
        assertThat(makeMiddle.makeMiddle(new int[]{5, 2, 4, 7})).isEqualTo(new int[]{2, 4});
        assertThat(makeMiddle.makeMiddle(new int[]{9, 0, 4, 3, 9, 1})).isEqualTo(new int[]{4, 3});
    }

}
