package com.harcyah.kata.codingbat.ap1.commonTwo;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CommonTwoTest {

    @Test
    public void testCommonTwo() {
        CommonTwo commonTwo = new CommonTwo();
        Assertions.assertThat(commonTwo.commonTwo(new String[]{"a", "c", "x"}, new String[]{"b", "c", "d", "x"})).isEqualTo(2);
        Assertions.assertThat(commonTwo.commonTwo(new String[]{"a", "c", "x"}, new String[]{"a", "b", "c", "x", "z"})).isEqualTo(3);
        Assertions.assertThat(commonTwo.commonTwo(new String[]{"a", "b", "c"}, new String[]{"a", "b", "c"})).isEqualTo(3);
        Assertions.assertThat(commonTwo.commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"a", "b", "c"})).isEqualTo(3);
        Assertions.assertThat(commonTwo.commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"a", "b", "b", "b", "c"})).isEqualTo(3);
        Assertions.assertThat(commonTwo.commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"a", "b", "b", "c", "c"})).isEqualTo(3);
        Assertions.assertThat(commonTwo.commonTwo(new String[]{"b", "b", "b", "b", "c"}, new String[]{"a", "b", "b", "b", "c"})).isEqualTo(2);
        Assertions.assertThat(commonTwo.commonTwo(new String[]{"a", "b", "c", "c", "d"}, new String[]{"a", "b", "b", "c", "d", "d"})).isEqualTo(4);
        Assertions.assertThat(commonTwo.commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"b", "b", "b"})).isEqualTo(1);
        Assertions.assertThat(commonTwo.commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"c", "c"})).isEqualTo(1);
        Assertions.assertThat(commonTwo.commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"b", "b", "b", "x"})).isEqualTo(1);
        Assertions.assertThat(commonTwo.commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"b", "b"})).isEqualTo(1);
        Assertions.assertThat(commonTwo.commonTwo(new String[]{"a"}, new String[]{"a", "b"})).isEqualTo(1);
        Assertions.assertThat(commonTwo.commonTwo(new String[]{"a"}, new String[]{"b"})).isEqualTo(0);
        Assertions.assertThat(commonTwo.commonTwo(new String[]{"a", "a"}, new String[]{"b", "b"})).isEqualTo(0);
        Assertions.assertThat(commonTwo.commonTwo(new String[]{"a", "b"}, new String[]{"a", "b"})).isEqualTo(2);
    }

}
