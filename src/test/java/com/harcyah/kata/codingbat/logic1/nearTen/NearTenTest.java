package com.harcyah.kata.codingbat.logic1.nearTen;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class NearTenTest {

    @Test
    public void testNearTen() {
        NearTen nearTen = new NearTen();
        Assertions.assertThat(nearTen.nearTen(12)).isEqualTo(true);
        Assertions.assertThat(nearTen.nearTen(17)).isEqualTo(false);
        Assertions.assertThat(nearTen.nearTen(19)).isEqualTo(true);
        Assertions.assertThat(nearTen.nearTen(31)).isEqualTo(true);
        Assertions.assertThat(nearTen.nearTen(6)).isEqualTo(false);
        Assertions.assertThat(nearTen.nearTen(10)).isEqualTo(true);
        Assertions.assertThat(nearTen.nearTen(11)).isEqualTo(true);
        Assertions.assertThat(nearTen.nearTen(21)).isEqualTo(true);
        Assertions.assertThat(nearTen.nearTen(22)).isEqualTo(true);
        Assertions.assertThat(nearTen.nearTen(23)).isEqualTo(false);
        Assertions.assertThat(nearTen.nearTen(54)).isEqualTo(false);
        Assertions.assertThat(nearTen.nearTen(155)).isEqualTo(false);
        Assertions.assertThat(nearTen.nearTen(158)).isEqualTo(true);
        Assertions.assertThat(nearTen.nearTen(3)).isEqualTo(false);
        Assertions.assertThat(nearTen.nearTen(1)).isEqualTo(true);
    }

}
