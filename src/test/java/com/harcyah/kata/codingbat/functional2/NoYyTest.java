package com.harcyah.kata.codingbat.functional2;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class NoYyTest {

    @Test
    public void testNoYy() {
        NoYy sut = new NoYy();
        assertThat(sut.noYy(List.of("a", "b", "c")))
            .containsExactly("ay", "by", "cy");
        assertThat(sut.noYy(List.of("a", "b", "cy")))
            .containsExactly("ay", "by");
        assertThat(sut.noYy(List.of("xx", "ya", "zz")))
            .containsExactly("xxy", "yay", "zzy");
        assertThat(sut.noYy(List.of("xx", "yay", "zz")))
            .containsExactly("xxy", "zzy");
        assertThat(sut.noYy(List.of("yyx", "y", "zzz")))
            .containsExactly("zzzy");
        assertThat(sut.noYy(List.of("hello", "there")))
            .containsExactly("helloy", "therey");
        assertThat(sut.noYy(List.of("ya")))
            .containsExactly("yay");
        assertThat(sut.noYy(List.of()))
            .containsExactly();
        assertThat(sut.noYy(List.of("")))
            .containsExactly("y");
        assertThat(sut.noYy(List.of("xx", "yy", "zz")))
            .containsExactly("xxy", "zzy");
    }

}
