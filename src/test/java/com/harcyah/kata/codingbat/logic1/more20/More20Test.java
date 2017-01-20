package com.harcyah.kata.codingbat.logic1.more20;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class More20Test {

    @Test
    public void testMore20() {
        More20 more20 = new More20();
        Assertions.assertThat(more20.more20(20)).isEqualTo(false);
        Assertions.assertThat(more20.more20(21)).isEqualTo(true);
        Assertions.assertThat(more20.more20(22)).isEqualTo(true);
        Assertions.assertThat(more20.more20(23)).isEqualTo(false);
        Assertions.assertThat(more20.more20(25)).isEqualTo(false);
        Assertions.assertThat(more20.more20(30)).isEqualTo(false);
        Assertions.assertThat(more20.more20(31)).isEqualTo(false);
        Assertions.assertThat(more20.more20(59)).isEqualTo(false);
        Assertions.assertThat(more20.more20(60)).isEqualTo(false);
        Assertions.assertThat(more20.more20(61)).isEqualTo(true);
        Assertions.assertThat(more20.more20(62)).isEqualTo(true);
        Assertions.assertThat(more20.more20(1020)).isEqualTo(false);
        Assertions.assertThat(more20.more20(1021)).isEqualTo(true);
        Assertions.assertThat(more20.more20(1000)).isEqualTo(false);
        Assertions.assertThat(more20.more20(1001)).isEqualTo(true);
        Assertions.assertThat(more20.more20(50)).isEqualTo(false);
        Assertions.assertThat(more20.more20(55)).isEqualTo(false);
        Assertions.assertThat(more20.more20(40)).isEqualTo(false);
        Assertions.assertThat(more20.more20(41)).isEqualTo(true);
        Assertions.assertThat(more20.more20(39)).isEqualTo(false);
        Assertions.assertThat(more20.more20(42)).isEqualTo(true);
    }

}
