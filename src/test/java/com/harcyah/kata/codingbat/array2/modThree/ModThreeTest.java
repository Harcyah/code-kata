package com.harcyah.kata.codingbat.array2.modThree;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ModThreeTest {

    @Test
    public void testModThree() {
        ModThree modThree = new ModThree();
        Assertions.assertThat(modThree.modThree(new int[]{2, 1, 3, 5})).isEqualTo(true);
        Assertions.assertThat(modThree.modThree(new int[]{2, 1, 2, 5})).isEqualTo(false);
        Assertions.assertThat(modThree.modThree(new int[]{2, 4, 2, 5})).isEqualTo(true);
        Assertions.assertThat(modThree.modThree(new int[]{1, 2, 1, 2, 1})).isEqualTo(false);
        Assertions.assertThat(modThree.modThree(new int[]{9, 9, 9})).isEqualTo(true);
        Assertions.assertThat(modThree.modThree(new int[]{1, 2, 1})).isEqualTo(false);
        Assertions.assertThat(modThree.modThree(new int[]{1, 2})).isEqualTo(false);
        Assertions.assertThat(modThree.modThree(new int[]{1})).isEqualTo(false);
        Assertions.assertThat(modThree.modThree(new int[]{})).isEqualTo(false);
        Assertions.assertThat(modThree.modThree(new int[]{9, 7, 2, 9})).isEqualTo(false);
        Assertions.assertThat(modThree.modThree(new int[]{9, 7, 2, 9, 2, 2})).isEqualTo(false);
        Assertions.assertThat(modThree.modThree(new int[]{9, 7, 2, 9, 2, 2, 6})).isEqualTo(true);
    }

}
