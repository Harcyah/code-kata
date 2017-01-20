package com.harcyah.kata.codingbat.array1.firstLast6;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FirstLast6Test {

    @Test
    public void testFirstLast6() {
        FirstLast6 firstLast6 = new FirstLast6();
        Assertions.assertThat(firstLast6.firstLast6(new int[]{1, 2, 6})).isEqualTo(true);
        Assertions.assertThat(firstLast6.firstLast6(new int[]{6, 1, 2, 3})).isEqualTo(true);
        Assertions.assertThat(firstLast6.firstLast6(new int[]{13, 6, 1, 2, 3})).isEqualTo(false);
        Assertions.assertThat(firstLast6.firstLast6(new int[]{13, 6, 1, 2, 6})).isEqualTo(true);
        Assertions.assertThat(firstLast6.firstLast6(new int[]{3, 2, 1})).isEqualTo(false);
        Assertions.assertThat(firstLast6.firstLast6(new int[]{3, 6, 1})).isEqualTo(false);
        Assertions.assertThat(firstLast6.firstLast6(new int[]{3, 6})).isEqualTo(true);
        Assertions.assertThat(firstLast6.firstLast6(new int[]{6})).isEqualTo(true);
        Assertions.assertThat(firstLast6.firstLast6(new int[]{3})).isEqualTo(false);
        Assertions.assertThat(firstLast6.firstLast6(new int[]{5, 6})).isEqualTo(true);
        Assertions.assertThat(firstLast6.firstLast6(new int[]{5, 5})).isEqualTo(false);
        Assertions.assertThat(firstLast6.firstLast6(new int[]{1, 2, 3, 4, 6})).isEqualTo(true);
        Assertions.assertThat(firstLast6.firstLast6(new int[]{1, 2, 3, 4})).isEqualTo(false);
    }

}
