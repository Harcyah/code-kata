package com.harcyah.kata.codingbat.array1.makeMiddle;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MakeMiddleTest {

    @Test
    public void testMakeMiddle() {
        MakeMiddle makeMiddle = new MakeMiddle();
        Assertions.assertThat(makeMiddle.makeMiddle(new int[]{1, 2, 3, 4})).isEqualTo(new int[]{2, 3});
        Assertions.assertThat(makeMiddle.makeMiddle(new int[]{7, 1, 2, 3, 4, 9})).isEqualTo(new int[]{2, 3});
        Assertions.assertThat(makeMiddle.makeMiddle(new int[]{1, 2})).isEqualTo(new int[]{1, 2});
        Assertions.assertThat(makeMiddle.makeMiddle(new int[]{5, 2, 4, 7})).isEqualTo(new int[]{2, 4});
        Assertions.assertThat(makeMiddle.makeMiddle(new int[]{9, 0, 4, 3, 9, 1})).isEqualTo(new int[]{4, 3});
    }

}
