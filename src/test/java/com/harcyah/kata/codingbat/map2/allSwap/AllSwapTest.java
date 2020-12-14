package com.harcyah.kata.codingbat.map2.allSwap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AllSwapTest {

    @Test
    public void testAllSwap() {
        AllSwap allSwap = new AllSwap();
        assertThat(allSwap.allSwap(new String[] { "ab", "ac" }))
            .isEqualTo(new String[] { "ac", "ab" });
        assertThat(allSwap.allSwap(new String[] { "ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz" }))
            .isEqualTo(new String[] { "ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa" });
        assertThat(allSwap.allSwap(new String[] { "ax", "bx", "ay", "by", "ai", "aj", "bx", "by" }))
            .isEqualTo(new String[] { "ay", "by", "ax", "bx", "aj", "ai", "by", "bx" });
        assertThat(allSwap.allSwap(new String[] { "ax", "bx", "cx", "ay", "cy", "aaa", "abb" }))
            .isEqualTo(new String[] { "ay", "bx", "cy", "ax", "cx", "abb", "aaa" });
        assertThat(allSwap.allSwap(new String[] { "easy", "does", "it", "every", "ice", "eaten" }))
            .isEqualTo(new String[] { "every", "does", "ice", "easy", "it", "eaten" });
        assertThat(allSwap.allSwap(new String[] { "list", "of", "words", "swims", "over", "lily", "water", "wait" }))
            .isEqualTo(new String[] { "lily", "over", "water", "swims", "of", "list", "words", "wait" });
        assertThat(allSwap.allSwap(new String[] { "4", "8", "15", "16", "23", "42" }))
            .isEqualTo(new String[] { "42", "8", "16", "15", "23", "4" });
        assertThat(allSwap.allSwap(new String[] { "aaa" }))
            .isEqualTo(new String[] { "aaa" });
        assertThat(allSwap.allSwap(new String[] {}))
            .isEqualTo(new String[] {});
        assertThat(allSwap.allSwap(new String[] { "a", "b", "c", "xx", "yy", "zz" }))
            .isEqualTo(new String[] { "a", "b", "c", "xx", "yy", "zz" });
    }

}
