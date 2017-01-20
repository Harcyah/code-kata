package com.harcyah.kata.codingbat.array2.isEverywhere;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class IsEverywhereTest {

    @Test
    public void testIsEverywhere() {
        IsEverywhere isEverywhere = new IsEverywhere();
        Assertions.assertThat(isEverywhere.isEverywhere(new int[]{1, 2, 1, 3}, 1)).isEqualTo(true);
        Assertions.assertThat(isEverywhere.isEverywhere(new int[]{1, 2, 1, 3}, 2)).isEqualTo(false);
        Assertions.assertThat(isEverywhere.isEverywhere(new int[]{1, 2, 1, 3, 4}, 1)).isEqualTo(false);
        Assertions.assertThat(isEverywhere.isEverywhere(new int[]{2, 1, 2, 1}, 1)).isEqualTo(true);
        Assertions.assertThat(isEverywhere.isEverywhere(new int[]{2, 1, 2, 1}, 2)).isEqualTo(true);
        Assertions.assertThat(isEverywhere.isEverywhere(new int[]{2, 1, 2, 3, 1}, 2)).isEqualTo(false);
        Assertions.assertThat(isEverywhere.isEverywhere(new int[]{3, 1}, 3)).isEqualTo(true);
        Assertions.assertThat(isEverywhere.isEverywhere(new int[]{3, 1}, 2)).isEqualTo(false);
        Assertions.assertThat(isEverywhere.isEverywhere(new int[]{3}, 1)).isEqualTo(true);
        Assertions.assertThat(isEverywhere.isEverywhere(new int[]{}, 1)).isEqualTo(true);
        Assertions.assertThat(isEverywhere.isEverywhere(new int[]{1, 2, 1, 2, 3, 2, 5}, 2)).isEqualTo(true);
        Assertions.assertThat(isEverywhere.isEverywhere(new int[]{1, 2, 1, 1, 1, 2}, 2)).isEqualTo(false);
        Assertions.assertThat(isEverywhere.isEverywhere(new int[]{2, 1, 2, 1, 1, 2}, 2)).isEqualTo(false);
        Assertions.assertThat(isEverywhere.isEverywhere(new int[]{2, 1, 2, 2, 2, 1, 1, 2}, 2)).isEqualTo(false);
        Assertions.assertThat(isEverywhere.isEverywhere(new int[]{2, 1, 2, 2, 2, 1, 2, 1}, 2)).isEqualTo(true);
        Assertions.assertThat(isEverywhere.isEverywhere(new int[]{2, 1, 2, 1, 2}, 2)).isEqualTo(true);
    }

}
