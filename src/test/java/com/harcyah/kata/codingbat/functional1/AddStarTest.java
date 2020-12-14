package com.harcyah.kata.codingbat.functional1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AddStarTest {

    @Test
    public void testAddStar() {
        AddStar addStar = new AddStar();
        assertThat(addStar.addStar(List.of("a", "bb", "ccc")))
            .containsExactly("a*", "bb*", "ccc*");
        assertThat(addStar.addStar(List.of("hello", "there")))
            .containsExactly("hello*", "there*");
        assertThat(addStar.addStar(List.of("*")))
            .containsExactly("**");
        assertThat(addStar.addStar(List.of()))
            .containsExactly();
        assertThat(addStar.addStar(List.of("kittens", "and", "chocolate", "and")))
            .containsExactly("kittens*", "and*", "chocolate*", "and*");
        assertThat(addStar.addStar(List.of("empty", "string", "")))
            .containsExactly("empty*", "string*", "*");
    }

}
