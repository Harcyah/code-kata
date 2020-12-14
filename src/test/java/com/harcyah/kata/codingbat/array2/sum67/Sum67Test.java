package com.harcyah.kata.codingbat.array2.sum67;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Sum67Test {

    @Test
    public void testSum67() {
        Sum67 sum67 = new Sum67();
        assertThat(sum67.sum67(new int[]{1, 2, 2})).isEqualTo(5);
        assertThat(sum67.sum67(new int[]{1, 2, 2, 6, 99, 99, 7})).isEqualTo(5);
        assertThat(sum67.sum67(new int[]{1, 1, 6, 7, 2})).isEqualTo(4);
        assertThat(sum67.sum67(new int[]{1, 6, 2, 2, 7, 1, 6, 99, 99, 7})).isEqualTo(2);
        assertThat(sum67.sum67(new int[]{1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7})).isEqualTo(2);
        assertThat(sum67.sum67(new int[]{2, 7, 6, 2, 6, 7, 2, 7})).isEqualTo(18);
        assertThat(sum67.sum67(new int[]{2, 7, 6, 2, 6, 2, 7})).isEqualTo(9);
        assertThat(sum67.sum67(new int[]{1, 6, 7, 7})).isEqualTo(8);
        assertThat(sum67.sum67(new int[]{6, 7, 1, 6, 7, 7})).isEqualTo(8);
        assertThat(sum67.sum67(new int[]{6, 8, 1, 6, 7})).isEqualTo(0);
        assertThat(sum67.sum67(new int[]{})).isEqualTo(0);
        assertThat(sum67.sum67(new int[]{6, 7, 11})).isEqualTo(11);
        assertThat(sum67.sum67(new int[]{11, 6, 7, 11})).isEqualTo(22);
        assertThat(sum67.sum67(new int[]{2, 2, 6, 7, 7})).isEqualTo(11);
    }

}

