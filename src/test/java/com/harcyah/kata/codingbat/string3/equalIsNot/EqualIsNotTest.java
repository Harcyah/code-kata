package com.harcyah.kata.codingbat.string3.equalIsNot;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EqualIsNotTest {

    @Test
    public void testEqualIsNot() {
        EqualIsNot equalIsNot = new EqualIsNot();
        assertThat(equalIsNot.equalIsNot("This is not")).isFalse();
        assertThat(equalIsNot.equalIsNot("This is notnot")).isTrue();
        assertThat(equalIsNot.equalIsNot("noisxxnotyynotxisi")).isTrue();
        assertThat(equalIsNot.equalIsNot("noisxxnotyynotxsi")).isFalse();
        assertThat(equalIsNot.equalIsNot("xxxyyyzzzintint")).isTrue();
        assertThat(equalIsNot.equalIsNot("")).isTrue();
        assertThat(equalIsNot.equalIsNot("isisnotnot")).isTrue();
        assertThat(equalIsNot.equalIsNot("isisnotno7Not")).isFalse();
        assertThat(equalIsNot.equalIsNot("isnotis")).isFalse();
        assertThat(equalIsNot.equalIsNot("mis3notpotbotis")).isFalse();
    }

}
