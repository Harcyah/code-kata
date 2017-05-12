package com.harcyah.kata.codingbat.functional1;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class RightDigitTest {

    @Test
    public void testRightDigit() {
        RightDigit rightDigit = new RightDigit();
        assertThat(rightDigit.rightDigit(Arrays.asList(1, 22, 93))).containsExactly(1, 2, 3);
        assertThat(rightDigit.rightDigit(Arrays.asList(16, 8, 886, 8, 1))).containsExactly(6, 8, 6, 8, 1);
        assertThat(rightDigit.rightDigit(Arrays.asList(10, 0))).containsExactly(0, 0);
        assertThat(rightDigit.rightDigit(Arrays.asList())).containsExactly();
        assertThat(rightDigit.rightDigit(Arrays.asList(5, 10))).containsExactly(5, 0);
        assertThat(rightDigit.rightDigit(Arrays.asList(5, 50, 500, 5000, 5000))).containsExactly(5, 0, 0, 0, 0);
        assertThat(rightDigit.rightDigit(Arrays.asList(6, 23, 12, 23, 4, 1, 19, 1119, 2, 3, 2))).containsExactly(6, 3, 2, 3, 4, 1, 9, 9, 2, 3, 2);
    }

}
