package com.harcyah.kata.codingbat.array1.unlucky1;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Unlucky1Test {

    @Test
    public void testUnlucky1() {
        Unlucky1 unlucky1 = new Unlucky1();
        Assertions.assertThat(unlucky1.unlucky1(new int[]{1, 3, 4, 5})).isEqualTo(true);
        Assertions.assertThat(unlucky1.unlucky1(new int[]{2, 1, 3, 4, 5})).isEqualTo(true);
        Assertions.assertThat(unlucky1.unlucky1(new int[]{1, 1, 1})).isEqualTo(false);
        Assertions.assertThat(unlucky1.unlucky1(new int[]{1, 3, 1})).isEqualTo(true);
        Assertions.assertThat(unlucky1.unlucky1(new int[]{1, 1, 3})).isEqualTo(true);
        Assertions.assertThat(unlucky1.unlucky1(new int[]{1, 2, 3})).isEqualTo(false);
        Assertions.assertThat(unlucky1.unlucky1(new int[]{3, 3, 3})).isEqualTo(false);
        Assertions.assertThat(unlucky1.unlucky1(new int[]{1, 3})).isEqualTo(true);
        Assertions.assertThat(unlucky1.unlucky1(new int[]{1, 4})).isEqualTo(false);
        Assertions.assertThat(unlucky1.unlucky1(new int[]{1})).isEqualTo(false);
        Assertions.assertThat(unlucky1.unlucky1(new int[]{})).isEqualTo(false);
        Assertions.assertThat(unlucky1.unlucky1(new int[]{1, 1, 1, 3, 1})).isEqualTo(false);
        Assertions.assertThat(unlucky1.unlucky1(new int[]{1, 1, 3, 1, 1})).isEqualTo(true);
        Assertions.assertThat(unlucky1.unlucky1(new int[]{1, 1, 1, 1, 3})).isEqualTo(true);
        Assertions.assertThat(unlucky1.unlucky1(new int[]{1, 4, 1, 5})).isEqualTo(false);
        Assertions.assertThat(unlucky1.unlucky1(new int[]{1, 1, 2, 3})).isEqualTo(false);
        Assertions.assertThat(unlucky1.unlucky1(new int[]{2, 3, 2, 1})).isEqualTo(false);
        Assertions.assertThat(unlucky1.unlucky1(new int[]{2, 3, 1, 3})).isEqualTo(true);
        Assertions.assertThat(unlucky1.unlucky1(new int[]{1, 2, 3, 4, 1, 3})).isEqualTo(true);
    }

}
