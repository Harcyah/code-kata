package com.harcyah.kata.codingbat.recursion2.split53;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Split53Test {

    @Test
    public void testSplit53() {
        Split53 split53 = new Split53();
        Assertions.assertThat(split53.split53(new int[]{1, 1})).isEqualTo(true);
        Assertions.assertThat(split53.split53(new int[]{1, 1, 1})).isEqualTo(false);
        Assertions.assertThat(split53.split53(new int[]{2, 4, 2})).isEqualTo(true);
        Assertions.assertThat(split53.split53(new int[]{2, 2, 2, 1})).isEqualTo(false);
        Assertions.assertThat(split53.split53(new int[]{3, 3, 5, 1})).isEqualTo(true);
        Assertions.assertThat(split53.split53(new int[]{3, 5, 8})).isEqualTo(false);
        Assertions.assertThat(split53.split53(new int[]{2, 4, 6})).isEqualTo(true);
        Assertions.assertThat(split53.split53(new int[]{3, 5, 6, 10, 3, 3})).isEqualTo(true);
    }

}
