package com.harcyah.kata.codingbat.logic1.shareDigit;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ShareDigitTest {

    @Test
    public void testShareDigit() {
        ShareDigit shareDigit = new ShareDigit();
        assertThat(shareDigit.shareDigit(12, 23)).isTrue();
        assertThat(shareDigit.shareDigit(12, 43)).isFalse();
        assertThat(shareDigit.shareDigit(12, 44)).isFalse();
        assertThat(shareDigit.shareDigit(23, 12)).isTrue();
        assertThat(shareDigit.shareDigit(23, 39)).isTrue();
        assertThat(shareDigit.shareDigit(23, 19)).isFalse();
        assertThat(shareDigit.shareDigit(30, 90)).isTrue();
        assertThat(shareDigit.shareDigit(30, 91)).isFalse();
        assertThat(shareDigit.shareDigit(55, 55)).isTrue();
        assertThat(shareDigit.shareDigit(55, 44)).isFalse();
    }

}
