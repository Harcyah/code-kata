package com.harcyah.kata.codingbat.logic1.in1To10;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class In1To10Test {

    @Test
    public void testIn1To10() {
        In1To10 in1To10 = new In1To10();
        Assertions.assertThat(in1To10.in1To10(5, false)).isEqualTo(true);
        Assertions.assertThat(in1To10.in1To10(11, false)).isEqualTo(false);
        Assertions.assertThat(in1To10.in1To10(11, true)).isEqualTo(true);
        Assertions.assertThat(in1To10.in1To10(10, false)).isEqualTo(true);
        Assertions.assertThat(in1To10.in1To10(10, true)).isEqualTo(true);
        Assertions.assertThat(in1To10.in1To10(9, false)).isEqualTo(true);
        Assertions.assertThat(in1To10.in1To10(9, true)).isEqualTo(false);
        Assertions.assertThat(in1To10.in1To10(1, false)).isEqualTo(true);
        Assertions.assertThat(in1To10.in1To10(1, true)).isEqualTo(true);
        Assertions.assertThat(in1To10.in1To10(0, false)).isEqualTo(false);
        Assertions.assertThat(in1To10.in1To10(0, true)).isEqualTo(true);
        Assertions.assertThat(in1To10.in1To10(-1, false)).isEqualTo(false);
    }

}
