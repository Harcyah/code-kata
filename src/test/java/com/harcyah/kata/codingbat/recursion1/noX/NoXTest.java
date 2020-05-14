package com.harcyah.kata.codingbat.recursion1.noX;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NoXTest {

    @Test
    public void testNoX() {
        NoX noX = new NoX();
        assertThat(noX.noX("xaxb")).isEqualTo("ab");
        assertThat(noX.noX("abc")).isEqualTo("abc");
        assertThat(noX.noX("xx")).isEqualTo("");
        assertThat(noX.noX("")).isEqualTo("");
        assertThat(noX.noX("axxbxx")).isEqualTo("ab");
        assertThat(noX.noX("Hellox")).isEqualTo("Hello");
    }

}
