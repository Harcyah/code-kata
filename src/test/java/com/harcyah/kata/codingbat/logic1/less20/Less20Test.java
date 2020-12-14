package com.harcyah.kata.codingbat.logic1.less20;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Less20Test {

    @Test
    public void testLess20() {
        Less20 less20 = new Less20();
        assertThat(less20.less20(18)).isTrue();
        assertThat(less20.less20(19)).isTrue();
        assertThat(less20.less20(20)).isFalse();
        assertThat(less20.less20(8)).isFalse();
        assertThat(less20.less20(17)).isFalse();
        assertThat(less20.less20(23)).isFalse();
        assertThat(less20.less20(25)).isFalse();
        assertThat(less20.less20(30)).isFalse();
        assertThat(less20.less20(31)).isFalse();
        assertThat(less20.less20(58)).isTrue();
        assertThat(less20.less20(59)).isTrue();
        assertThat(less20.less20(60)).isFalse();
        assertThat(less20.less20(61)).isFalse();
        assertThat(less20.less20(62)).isFalse();
        assertThat(less20.less20(1017)).isFalse();
        assertThat(less20.less20(1018)).isTrue();
        assertThat(less20.less20(1019)).isTrue();
        assertThat(less20.less20(1020)).isFalse();
        assertThat(less20.less20(1021)).isFalse();
        assertThat(less20.less20(1022)).isFalse();
        assertThat(less20.less20(1023)).isFalse();
        assertThat(less20.less20(37)).isFalse();
    }

}
