package com.harcyah.kata.codingbat.array2.haveThree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HaveThreeTest {

    @Test
    public void testHaveThree() {
        HaveThree haveThree = new HaveThree();
        assertThat(haveThree.haveThree(new int[]{3, 1, 3, 1, 3}))
            .isTrue();
        assertThat(haveThree.haveThree(new int[]{3, 1, 3, 3}))
            .isFalse();
        assertThat(haveThree.haveThree(new int[]{3, 4, 3, 3, 4}))
            .isFalse();
        assertThat(haveThree.haveThree(new int[]{1, 3, 1, 3, 1, 2}))
            .isFalse();
        assertThat(haveThree.haveThree(new int[]{1, 3, 1, 3, 1, 3}))
            .isTrue();
        assertThat(haveThree.haveThree(new int[]{1, 3, 3, 1, 3}))
            .isFalse();
        assertThat(haveThree.haveThree(new int[]{1, 3, 1, 3, 1, 3, 4, 3}))
            .isFalse();
        assertThat(haveThree.haveThree(new int[]{3, 4, 3, 4, 3, 4, 4}))
            .isTrue();
        assertThat(haveThree.haveThree(new int[]{3, 3, 3}))
            .isFalse();
        assertThat(haveThree.haveThree(new int[]{1, 3}))
            .isFalse();
        assertThat(haveThree.haveThree(new int[]{3}))
            .isFalse();
        assertThat(haveThree.haveThree(new int[]{1}))
            .isFalse();
    }

}
