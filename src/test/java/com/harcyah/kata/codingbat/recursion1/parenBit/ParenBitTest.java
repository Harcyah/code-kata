package com.harcyah.kata.codingbat.recursion1.parenBit;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParenBitTest {

    @Test
    public void testParenBit() {
        ParenBit parenBit = new ParenBit();
        assertThat(parenBit.parenBit("xyz(abc)123")).isEqualTo("(abc)");
        assertThat(parenBit.parenBit("x(hello)")).isEqualTo("(hello)");
        assertThat(parenBit.parenBit("(xy)1")).isEqualTo("(xy)");
        assertThat(parenBit.parenBit("not really (possible)")).isEqualTo("(possible)");
        assertThat(parenBit.parenBit("(abc)")).isEqualTo("(abc)");
        assertThat(parenBit.parenBit("(abc)xyz")).isEqualTo("(abc)");
        assertThat(parenBit.parenBit("(abc)x")).isEqualTo("(abc)");
        assertThat(parenBit.parenBit("(x)")).isEqualTo("(x)");
        assertThat(parenBit.parenBit("()")).isEqualTo("()");
        assertThat(parenBit.parenBit("res (ipsa) loquitor")).isEqualTo("(ipsa)");
        assertThat(parenBit.parenBit("hello(not really)there")).isEqualTo("(not really)");
        assertThat(parenBit.parenBit("ab(ab)ab")).isEqualTo("(ab)");
    }

}
