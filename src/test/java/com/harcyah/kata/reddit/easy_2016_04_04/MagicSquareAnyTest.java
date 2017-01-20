package com.harcyah.kata.reddit.easy_2016_04_04;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class MagicSquareAnyTest {

    protected MagicSquareAny msa = new MagicSquareAny();

    @Test
    public void testComputeMagicConstant() throws Exception {
        Assert.assertEquals(15, MagicSquareAny.computeMagicConstant(3));
        Assert.assertEquals(65, MagicSquareAny.computeMagicConstant(5));
        Assert.assertEquals(175, MagicSquareAny.computeMagicConstant(7));
    }

    @Test
    public void testIsMagicSquare3x3() throws Exception {
        Assertions.assertThat(msa.isMagicSquare(new int[]{8, 1, 6, 3, 5, 7, 4, 9, 2})).isTrue();
        Assertions.assertThat(msa.isMagicSquare(new int[]{2, 7, 6, 9, 5, 1, 4, 3, 8})).isTrue();
        Assertions.assertThat(msa.isMagicSquare(new int[]{3, 5, 7, 8, 1, 6, 4, 9, 2})).isFalse();
        Assertions.assertThat(msa.isMagicSquare(new int[]{8, 1, 6, 7, 5, 3, 4, 9, 2})).isFalse();
    }

    @Test
    public void testIsMagicSquare4x4() throws Exception {
        Assertions.assertThat(msa.isMagicSquare(new int[]{4, 14, 15, 1, 9, 7, 6, 12, 5, 11, 10, 8, 16, 2, 3, 13})).isTrue();
        Assertions.assertThat(msa.isMagicSquare(new int[]{4, 14, 15, 1, 9, 7, 6, 12, 5, 10, 11, 8, 16, 2, 3, 13})).isFalse();
    }

    @Test
    public void testIsMagicSquare5x5() throws Exception {
        Assertions.assertThat(msa.isMagicSquare(new int[]{11, 24, 7, 20, 3, 4, 12, 25, 8, 16, 17, 5, 13, 21, 9, 10, 18, 1, 14, 22, 23, 6, 19, 2, 15})).isTrue();
        Assertions.assertThat(msa.isMagicSquare(new int[]{11, 24, 7, 20, 3, 4, 12, 25, 8, 16, 17, 5, 13, 21, 9, 10, 18, 1, 14, 22, 23, 6, 19, 2, 16})).isFalse();
    }

    @Test
    public void testGetTopLeftBottomRightDiagonalCheck() throws Exception {
        Assertions.assertThat(msa.getTopLeftBottomRightDiagonalCheck(3)).isEqualTo(new int[]{0, 4, 8});
        Assertions.assertThat(msa.getTopLeftBottomRightDiagonalCheck(4)).isEqualTo(new int[]{0, 5, 10, 15});
    }

    @Test
    public void testGetTopRightBottomLeftDiagonalCheck() throws Exception {
        Assertions.assertThat(msa.getTopRightBottomLeftDiagonalCheck(3)).isEqualTo(new int[]{2, 4, 6});
        Assertions.assertThat(msa.getTopRightBottomLeftDiagonalCheck(4)).isEqualTo(new int[]{3, 6, 9, 12});
    }

}
