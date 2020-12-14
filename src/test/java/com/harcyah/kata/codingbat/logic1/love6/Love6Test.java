package com.harcyah.kata.codingbat.logic1.love6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Love6Test {

    @Test
    public void testLove6() {
        Love6 love6 = new Love6();
        assertThat(love6.love6(6, 4)).isTrue();
        assertThat(love6.love6(4, 5)).isFalse();
        assertThat(love6.love6(1, 5)).isTrue();
        assertThat(love6.love6(1, 6)).isTrue();
        assertThat(love6.love6(1, 8)).isFalse();
        assertThat(love6.love6(1, 7)).isTrue();
        assertThat(love6.love6(7, 5)).isFalse();
        assertThat(love6.love6(8, 2)).isTrue();
        assertThat(love6.love6(6, 6)).isTrue();
        assertThat(love6.love6(-6, 2)).isFalse();
        assertThat(love6.love6(-4, -10)).isTrue();
        assertThat(love6.love6(-7, 1)).isFalse();
        assertThat(love6.love6(7, -1)).isTrue();
        assertThat(love6.love6(-6, 12)).isTrue();
        assertThat(love6.love6(-2, -4)).isFalse();
        assertThat(love6.love6(7, 1)).isTrue();
        assertThat(love6.love6(0, 9)).isFalse();
        assertThat(love6.love6(8, 3)).isFalse();
        assertThat(love6.love6(3, 3)).isTrue();
        assertThat(love6.love6(3, 4)).isFalse();
    }

}
