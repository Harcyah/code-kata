package com.harcyah.kata.codingbat.logic1.specialEleven;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SpecialElevenTest {

    @Test
    public void testSpecialEleven() {
        SpecialEleven specialEleven = new SpecialEleven();
        assertThat(specialEleven.specialEleven(22)).isTrue();
        assertThat(specialEleven.specialEleven(23)).isTrue();
        assertThat(specialEleven.specialEleven(24)).isFalse();
        assertThat(specialEleven.specialEleven(21)).isFalse();
        assertThat(specialEleven.specialEleven(11)).isTrue();
        assertThat(specialEleven.specialEleven(12)).isTrue();
        assertThat(specialEleven.specialEleven(10)).isFalse();
        assertThat(specialEleven.specialEleven(9)).isFalse();
        assertThat(specialEleven.specialEleven(8)).isFalse();
        assertThat(specialEleven.specialEleven(0)).isTrue();
        assertThat(specialEleven.specialEleven(1)).isTrue();
        assertThat(specialEleven.specialEleven(2)).isFalse();
        assertThat(specialEleven.specialEleven(121)).isTrue();
        assertThat(specialEleven.specialEleven(122)).isTrue();
        assertThat(specialEleven.specialEleven(123)).isFalse();
        assertThat(specialEleven.specialEleven(46)).isFalse();
        assertThat(specialEleven.specialEleven(49)).isFalse();
        assertThat(specialEleven.specialEleven(52)).isFalse();
        assertThat(specialEleven.specialEleven(54)).isFalse();
        assertThat(specialEleven.specialEleven(55)).isTrue();
    }

}
