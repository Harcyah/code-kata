package com.harcyah.kata.codingbat.recursion1.strCount;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class StrCountTest {

    @Test
    public void testStrCount() {
        StrCount strCount = new StrCount();
        Assertions.assertThat(strCount.strCount("catcowcat", "cat")).isEqualTo(2);
        Assertions.assertThat(strCount.strCount("catcowcat", "cow")).isEqualTo(1);
        Assertions.assertThat(strCount.strCount("catcowcat", "dog")).isEqualTo(0);
        Assertions.assertThat(strCount.strCount("cacatcowcat", "cat")).isEqualTo(2);
        Assertions.assertThat(strCount.strCount("xyx", "x")).isEqualTo(2);
        Assertions.assertThat(strCount.strCount("iiiijj", "i")).isEqualTo(4);
        Assertions.assertThat(strCount.strCount("iiiijj", "ii")).isEqualTo(2);
        Assertions.assertThat(strCount.strCount("iiiijj", "iii")).isEqualTo(1);
        Assertions.assertThat(strCount.strCount("iiiijj", "j")).isEqualTo(2);
        Assertions.assertThat(strCount.strCount("iiiijj", "jj")).isEqualTo(1);
        Assertions.assertThat(strCount.strCount("aaabababab", "ab")).isEqualTo(4);
        Assertions.assertThat(strCount.strCount("aaabababab", "aa")).isEqualTo(1);
        Assertions.assertThat(strCount.strCount("aaabababab", "a")).isEqualTo(6);
        Assertions.assertThat(strCount.strCount("aaabababab", "b")).isEqualTo(4);
    }

}
