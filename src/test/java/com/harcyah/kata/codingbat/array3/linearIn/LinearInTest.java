package com.harcyah.kata.codingbat.array3.linearIn;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class LinearInTest {

    @Test
    public void testLinearIn() {
        LinearIn linearIn = new LinearIn();
        Assertions.assertThat(linearIn.linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4})).isEqualTo(true);
        Assertions.assertThat(linearIn.linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4})).isEqualTo(false);
        Assertions.assertThat(linearIn.linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4})).isEqualTo(true);
        Assertions.assertThat(linearIn.linearIn(new int[]{2, 2, 4, 4, 6, 6}, new int[]{2, 4})).isEqualTo(true);
        Assertions.assertThat(linearIn.linearIn(new int[]{2, 2, 2, 2, 2}, new int[]{2, 2})).isEqualTo(true);
        Assertions.assertThat(linearIn.linearIn(new int[]{2, 2, 2, 2, 2}, new int[]{2, 4})).isEqualTo(false);
        Assertions.assertThat(linearIn.linearIn(new int[]{2, 2, 2, 2, 4}, new int[]{2, 4})).isEqualTo(true);
        Assertions.assertThat(linearIn.linearIn(new int[]{1, 2, 3}, new int[]{2})).isEqualTo(true);
        Assertions.assertThat(linearIn.linearIn(new int[]{1, 2, 3}, new int[]{-1})).isEqualTo(false);
        Assertions.assertThat(linearIn.linearIn(new int[]{1, 2, 3}, new int[]{})).isEqualTo(true);
        Assertions.assertThat(linearIn.linearIn(new int[]{-1, 0, 3, 3, 3, 10, 12}, new int[]{-1, 0, 3, 12})).isEqualTo(true);
        Assertions.assertThat(linearIn.linearIn(new int[]{-1, 0, 3, 3, 3, 10, 12}, new int[]{0, 3, 12, 14})).isEqualTo(false);
        Assertions.assertThat(linearIn.linearIn(new int[]{-1, 0, 3, 3, 3, 10, 12}, new int[]{-1, 10, 11})).isEqualTo(false);
    }

}
