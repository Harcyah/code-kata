package com.harcyah.kata.codingbat.functional1;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class Copies3Test {

    @Test
    public void testCopies3() {
        Copies3 copies3 = new Copies3();
        assertThat(copies3.copies3(Arrays.asList("a", "bb", "ccc"))).containsExactly("aaa", "bbbbbb", "ccccccccc");
        assertThat(copies3.copies3(Arrays.asList("24", "a", ""))).containsExactly("242424", "aaa", "");
        assertThat(copies3.copies3(Arrays.asList("hello", "there"))).containsExactly("hellohellohello", "theretherethere");
        assertThat(copies3.copies3(Arrays.asList("no"))).containsExactly("nonono");
        assertThat(copies3.copies3(Arrays.asList())).containsExactly();
        assertThat(copies3.copies3(Arrays.asList("this", "and", "that", "and"))).containsExactly("thisthisthis", "andandand", "thatthatthat", "andandand");
    }

}
