package com.harcyah.kata.codingbat.recursion1.strCount;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StrCountTest {

    @Test
    public void testStrCount() {
        StrCount strCount = new StrCount();
        assertThat(strCount.strCount("catcowcat", "cat")).isEqualTo(2);
        assertThat(strCount.strCount("catcowcat", "cow")).isEqualTo(1);
        assertThat(strCount.strCount("catcowcat", "dog")).isEqualTo(0);
        assertThat(strCount.strCount("cacatcowcat", "cat")).isEqualTo(2);
        assertThat(strCount.strCount("xyx", "x")).isEqualTo(2);
        assertThat(strCount.strCount("iiiijj", "i")).isEqualTo(4);
        assertThat(strCount.strCount("iiiijj", "ii")).isEqualTo(2);
        assertThat(strCount.strCount("iiiijj", "iii")).isEqualTo(1);
        assertThat(strCount.strCount("iiiijj", "j")).isEqualTo(2);
        assertThat(strCount.strCount("iiiijj", "jj")).isEqualTo(1);
        assertThat(strCount.strCount("aaabababab", "ab")).isEqualTo(4);
        assertThat(strCount.strCount("aaabababab", "aa")).isEqualTo(1);
        assertThat(strCount.strCount("aaabababab", "a")).isEqualTo(6);
        assertThat(strCount.strCount("aaabababab", "b")).isEqualTo(4);
    }

}
