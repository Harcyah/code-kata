package com.harcyah.kata.codingbat.functional1;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class NoXTest {

    @Test
    public void testNoX() {
        NoX noX = new NoX();
        assertThat(noX.noX(Arrays.asList("ax", "bb", "cx"))).containsExactly("a", "bb", "c");
        assertThat(noX.noX(Arrays.asList("xxax", "xbxbx", "xxcx"))).containsExactly("a", "bb", "c");
        assertThat(noX.noX(Arrays.asList("x"))).containsExactly("");
        assertThat(noX.noX(Arrays.asList(""))).containsExactly("");
        assertThat(noX.noX(Arrays.asList())).containsExactly();
        assertThat(noX.noX(Arrays.asList("the", "taxi"))).containsExactly("the", "tai");
        assertThat(noX.noX(Arrays.asList("the", "xxtxaxixxx"))).containsExactly("the", "tai");
        assertThat(noX.noX(Arrays.asList("this", "is", "the", "x"))).containsExactly("this", "is", "the", "");
    }

}
