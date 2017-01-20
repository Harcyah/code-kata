package com.harcyah.kata.codingbat.array1.start1;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Start1Test {

    @Test
    public void testStart1() {
        Start1 start1 = new Start1();
        Assertions.assertThat(start1.start1(new int[]{1, 2, 3}, new int[]{1, 3})).isEqualTo(2);
        Assertions.assertThat(start1.start1(new int[]{7, 2, 3}, new int[]{1})).isEqualTo(1);
        Assertions.assertThat(start1.start1(new int[]{1, 2}, new int[]{})).isEqualTo(1);
        Assertions.assertThat(start1.start1(new int[]{}, new int[]{1, 2})).isEqualTo(1);
        Assertions.assertThat(start1.start1(new int[]{7}, new int[]{})).isEqualTo(0);
        Assertions.assertThat(start1.start1(new int[]{7}, new int[]{1})).isEqualTo(1);
        Assertions.assertThat(start1.start1(new int[]{1}, new int[]{1})).isEqualTo(2);
        Assertions.assertThat(start1.start1(new int[]{7}, new int[]{8})).isEqualTo(0);
        Assertions.assertThat(start1.start1(new int[]{}, new int[]{})).isEqualTo(0);
        Assertions.assertThat(start1.start1(new int[]{1, 3}, new int[]{1})).isEqualTo(2);
    }

}
