package com.harcyah.kata.codingbat.array2.notAlone;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class NotAloneTest {

    @Test
    public void testNotAlone() {
        NotAlone notAlone = new NotAlone();
        Assertions.assertThat(notAlone.notAlone(new int[]{1, 2, 3}, 2)).isEqualTo(new int[]{1, 3, 3});
        Assertions.assertThat(notAlone.notAlone(new int[]{1, 2, 3, 2, 5, 2}, 2)).isEqualTo(new int[]{1, 3, 3, 5, 5, 2});
        Assertions.assertThat(notAlone.notAlone(new int[]{3, 4}, 3)).isEqualTo(new int[]{3, 4});
        Assertions.assertThat(notAlone.notAlone(new int[]{3, 3}, 3)).isEqualTo(new int[]{3, 3});
        Assertions.assertThat(notAlone.notAlone(new int[]{1, 3, 1, 2}, 1)).isEqualTo(new int[]{1, 3, 3, 2});
        Assertions.assertThat(notAlone.notAlone(new int[]{3}, 3)).isEqualTo(new int[]{3});
        Assertions.assertThat(notAlone.notAlone(new int[]{}, 3)).isEqualTo(new int[]{});
        Assertions.assertThat(notAlone.notAlone(new int[]{7, 1, 6}, 1)).isEqualTo(new int[]{7, 7, 6});
        Assertions.assertThat(notAlone.notAlone(new int[]{1, 1, 1}, 1)).isEqualTo(new int[]{1, 1, 1});
        Assertions.assertThat(notAlone.notAlone(new int[]{1, 1, 1, 2}, 1)).isEqualTo(new int[]{1, 1, 1, 2});
    }

}
