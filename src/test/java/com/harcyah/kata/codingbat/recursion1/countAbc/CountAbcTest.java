package com.harcyah.kata.codingbat.recursion1.countAbc;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountAbcTest {

    @Test
    public void testCountAbc() {
        CountAbc countAbc = new CountAbc();
        assertThat(countAbc.countAbc("abc")).isEqualTo(1);
        assertThat(countAbc.countAbc("abcxxabc")).isEqualTo(2);
        assertThat(countAbc.countAbc("abaxxaba")).isEqualTo(2);
        assertThat(countAbc.countAbc("ababc")).isEqualTo(2);
        assertThat(countAbc.countAbc("abxbc")).isEqualTo(0);
        assertThat(countAbc.countAbc("aaabc")).isEqualTo(1);
        assertThat(countAbc.countAbc("hello")).isEqualTo(0);
        assertThat(countAbc.countAbc("")).isEqualTo(0);
        assertThat(countAbc.countAbc("ab")).isEqualTo(0);
        assertThat(countAbc.countAbc("aba")).isEqualTo(1);
        assertThat(countAbc.countAbc("aca")).isEqualTo(0);
        assertThat(countAbc.countAbc("aaa")).isEqualTo(0);
    }

}
