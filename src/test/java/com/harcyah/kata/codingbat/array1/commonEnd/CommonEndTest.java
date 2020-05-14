package com.harcyah.kata.codingbat.array1.commonEnd;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CommonEndTest {

    @Test
    public void testCommonEnd() {
        CommonEnd commonEnd = new CommonEnd();
        assertThat(commonEnd.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3})).isTrue();
        assertThat(commonEnd.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2})).isFalse();
        assertThat(commonEnd.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3})).isTrue();
        assertThat(commonEnd.commonEnd(new int[]{1, 2, 3}, new int[]{1})).isTrue();
        assertThat(commonEnd.commonEnd(new int[]{1, 2, 3}, new int[]{2})).isFalse();
    }

}
