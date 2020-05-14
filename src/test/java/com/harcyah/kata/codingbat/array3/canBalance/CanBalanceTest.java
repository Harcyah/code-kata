package com.harcyah.kata.codingbat.array3.canBalance;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CanBalanceTest {

    @Test
    public void testCanBalance() {
        CanBalance canBalance = new CanBalance();
        assertThat(canBalance.canBalance(new int[]{1, 1, 1, 2, 1})).isTrue();
        assertThat(canBalance.canBalance(new int[]{2, 1, 1, 2, 1})).isFalse();
        assertThat(canBalance.canBalance(new int[]{10, 10})).isTrue();
        assertThat(canBalance.canBalance(new int[]{10, 0, 1, -1, 10})).isTrue();
        assertThat(canBalance.canBalance(new int[]{1, 1, 1, 1, 4})).isTrue();
        assertThat(canBalance.canBalance(new int[]{2, 1, 1, 1, 4})).isFalse();
        assertThat(canBalance.canBalance(new int[]{2, 3, 4, 1, 2})).isFalse();
        assertThat(canBalance.canBalance(new int[]{1, 2, 3, 1, 0, 2, 3})).isTrue();
        assertThat(canBalance.canBalance(new int[]{1, 2, 3, 1, 0, 1, 3})).isFalse();
        assertThat(canBalance.canBalance(new int[]{1})).isFalse();
        assertThat(canBalance.canBalance(new int[]{1, 1, 1, 2, 1})).isTrue();
    }

}
