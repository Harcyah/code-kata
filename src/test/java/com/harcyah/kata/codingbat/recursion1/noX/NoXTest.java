package com.harcyah.kata.codingbat.recursion1.noX;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class NoXTest {

    @Test
    public void testNoX() {
        NoX noX = new NoX();
        Assertions.assertThat(noX.noX("xaxb")).isEqualTo("ab");
        Assertions.assertThat(noX.noX("abc")).isEqualTo("abc");
        Assertions.assertThat(noX.noX("xx")).isEqualTo("");
        Assertions.assertThat(noX.noX("")).isEqualTo("");
        Assertions.assertThat(noX.noX("axxbxx")).isEqualTo("ab");
        Assertions.assertThat(noX.noX("Hellox")).isEqualTo("Hello");
    }

}
