package com.harcyah.kata.codingbat.recursion1.stringClean;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class StringCleanTest {

    @Test
    public void testStringClean() {
        StringClean stringClean = new StringClean();
        Assertions.assertThat(stringClean.stringClean("yyzzza")).isEqualTo("yza");
        Assertions.assertThat(stringClean.stringClean("abbbcdd")).isEqualTo("abcd");
        Assertions.assertThat(stringClean.stringClean("Hello")).isEqualTo("Helo");
        Assertions.assertThat(stringClean.stringClean("XXabcYY")).isEqualTo("XabcY");
        Assertions.assertThat(stringClean.stringClean("112ab445")).isEqualTo("12ab45");
        Assertions.assertThat(stringClean.stringClean("Hello Bookkeeper")).isEqualTo("Helo Bokeper");
    }

}
