package com.harcyah.kata.codingbat.array1.frontPiece;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrontPieceTest {

    @Test
    public void testFrontPiece() {
        FrontPiece frontPiece = new FrontPiece();
        assertThat(frontPiece.frontPiece(new int[]{1, 2, 3})).isEqualTo(new int[]{1, 2});
        assertThat(frontPiece.frontPiece(new int[]{1, 2})).isEqualTo(new int[]{1, 2});
        assertThat(frontPiece.frontPiece(new int[]{1})).isEqualTo(new int[]{1});
        assertThat(frontPiece.frontPiece(new int[]{})).isEqualTo(new int[]{});
        assertThat(frontPiece.frontPiece(new int[]{6, 5, 0})).isEqualTo(new int[]{6, 5});
        assertThat(frontPiece.frontPiece(new int[]{6, 5})).isEqualTo(new int[]{6, 5});
        assertThat(frontPiece.frontPiece(new int[]{3, 1, 4, 1, 5})).isEqualTo(new int[]{3, 1});
        assertThat(frontPiece.frontPiece(new int[]{6})).isEqualTo(new int[]{6});
    }

}
