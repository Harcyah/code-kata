package com.harcyah.kata.codingbat.array1.makeLast;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MakeLastTest {

    @Test
    public void testMakeLast() {
        MakeLast makeLast = new MakeLast();
        Assertions.assertThat(makeLast.makeLast(new int[]{4, 5, 6})).isEqualTo(new int[]{0, 0, 0, 0, 0, 6});
        Assertions.assertThat(makeLast.makeLast(new int[]{1, 2})).isEqualTo(new int[]{0, 0, 0, 2});
        Assertions.assertThat(makeLast.makeLast(new int[]{3})).isEqualTo(new int[]{0, 3});
        Assertions.assertThat(makeLast.makeLast(new int[]{0})).isEqualTo(new int[]{0, 0});
        Assertions.assertThat(makeLast.makeLast(new int[]{7, 7, 7})).isEqualTo(new int[]{0, 0, 0, 0, 0, 7});
        Assertions.assertThat(makeLast.makeLast(new int[]{3, 1, 4})).isEqualTo(new int[]{0, 0, 0, 0, 0, 4});
        Assertions.assertThat(makeLast.makeLast(new int[]{1, 2, 3, 4})).isEqualTo(new int[]{0, 0, 0, 0, 0, 0, 0, 4});
        Assertions.assertThat(makeLast.makeLast(new int[]{1, 2, 3, 0})).isEqualTo(new int[]{0, 0, 0, 0, 0, 0, 0, 0});
        Assertions.assertThat(makeLast.makeLast(new int[]{2, 4})).isEqualTo(new int[]{0, 0, 0, 4});
    }

}
