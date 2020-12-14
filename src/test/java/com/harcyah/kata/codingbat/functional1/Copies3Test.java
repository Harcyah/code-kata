package com.harcyah.kata.codingbat.functional1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Copies3Test {

    @Test
    public void testCopies3() {
        Copies3 copies3 = new Copies3();
        assertThat(copies3.copies3(List.of("a", "bb", "ccc")))
            .containsExactly("aaa", "bbbbbb", "ccccccccc");
        assertThat(copies3.copies3(List.of("24", "a", "")))
            .containsExactly("242424", "aaa", "");
        assertThat(copies3.copies3(List.of("hello", "there")))
            .containsExactly("hellohellohello", "theretherethere");
        assertThat(copies3.copies3(List.of("no")))
            .containsExactly("nonono");
        assertThat(copies3.copies3(List.of()))
            .containsExactly();
        assertThat(copies3.copies3(List.of("this", "and", "that", "and")))
            .containsExactly("thisthisthis", "andandand", "thatthatthat", "andandand");
    }

}
