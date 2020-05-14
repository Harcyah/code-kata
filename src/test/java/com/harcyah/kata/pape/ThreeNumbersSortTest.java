package com.harcyah.kata.pape;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ThreeNumbersSortTest {

    private static final int[] EXPECTED = {10, 20, 30};

    @Test
    public void testABC() {
        ThreeNumbersSort tns = new ThreeNumbersSort();
        int[] abc = {10, 20, 30};
        tns.sort(abc);
        assertThat(abc).isEqualTo(EXPECTED);
    }

    @Test
    public void testACB() {
        ThreeNumbersSort tns = new ThreeNumbersSort();
        int[] abc = {10, 30, 20};
        tns.sort(abc);
        assertThat(abc).isEqualTo(EXPECTED);
    }

    @Test
    public void testBAC() {
        ThreeNumbersSort tns = new ThreeNumbersSort();
        int[] abc = {20, 10, 30};
        tns.sort(abc);
        assertThat(abc).isEqualTo(EXPECTED);
    }

    @Test
    public void testBCA() {
        ThreeNumbersSort tns = new ThreeNumbersSort();
        int[] abc = {20, 30, 10};
        tns.sort(abc);
        assertThat(abc).isEqualTo(EXPECTED);
    }

    @Test
    public void testCAB() {
        ThreeNumbersSort tns = new ThreeNumbersSort();
        int[] abc = {30, 10, 20};
        tns.sort(abc);
        assertThat(abc).isEqualTo(EXPECTED);
    }

    @Test
    public void testCBA() {
        ThreeNumbersSort tns = new ThreeNumbersSort();
        int[] abc = {30, 20, 10};
        tns.sort(abc);
        assertThat(abc).isEqualTo(EXPECTED);
    }

}
