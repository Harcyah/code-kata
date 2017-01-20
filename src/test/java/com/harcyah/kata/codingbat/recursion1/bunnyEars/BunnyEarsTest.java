package com.harcyah.kata.codingbat.recursion1.bunnyEars;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BunnyEarsTest {

    @Test
    public void testBunnyEars() {
        BunnyEars bunnyEars = new BunnyEars();
        Assertions.assertThat(bunnyEars.bunnyEars(0)).isEqualTo(0);
        Assertions.assertThat(bunnyEars.bunnyEars(1)).isEqualTo(2);
        Assertions.assertThat(bunnyEars.bunnyEars(2)).isEqualTo(4);
        Assertions.assertThat(bunnyEars.bunnyEars(3)).isEqualTo(6);
        Assertions.assertThat(bunnyEars.bunnyEars(4)).isEqualTo(8);
        Assertions.assertThat(bunnyEars.bunnyEars(5)).isEqualTo(10);
        Assertions.assertThat(bunnyEars.bunnyEars(12)).isEqualTo(24);
        Assertions.assertThat(bunnyEars.bunnyEars(50)).isEqualTo(100);
        Assertions.assertThat(bunnyEars.bunnyEars(234)).isEqualTo(468);
    }

}
