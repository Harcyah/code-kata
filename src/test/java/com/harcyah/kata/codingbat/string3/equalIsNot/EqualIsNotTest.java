package com.harcyah.kata.codingbat.string3.equalIsNot;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class EqualIsNotTest {

    @Test
    public void testEqualIsNot() {
        EqualIsNot equalIsNot = new EqualIsNot();
        Assertions.assertThat(equalIsNot.equalIsNot("This is not")).isEqualTo(false);
        Assertions.assertThat(equalIsNot.equalIsNot("This is notnot")).isEqualTo(true);
        Assertions.assertThat(equalIsNot.equalIsNot("noisxxnotyynotxisi")).isEqualTo(true);
        Assertions.assertThat(equalIsNot.equalIsNot("noisxxnotyynotxsi")).isEqualTo(false);
        Assertions.assertThat(equalIsNot.equalIsNot("xxxyyyzzzintint")).isEqualTo(true);
        Assertions.assertThat(equalIsNot.equalIsNot("")).isEqualTo(true);
        Assertions.assertThat(equalIsNot.equalIsNot("isisnotnot")).isEqualTo(true);
        Assertions.assertThat(equalIsNot.equalIsNot("isisnotno7Not")).isEqualTo(false);
        Assertions.assertThat(equalIsNot.equalIsNot("isnotis")).isEqualTo(false);
        Assertions.assertThat(equalIsNot.equalIsNot("mis3notpotbotis")).isEqualTo(false);
    }

}
