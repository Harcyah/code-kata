package com.harcyah.kata.codingbat.recursion2.groupNoAdj;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class GroupNoAdjTest {

    @Test
    public void testGroupNoAdj() {
        GroupNoAdj groupNoAdj = new GroupNoAdj();
        Assertions.assertThat(groupNoAdj.groupNoAdj(0, new int[]{2, 5, 10, 4}, 12)).isEqualTo(true);
        Assertions.assertThat(groupNoAdj.groupNoAdj(0, new int[]{2, 5, 10, 4}, 14)).isEqualTo(false);
        Assertions.assertThat(groupNoAdj.groupNoAdj(0, new int[]{2, 5, 10, 4}, 7)).isEqualTo(false);
        Assertions.assertThat(groupNoAdj.groupNoAdj(0, new int[]{2, 5, 10, 4, 2}, 7)).isEqualTo(true);
        Assertions.assertThat(groupNoAdj.groupNoAdj(0, new int[]{2, 5, 10, 4}, 9)).isEqualTo(true);
        Assertions.assertThat(groupNoAdj.groupNoAdj(0, new int[]{10, 2, 2, 3, 3}, 15)).isEqualTo(true);
        Assertions.assertThat(groupNoAdj.groupNoAdj(0, new int[]{10, 2, 2, 3, 3}, 7)).isEqualTo(false);
        Assertions.assertThat(groupNoAdj.groupNoAdj(0, new int[]{}, 0)).isEqualTo(true);
        Assertions.assertThat(groupNoAdj.groupNoAdj(0, new int[]{1}, 1)).isEqualTo(true);
        Assertions.assertThat(groupNoAdj.groupNoAdj(0, new int[]{9}, 1)).isEqualTo(false);
        Assertions.assertThat(groupNoAdj.groupNoAdj(0, new int[]{9}, 0)).isEqualTo(true);
        Assertions.assertThat(groupNoAdj.groupNoAdj(0, new int[]{5, 10, 4, 1}, 11)).isEqualTo(true);
    }

}
