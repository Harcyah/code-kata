package com.harcyah.kata.codingbat.string3.countYZ;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountYzTest {

    @Test
    public void testCount() {
        CountYZ sut = new CountYZ();
        assertThat(sut.count("fez day")).isEqualTo(2);
        assertThat(sut.count("day fez")).isEqualTo(2);
        assertThat(sut.count("day fyyyz")).isEqualTo(2);
        assertThat(sut.count("day yak")).isEqualTo(1);
        assertThat(sut.count("day:yak")).isEqualTo(1);
        assertThat(sut.count("!!day--yaz!!")).isEqualTo(2);
        assertThat(sut.count("yak zak")).isEqualTo(0);
        assertThat(sut.count("DAY abc XYZ")).isEqualTo(2);
        assertThat(sut.count("aaz yyz my")).isEqualTo(3);
        assertThat(sut.count("y2bz")).isEqualTo(2);
        assertThat(sut.count("zxyx")).isEqualTo(0);
    }

}
