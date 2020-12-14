package com.harcyah.kata.codingbat.logic1.old35;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Old35Test {

    @Test
    public void testOld35() {
        Old35 old35 = new Old35();
        assertThat(old35.old35(3)).isTrue();
        assertThat(old35.old35(10)).isTrue();
        assertThat(old35.old35(15)).isFalse();
        assertThat(old35.old35(5)).isTrue();
        assertThat(old35.old35(9)).isTrue();
        assertThat(old35.old35(8)).isFalse();
        assertThat(old35.old35(7)).isFalse();
        assertThat(old35.old35(6)).isTrue();
        assertThat(old35.old35(17)).isFalse();
        assertThat(old35.old35(18)).isTrue();
        assertThat(old35.old35(29)).isFalse();
        assertThat(old35.old35(20)).isTrue();
        assertThat(old35.old35(21)).isTrue();
        assertThat(old35.old35(22)).isFalse();
        assertThat(old35.old35(45)).isFalse();
        assertThat(old35.old35(99)).isTrue();
    }

}
