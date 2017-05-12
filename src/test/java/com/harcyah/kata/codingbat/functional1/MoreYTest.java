package com.harcyah.kata.codingbat.functional1;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class MoreYTest {

    @Test
    public void testMoreY() {
        MoreY moreY = new MoreY();
        assertThat(moreY.moreY(Arrays.asList("a", "b", "c"))).containsExactly("yay", "yby", "ycy");
        assertThat(moreY.moreY(Arrays.asList("hello", "there"))).containsExactly("yhelloy", "ytherey");
        assertThat(moreY.moreY(Arrays.asList("yay"))).containsExactly("yyayy");
        assertThat(moreY.moreY(Arrays.asList("", "a", "xx"))).containsExactly("yy", "yay", "yxxy");
        assertThat(moreY.moreY(Arrays.asList())).containsExactly();
        assertThat(moreY.moreY(Arrays.asList("xx", "yy", "zz"))).containsExactly("yxxy", "yyyy", "yzzy");
    }

}
