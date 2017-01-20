package com.harcyah.kata.codingbat.array1.frontPiece;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FrontPieceTest {

    @Test
    public void testFrontPiece() {
        FrontPiece frontPiece = new FrontPiece();
        Assertions.assertThat(frontPiece.frontPiece(new int[]{1, 2, 3})).isEqualTo(new int[]{1, 2});
        Assertions.assertThat(frontPiece.frontPiece(new int[]{1, 2})).isEqualTo(new int[]{1, 2});
        Assertions.assertThat(frontPiece.frontPiece(new int[]{1})).isEqualTo(new int[]{1});
        Assertions.assertThat(frontPiece.frontPiece(new int[]{})).isEqualTo(new int[]{});
        Assertions.assertThat(frontPiece.frontPiece(new int[]{6, 5, 0})).isEqualTo(new int[]{6, 5});
        Assertions.assertThat(frontPiece.frontPiece(new int[]{6, 5})).isEqualTo(new int[]{6, 5});
        Assertions.assertThat(frontPiece.frontPiece(new int[]{3, 1, 4, 1, 5})).isEqualTo(new int[]{3, 1});
        Assertions.assertThat(frontPiece.frontPiece(new int[]{6})).isEqualTo(new int[]{6});
    }

}
