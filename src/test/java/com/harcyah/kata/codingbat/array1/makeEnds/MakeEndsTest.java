package com.harcyah.kata.codingbat.array1.makeEnds;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MakeEndsTest {

    @Test
    public void testMakeEnds() {
        MakeEnds makeEnds = new MakeEnds();
        assertThat(makeEnds.makeEnds(new int[]{1, 2, 3})).isEqualTo(new int[]{1, 3});
        assertThat(makeEnds.makeEnds(new int[]{1, 2, 3, 4})).isEqualTo(new int[]{1, 4});
        assertThat(makeEnds.makeEnds(new int[]{7, 4, 6, 2})).isEqualTo(new int[]{7, 2});
        assertThat(makeEnds.makeEnds(new int[]{1, 2, 2, 2, 2, 2, 2, 3})).isEqualTo(new int[]{1, 3});
        assertThat(makeEnds.makeEnds(new int[]{7, 4})).isEqualTo(new int[]{7, 4});
        assertThat(makeEnds.makeEnds(new int[]{7})).isEqualTo(new int[]{7, 7});
        assertThat(makeEnds.makeEnds(new int[]{5, 2, 9})).isEqualTo(new int[]{5, 9});
        assertThat(makeEnds.makeEnds(new int[]{2, 3, 4, 1})).isEqualTo(new int[]{2, 1});
    }

}
