package com.harcyah.kata.codingbat.array2.fizzArray2;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FizzArray2Test {

    @Test
    public void testFizzArray2() {
        FizzArray2 fizzArray2 = new FizzArray2();
        Assertions.assertThat(fizzArray2.fizzArray2(4)).isEqualTo(new String[]{"0", "1", "2", "3"});
        Assertions.assertThat(fizzArray2.fizzArray2(10)).isEqualTo(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"});
        Assertions.assertThat(fizzArray2.fizzArray2(2)).isEqualTo(new String[]{"0", "1"});
        Assertions.assertThat(fizzArray2.fizzArray2(1)).isEqualTo(new String[]{"0"});
        Assertions.assertThat(fizzArray2.fizzArray2(0)).isEqualTo(new String[]{});
        Assertions.assertThat(fizzArray2.fizzArray2(7)).isEqualTo(new String[]{"0", "1", "2", "3", "4", "5", "6"});
        Assertions.assertThat(fizzArray2.fizzArray2(9)).isEqualTo(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8"});
        Assertions.assertThat(fizzArray2.fizzArray2(11)).isEqualTo(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"});
    }

}


