package com.harcyah.kata.codingbat.array2.haveThree;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class HaveThreeTest {

    @Test
    public void testHaveThree() {
        HaveThree haveThree = new HaveThree();
        Assertions.assertThat(haveThree.haveThree(new int[]{3, 1, 3, 1, 3})).isEqualTo(true);
        Assertions.assertThat(haveThree.haveThree(new int[]{3, 1, 3, 3})).isEqualTo(false);
        Assertions.assertThat(haveThree.haveThree(new int[]{3, 4, 3, 3, 4})).isEqualTo(false);
        Assertions.assertThat(haveThree.haveThree(new int[]{1, 3, 1, 3, 1, 2})).isEqualTo(false);
        Assertions.assertThat(haveThree.haveThree(new int[]{1, 3, 1, 3, 1, 3})).isEqualTo(true);
        Assertions.assertThat(haveThree.haveThree(new int[]{1, 3, 3, 1, 3})).isEqualTo(false);
        Assertions.assertThat(haveThree.haveThree(new int[]{1, 3, 1, 3, 1, 3, 4, 3})).isEqualTo(false);
        Assertions.assertThat(haveThree.haveThree(new int[]{3, 4, 3, 4, 3, 4, 4})).isEqualTo(true);
        Assertions.assertThat(haveThree.haveThree(new int[]{3, 3, 3})).isEqualTo(false);
        Assertions.assertThat(haveThree.haveThree(new int[]{1, 3})).isEqualTo(false);
        Assertions.assertThat(haveThree.haveThree(new int[]{3})).isEqualTo(false);
        Assertions.assertThat(haveThree.haveThree(new int[]{1})).isEqualTo(false);
    }

}
