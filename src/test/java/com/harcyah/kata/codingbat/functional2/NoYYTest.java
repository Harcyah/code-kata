package com.harcyah.kata.codingbat.functional2;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class NoYYTest {

    @Test
    public void testNoYY() {
        NoYY noYY = new NoYY();
        assertThat(noYY.noYY(Arrays.asList("a", "b", "c"))).containsExactly("ay", "by", "cy");
        assertThat(noYY.noYY(Arrays.asList("a", "b", "cy"))).containsExactly("ay", "by");
        assertThat(noYY.noYY(Arrays.asList("xx", "ya", "zz"))).containsExactly("xxy", "yay", "zzy");
        assertThat(noYY.noYY(Arrays.asList("xx", "yay", "zz"))).containsExactly("xxy", "zzy");
        assertThat(noYY.noYY(Arrays.asList("yyx", "y", "zzz"))).containsExactly("zzzy");
        assertThat(noYY.noYY(Arrays.asList("hello", "there"))).containsExactly("helloy", "therey");
        assertThat(noYY.noYY(Arrays.asList("ya"))).containsExactly("yay");
        assertThat(noYY.noYY(Arrays.asList())).containsExactly();
        assertThat(noYY.noYY(Arrays.asList(""))).containsExactly("y");
        assertThat(noYY.noYY(Arrays.asList("xx", "yy", "zz"))).containsExactly("xxy", "zzy");
    }

}
