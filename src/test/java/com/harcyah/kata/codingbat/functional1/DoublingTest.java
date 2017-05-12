package com.harcyah.kata.codingbat.functional1;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class DoublingTest {

    @Test
    public void testDoubling() {
        Doubling doubling = new Doubling();
        assertThat(doubling.doubling(Arrays.asList(1, 2, 3))).containsExactly(2, 4, 6);
        assertThat(doubling.doubling(Arrays.asList(6, 8, 6, 8, -1))).containsExactly(12, 16, 12, 16, -2);
        assertThat(doubling.doubling(Arrays.asList())).containsExactly();
        assertThat(doubling.doubling(Arrays.asList(5))).containsExactly(10);
        assertThat(doubling.doubling(Arrays.asList(5, 10))).containsExactly(10, 20);
        assertThat(doubling.doubling(Arrays.asList(8, -5, 7, 3, 109))).containsExactly(16, -10, 14, 6, 218);
        assertThat(doubling.doubling(Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2))).containsExactly(12, -6, 24, 46, 8, 2, 38, 22, 4, 6, 4);
        assertThat(doubling.doubling(Arrays.asList(3, 1, 4, 1, 5, 9))).containsExactly(6, 2, 8, 2, 10, 18);
    }

}
