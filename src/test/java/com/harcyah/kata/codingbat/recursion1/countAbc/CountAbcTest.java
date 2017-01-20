package com.harcyah.kata.codingbat.recursion1.countAbc;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CountAbcTest {

    @Test
    public void testCountAbc() {
        CountAbc countAbc = new CountAbc();
        Assertions.assertThat(countAbc.countAbc("abc")).isEqualTo(1);
        Assertions.assertThat(countAbc.countAbc("abcxxabc")).isEqualTo(2);
        Assertions.assertThat(countAbc.countAbc("abaxxaba")).isEqualTo(2);
        Assertions.assertThat(countAbc.countAbc("ababc")).isEqualTo(2);
        Assertions.assertThat(countAbc.countAbc("abxbc")).isEqualTo(0);
        Assertions.assertThat(countAbc.countAbc("aaabc")).isEqualTo(1);
        Assertions.assertThat(countAbc.countAbc("hello")).isEqualTo(0);
        Assertions.assertThat(countAbc.countAbc("")).isEqualTo(0);
        Assertions.assertThat(countAbc.countAbc("ab")).isEqualTo(0);
        Assertions.assertThat(countAbc.countAbc("aba")).isEqualTo(1);
        Assertions.assertThat(countAbc.countAbc("aca")).isEqualTo(0);
        Assertions.assertThat(countAbc.countAbc("aaa")).isEqualTo(0);
    }

}
