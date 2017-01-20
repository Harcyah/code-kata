package com.harcyah.kata.codingbat.string3.notReplace;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class NotReplaceTest {

    @Test
    public void testNotReplace() {
        NotReplace notReplace = new NotReplace();
        Assertions.assertThat(notReplace.notReplace("is test")).isEqualTo("is not test");
        Assertions.assertThat(notReplace.notReplace("is-is")).isEqualTo("is not-is not");
        Assertions.assertThat(notReplace.notReplace("This is right")).isEqualTo("This is not right");
        Assertions.assertThat(notReplace.notReplace("This is isabell")).isEqualTo("This is not isabell");
        Assertions.assertThat(notReplace.notReplace("")).isEqualTo("");
        Assertions.assertThat(notReplace.notReplace("is")).isEqualTo("is not");
        Assertions.assertThat(notReplace.notReplace("isis")).isEqualTo("isis");
        Assertions.assertThat(notReplace.notReplace("Dis is bliss is")).isEqualTo("Dis is not bliss is not");
        Assertions.assertThat(notReplace.notReplace("is his")).isEqualTo("is not his");
        Assertions.assertThat(notReplace.notReplace("xis yis")).isEqualTo("xis yis");
        Assertions.assertThat(notReplace.notReplace("AAAis is")).isEqualTo("AAAis is not");
    }

}
