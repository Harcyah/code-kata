package com.harcyah.kata.codingbat.recursion1.strCopies;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StrCopiesTest {

    @Test
    public void testStrCopies() {
        StrCopies strCopies = new StrCopies();
        assertThat(strCopies.strCopies("catcowcat", "cat", 2)).isTrue();
        assertThat(strCopies.strCopies("catcowcat", "cow", 2)).isFalse();
        assertThat(strCopies.strCopies("catcowcat", "cow", 1)).isTrue();
        assertThat(strCopies.strCopies("iiijjj", "i", 3)).isTrue();
        assertThat(strCopies.strCopies("iiijjj", "i", 4)).isFalse();
        assertThat(strCopies.strCopies("iiijjj", "ii", 2)).isTrue();
        assertThat(strCopies.strCopies("iiijjj", "ii", 3)).isFalse();
        assertThat(strCopies.strCopies("iiijjj", "x", 3)).isFalse();
        assertThat(strCopies.strCopies("iiijjj", "x", 0)).isTrue();
        assertThat(strCopies.strCopies("iiiiij", "iii", 3)).isTrue();
        assertThat(strCopies.strCopies("iiiiij", "iii", 4)).isFalse();
        assertThat(strCopies.strCopies("ijiiiiij", "iiii", 2)).isTrue();
        assertThat(strCopies.strCopies("ijiiiiij", "iiii", 3)).isFalse();
        assertThat(strCopies.strCopies("dogcatdogcat", "dog", 2)).isTrue();
    }

}
