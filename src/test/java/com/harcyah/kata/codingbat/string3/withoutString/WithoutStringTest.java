package com.harcyah.kata.codingbat.string3.withoutString;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class WithoutStringTest {

    @Test
    public void testWithoutString() {
        WithoutString withoutString = new WithoutString();
        Assertions.assertThat(withoutString.withoutString("Hello there", "llo")).isEqualTo("He there");
        Assertions.assertThat(withoutString.withoutString("Hello there", "e")).isEqualTo("Hllo thr");
        Assertions.assertThat(withoutString.withoutString("Hello there", "x")).isEqualTo("Hello there");
        Assertions.assertThat(withoutString.withoutString("This is a FISH", "IS")).isEqualTo("Th  a FH");
        Assertions.assertThat(withoutString.withoutString("THIS is a FISH", "is")).isEqualTo("TH  a FH");
        Assertions.assertThat(withoutString.withoutString("THIS is a FISH", "iS")).isEqualTo("TH  a FH");
        Assertions.assertThat(withoutString.withoutString("abxxxxab", "xx")).isEqualTo("abab");
        Assertions.assertThat(withoutString.withoutString("abxxxab", "xx")).isEqualTo("abxab");
        Assertions.assertThat(withoutString.withoutString("abxxxab", "x")).isEqualTo("abab");
        Assertions.assertThat(withoutString.withoutString("xxx", "x")).isEqualTo("");
        Assertions.assertThat(withoutString.withoutString("xxx", "xx")).isEqualTo("x");
        Assertions.assertThat(withoutString.withoutString("xyzzy", "Y")).isEqualTo("xzz");
        Assertions.assertThat(withoutString.withoutString("", "x")).isEqualTo("");
        Assertions.assertThat(withoutString.withoutString("abcabc", "b")).isEqualTo("acac");
        Assertions.assertThat(withoutString.withoutString("AA22bb", "2")).isEqualTo("AAbb");
        Assertions.assertThat(withoutString.withoutString("1111", "1")).isEqualTo("");
        Assertions.assertThat(withoutString.withoutString("1111", "11")).isEqualTo("");
        Assertions.assertThat(withoutString.withoutString("MkjtMkx", "Mk")).isEqualTo("jtx");
        Assertions.assertThat(withoutString.withoutString("Hi HoHo", "Ho")).isEqualTo("Hi ");
    }

}
