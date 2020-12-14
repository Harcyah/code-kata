package com.harcyah.kata.codingbat.ap1.scoresSpecial;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScoresSpecialTest {

    @Test
    public void testScoresSpecial() {
        ScoresSpecial scoresSpecial = new ScoresSpecial();
        assertThat(scoresSpecial.scoresSpecial(new int[]{12, 10, 4}, new int[]{2, 20, 30}))
            .isEqualTo(40);
        assertThat(scoresSpecial.scoresSpecial(new int[]{20, 10, 4}, new int[]{2, 20, 10}))
            .isEqualTo(40);
        assertThat(scoresSpecial.scoresSpecial(new int[]{12, 11, 4}, new int[]{2, 20, 31}))
            .isEqualTo(20);
        assertThat(scoresSpecial.scoresSpecial(new int[]{1, 20, 2, 50}, new int[]{3, 4, 5}))
            .isEqualTo(50);
        assertThat(scoresSpecial.scoresSpecial(new int[]{3, 4, 5}, new int[]{1, 50, 2, 20}))
            .isEqualTo(50);
        assertThat(scoresSpecial.scoresSpecial(new int[]{10, 4, 20, 30}, new int[]{20}))
            .isEqualTo(50);
        assertThat(scoresSpecial.scoresSpecial(new int[]{10, 4, 20, 30}, new int[]{20}))
            .isEqualTo(50);
        assertThat(scoresSpecial.scoresSpecial(new int[]{10, 4, 20, 30}, new int[]{3, 20, 99}))
            .isEqualTo(50);
        assertThat(scoresSpecial.scoresSpecial(new int[]{10, 4, 20, 30}, new int[]{30, 20, 99}))
            .isEqualTo(60);
        assertThat(scoresSpecial.scoresSpecial(new int[]{}, new int[]{2}))
            .isEqualTo(0);
        assertThat(scoresSpecial.scoresSpecial(new int[]{}, new int[]{20}))
            .isEqualTo(20);
        assertThat(scoresSpecial.scoresSpecial(new int[]{14, 10, 4}, new int[]{4, 20, 30}))
            .isEqualTo(40);
    }

}
