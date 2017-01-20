package com.harcyah.kata.codingbat.string3.gHappy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class GHappyTest {

    @Test
    public void testGHappy() {
        GHappy gHappy = new GHappy();
        Assertions.assertThat(gHappy.gHappy("xxggxx")).isEqualTo(true);
        Assertions.assertThat(gHappy.gHappy("xxgxx")).isEqualTo(false);
        Assertions.assertThat(gHappy.gHappy("xxggyygxx")).isEqualTo(false);
        Assertions.assertThat(gHappy.gHappy("g")).isEqualTo(false);
        Assertions.assertThat(gHappy.gHappy("gg")).isEqualTo(true);
        Assertions.assertThat(gHappy.gHappy("")).isEqualTo(true);
        Assertions.assertThat(gHappy.gHappy("xxgggxyz")).isEqualTo(true);
        Assertions.assertThat(gHappy.gHappy("xxgggxyg")).isEqualTo(false);
        Assertions.assertThat(gHappy.gHappy("xxgggxygg")).isEqualTo(true);
        Assertions.assertThat(gHappy.gHappy("mgm")).isEqualTo(false);
        Assertions.assertThat(gHappy.gHappy("mggm")).isEqualTo(true);
        Assertions.assertThat(gHappy.gHappy("yyygggxyy")).isEqualTo(true);
    }

}
