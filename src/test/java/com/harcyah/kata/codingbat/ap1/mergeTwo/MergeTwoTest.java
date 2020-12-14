package com.harcyah.kata.codingbat.ap1.mergeTwo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MergeTwoTest {

    @Test
    public void testMergeTwo() {
        MergeTwo mergeTwo = new MergeTwo();
        assertThat(mergeTwo.mergeTwo(new String[]{"a", "c", "z"}, new String[]{"b", "f", "z"}, 3)).isEqualTo(new String[]{"a", "b", "c"});
        assertThat(mergeTwo.mergeTwo(new String[]{"a", "c", "z"}, new String[]{"c", "f", "z"}, 3)).isEqualTo(new String[]{"a", "c", "f"});
        assertThat(mergeTwo.mergeTwo(new String[]{"f", "g", "z"}, new String[]{"c", "f", "g"}, 3)).isEqualTo(new String[]{"c", "f", "g"});
        assertThat(mergeTwo.mergeTwo(new String[]{"a", "c", "z"}, new String[]{"a", "c", "z"}, 3)).isEqualTo(new String[]{"a", "c", "z"});
        assertThat(mergeTwo.mergeTwo(new String[]{"a", "b", "c", "z"}, new String[]{"a", "c", "z"}, 3)).isEqualTo(new String[]{"a", "b", "c"});
        assertThat(mergeTwo.mergeTwo(new String[]{"a", "c", "z"}, new String[]{"a", "b", "c", "z"}, 3)).isEqualTo(new String[]{"a", "b", "c"});
        assertThat(mergeTwo.mergeTwo(new String[]{"a", "c", "z"}, new String[]{"a", "c", "z"}, 2)).isEqualTo(new String[]{"a", "c"});
        assertThat(mergeTwo.mergeTwo(new String[]{"a", "c", "z"}, new String[]{"a", "c", "y", "z"}, 3)).isEqualTo(new String[]{"a", "c", "y"});
        assertThat(mergeTwo.mergeTwo(new String[]{"x", "y", "z"}, new String[]{"a", "b", "z"}, 3)).isEqualTo(new String[]{"a", "b", "x"});
    }

}
