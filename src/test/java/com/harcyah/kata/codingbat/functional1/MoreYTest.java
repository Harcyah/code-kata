package com.harcyah.kata.codingbat.functional1;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MoreYTest {

    @Test
    public void testMoreY() {
        MoreY moreY = new MoreY();
        assertThat(moreY.moreY(List.of("a", "b", "c")))
            .containsExactly("yay", "yby", "ycy");
        assertThat(moreY.moreY(List.of("hello", "there")))
            .containsExactly("yhelloy", "ytherey");
        assertThat(moreY.moreY(List.of("yay")))
            .containsExactly("yyayy");
        assertThat(moreY.moreY(List.of("", "a", "xx")))
            .containsExactly("yy", "yay", "yxxy");
        assertThat(moreY.moreY(List.of()))
            .containsExactly();
        assertThat(moreY.moreY(List.of("xx", "yy", "zz")))
            .containsExactly("yxxy", "yyyy", "yzzy");
    }

}
