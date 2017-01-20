package com.harcyah.kata.codingbat.array1.midThree;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MidThreeTest {

    @Test
    public void testMidThree() {
        MidThree midThree = new MidThree();
        Assertions.assertThat(midThree.midThree(new int[]{1, 2, 3, 4, 5})).isEqualTo(new int[]{2, 3, 4});
        Assertions.assertThat(midThree.midThree(new int[]{8, 6, 7, 5, 3, 0, 9})).isEqualTo(new int[]{7, 5, 3});
        Assertions.assertThat(midThree.midThree(new int[]{1, 2, 3})).isEqualTo(new int[]{1, 2, 3});
    }

}
