package com.harcyah.kata.codingbat.array1.makeLast;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MakeLastTest {

    @Test
    public void testMakeLast() {
        MakeLast makeLast = new MakeLast();
        assertThat(makeLast.makeLast(new int[]{4, 5, 6})).isEqualTo(new int[]{0, 0, 0, 0, 0, 6});
        assertThat(makeLast.makeLast(new int[]{1, 2})).isEqualTo(new int[]{0, 0, 0, 2});
        assertThat(makeLast.makeLast(new int[]{3})).isEqualTo(new int[]{0, 3});
        assertThat(makeLast.makeLast(new int[]{0})).isEqualTo(new int[]{0, 0});
        assertThat(makeLast.makeLast(new int[]{7, 7, 7})).isEqualTo(new int[]{0, 0, 0, 0, 0, 7});
        assertThat(makeLast.makeLast(new int[]{3, 1, 4})).isEqualTo(new int[]{0, 0, 0, 0, 0, 4});
        assertThat(makeLast.makeLast(new int[]{1, 2, 3, 4})).isEqualTo(new int[]{0, 0, 0, 0, 0, 0, 0, 4});
        assertThat(makeLast.makeLast(new int[]{1, 2, 3, 0})).isEqualTo(new int[]{0, 0, 0, 0, 0, 0, 0, 0});
        assertThat(makeLast.makeLast(new int[]{2, 4})).isEqualTo(new int[]{0, 0, 0, 4});
    }

}
