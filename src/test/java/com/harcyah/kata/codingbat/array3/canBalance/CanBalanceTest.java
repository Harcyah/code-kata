package com.harcyah.kata.codingbat.array3.canBalance;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CanBalanceTest {

    @Test
    public void testCanBalance() {
        CanBalance canBalance = new CanBalance();
        Assertions.assertThat(canBalance.canBalance(new int[]{1, 1, 1, 2, 1})).isEqualTo(true);
        Assertions.assertThat(canBalance.canBalance(new int[]{2, 1, 1, 2, 1})).isEqualTo(false);
        Assertions.assertThat(canBalance.canBalance(new int[]{10, 10})).isEqualTo(true);
        Assertions.assertThat(canBalance.canBalance(new int[]{10, 0, 1, -1, 10})).isEqualTo(true);
        Assertions.assertThat(canBalance.canBalance(new int[]{1, 1, 1, 1, 4})).isEqualTo(true);
        Assertions.assertThat(canBalance.canBalance(new int[]{2, 1, 1, 1, 4})).isEqualTo(false);
        Assertions.assertThat(canBalance.canBalance(new int[]{2, 3, 4, 1, 2})).isEqualTo(false);
        Assertions.assertThat(canBalance.canBalance(new int[]{1, 2, 3, 1, 0, 2, 3})).isEqualTo(true);
        Assertions.assertThat(canBalance.canBalance(new int[]{1, 2, 3, 1, 0, 1, 3})).isEqualTo(false);
        Assertions.assertThat(canBalance.canBalance(new int[]{1})).isEqualTo(false);
        Assertions.assertThat(canBalance.canBalance(new int[]{1, 1, 1, 2, 1})).isEqualTo(true);
    }

}
