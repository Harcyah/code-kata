package com.harcyah.kata.codingbat.recursion1.count11;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Count11Test {

    @Test
    public void testCount11() {
        Count11 count11 = new Count11();
        assertThat(count11.count11("11abc11")).isEqualTo(2);
        assertThat(count11.count11("abc11x11x11")).isEqualTo(3);
        assertThat(count11.count11("111")).isEqualTo(1);
        assertThat(count11.count11("1111")).isEqualTo(2);
        assertThat(count11.count11("1")).isEqualTo(0);
        assertThat(count11.count11("")).isEqualTo(0);
        assertThat(count11.count11("hi")).isEqualTo(0);
        assertThat(count11.count11("11x111x1111")).isEqualTo(4);
        assertThat(count11.count11("1x111")).isEqualTo(1);
        assertThat(count11.count11("1Hello1")).isEqualTo(0);
        assertThat(count11.count11("Hello")).isEqualTo(0);
    }

}
