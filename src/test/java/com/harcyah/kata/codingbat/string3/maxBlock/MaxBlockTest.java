package com.harcyah.kata.codingbat.string3.maxBlock;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MaxBlockTest {

    @Test
    public void testMaxBlock() {
        MaxBlock maxBlock = new MaxBlock();
        Assertions.assertThat(maxBlock.maxBlock("hoopla")).isEqualTo(2);
        Assertions.assertThat(maxBlock.maxBlock("abbCCCddBBBxx")).isEqualTo(3);
        Assertions.assertThat(maxBlock.maxBlock("")).isEqualTo(0);
        Assertions.assertThat(maxBlock.maxBlock("xyz")).isEqualTo(1);
        Assertions.assertThat(maxBlock.maxBlock("xxyz")).isEqualTo(2);
        Assertions.assertThat(maxBlock.maxBlock("xyzz")).isEqualTo(2);
        Assertions.assertThat(maxBlock.maxBlock("abbbcbbbxbbbx")).isEqualTo(3);
        Assertions.assertThat(maxBlock.maxBlock("XXBBBbbxx")).isEqualTo(3);
        Assertions.assertThat(maxBlock.maxBlock("XXBBBBbbxx")).isEqualTo(4);
        Assertions.assertThat(maxBlock.maxBlock("XXBBBbbxxXXXX")).isEqualTo(4);
        Assertions.assertThat(maxBlock.maxBlock("XX2222BBBbbXX2222")).isEqualTo(4);
    }

}
