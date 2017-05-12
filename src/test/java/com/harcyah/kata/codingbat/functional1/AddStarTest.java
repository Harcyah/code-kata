package com.harcyah.kata.codingbat.functional1;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class AddStarTest {

    @Test
    public void testAddStar() {
        AddStar addStar = new AddStar();
        assertThat(addStar.addStar(Arrays.asList("a", "bb", "ccc"))).containsExactly("a*", "bb*", "ccc*");
        assertThat(addStar.addStar(Arrays.asList("hello", "there"))).containsExactly("hello*", "there*");
        assertThat(addStar.addStar(Arrays.asList("*"))).containsExactly("**");
        assertThat(addStar.addStar(Arrays.asList())).containsExactly();
        assertThat(addStar.addStar(Arrays.asList("kittens", "and", "chocolate", "and"))).containsExactly("kittens*", "and*", "chocolate*", "and*");
        assertThat(addStar.addStar(Arrays.asList("empty", "string", ""))).containsExactly("empty*", "string*", "*");
    }

}
