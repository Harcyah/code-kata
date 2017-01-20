package com.harcyah.kata.codingbat.logic1.shareDigit;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ShareDigitTest {

    @Test
    public void testShareDigit() {
        ShareDigit shareDigit = new ShareDigit();
        Assertions.assertThat(shareDigit.shareDigit(12, 23)).isEqualTo(true);
        Assertions.assertThat(shareDigit.shareDigit(12, 43)).isEqualTo(false);
        Assertions.assertThat(shareDigit.shareDigit(12, 44)).isEqualTo(false);
        Assertions.assertThat(shareDigit.shareDigit(23, 12)).isEqualTo(true);
        Assertions.assertThat(shareDigit.shareDigit(23, 39)).isEqualTo(true);
        Assertions.assertThat(shareDigit.shareDigit(23, 19)).isEqualTo(false);
        Assertions.assertThat(shareDigit.shareDigit(30, 90)).isEqualTo(true);
        Assertions.assertThat(shareDigit.shareDigit(30, 91)).isEqualTo(false);
        Assertions.assertThat(shareDigit.shareDigit(55, 55)).isEqualTo(true);
        Assertions.assertThat(shareDigit.shareDigit(55, 44)).isEqualTo(false);
    }

}
