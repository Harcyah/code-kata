package com.harcyah.kata.codingbat.logic1.in1To10;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class In1To10Test {

    @Test
    public void testIn1To10() {
        In1To10 in1To10 = new In1To10();
        assertThat(in1To10.in1To10(5, false)).isTrue();
        assertThat(in1To10.in1To10(11, false)).isFalse();
        assertThat(in1To10.in1To10(11, true)).isTrue();
        assertThat(in1To10.in1To10(10, false)).isTrue();
        assertThat(in1To10.in1To10(10, true)).isTrue();
        assertThat(in1To10.in1To10(9, false)).isTrue();
        assertThat(in1To10.in1To10(9, true)).isFalse();
        assertThat(in1To10.in1To10(1, false)).isTrue();
        assertThat(in1To10.in1To10(1, true)).isTrue();
        assertThat(in1To10.in1To10(0, false)).isFalse();
        assertThat(in1To10.in1To10(0, true)).isTrue();
        assertThat(in1To10.in1To10(-1, false)).isFalse();
    }

}
