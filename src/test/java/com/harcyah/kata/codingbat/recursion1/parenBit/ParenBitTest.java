package com.harcyah.kata.codingbat.recursion1.parenBit;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ParenBitTest {

    @Test
    public void testParenBit() {
        ParenBit parenBit = new ParenBit();
        Assertions.assertThat(parenBit.parenBit("xyz(abc)123")).isEqualTo("(abc)");
        Assertions.assertThat(parenBit.parenBit("x(hello)")).isEqualTo("(hello)");
        Assertions.assertThat(parenBit.parenBit("(xy)1")).isEqualTo("(xy)");
        Assertions.assertThat(parenBit.parenBit("not really (possible)")).isEqualTo("(possible)");
        Assertions.assertThat(parenBit.parenBit("(abc)")).isEqualTo("(abc)");
        Assertions.assertThat(parenBit.parenBit("(abc)xyz")).isEqualTo("(abc)");
        Assertions.assertThat(parenBit.parenBit("(abc)x")).isEqualTo("(abc)");
        Assertions.assertThat(parenBit.parenBit("(x)")).isEqualTo("(x)");
        Assertions.assertThat(parenBit.parenBit("()")).isEqualTo("()");
        Assertions.assertThat(parenBit.parenBit("res (ipsa) loquitor")).isEqualTo("(ipsa)");
        Assertions.assertThat(parenBit.parenBit("hello(not really)there")).isEqualTo("(not really)");
        Assertions.assertThat(parenBit.parenBit("ab(ab)ab")).isEqualTo("(ab)");
    }

}
