package com.harcyah.kata.codingbat.ap1.mergeTwo;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MergeTwoTest {

    @Test
    public void testMergeTwo() {
        MergeTwo mergeTwo = new MergeTwo();
        Assertions.assertThat(mergeTwo.mergeTwo(new String[]{"a", "c", "z"}, new String[]{"b", "f", "z"}, 3)).isEqualTo(new String[]{"a", "b", "c"});
        Assertions.assertThat(mergeTwo.mergeTwo(new String[]{"a", "c", "z"}, new String[]{"c", "f", "z"}, 3)).isEqualTo(new String[]{"a", "c", "f"});
        Assertions.assertThat(mergeTwo.mergeTwo(new String[]{"f", "g", "z"}, new String[]{"c", "f", "g"}, 3)).isEqualTo(new String[]{"c", "f", "g"});
        Assertions.assertThat(mergeTwo.mergeTwo(new String[]{"a", "c", "z"}, new String[]{"a", "c", "z"}, 3)).isEqualTo(new String[]{"a", "c", "z"});
        Assertions.assertThat(mergeTwo.mergeTwo(new String[]{"a", "b", "c", "z"}, new String[]{"a", "c", "z"}, 3)).isEqualTo(new String[]{"a", "b", "c"});
        Assertions.assertThat(mergeTwo.mergeTwo(new String[]{"a", "c", "z"}, new String[]{"a", "b", "c", "z"}, 3)).isEqualTo(new String[]{"a", "b", "c"});
        Assertions.assertThat(mergeTwo.mergeTwo(new String[]{"a", "c", "z"}, new String[]{"a", "c", "z"}, 2)).isEqualTo(new String[]{"a", "c"});
        Assertions.assertThat(mergeTwo.mergeTwo(new String[]{"a", "c", "z"}, new String[]{"a", "c", "y", "z"}, 3)).isEqualTo(new String[]{"a", "c", "y"});
        Assertions.assertThat(mergeTwo.mergeTwo(new String[]{"x", "y", "z"}, new String[]{"a", "b", "z"}, 3)).isEqualTo(new String[]{"a", "b", "x"});
    }

}
