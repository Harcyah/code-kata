package com.harcyah.kata.codingbat.array1.commonEnd;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CommonEndTest {

    @Test
    public void testCommonEnd() {
        CommonEnd commonEnd = new CommonEnd();
        Assertions.assertThat(commonEnd.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3})).isEqualTo(true);
        Assertions.assertThat(commonEnd.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2})).isEqualTo(false);
        Assertions.assertThat(commonEnd.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3})).isEqualTo(true);
        Assertions.assertThat(commonEnd.commonEnd(new int[]{1, 2, 3}, new int[]{1})).isEqualTo(true);
        Assertions.assertThat(commonEnd.commonEnd(new int[]{1, 2, 3}, new int[]{2})).isEqualTo(false);
    }

}
