package com.harcyah.kata.codingbat.map2.firstSwap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstSwapTest {

    @Test
    public void testFirstSwap() {
        FirstSwap firstSwap = new FirstSwap();
        assertThat(firstSwap.firstSwap(new String[] { "ab", "ac" }))
            .isEqualTo(new String[] { "ac", "ab" });
        assertThat(firstSwap.firstSwap(new String[] { "ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz" }))
            .isEqualTo(new String[] { "ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz" });
        assertThat(firstSwap.firstSwap(new String[] { "ax", "bx", "ay", "by", "ai", "aj", "bx", "by" }))
            .isEqualTo(new String[] { "ay", "by", "ax", "bx", "ai", "aj", "bx", "by" });
        assertThat(firstSwap.firstSwap(new String[] { "ax", "bx", "cx", "ay", "cy", "aaa", "abb" }))
            .isEqualTo(new String[] { "ay", "bx", "cy", "ax", "cx", "aaa", "abb" });
        assertThat(firstSwap.firstSwap(new String[] { "easy", "does", "it", "every", "ice", "eaten" }))
            .isEqualTo(new String[] { "every", "does", "ice", "easy", "it", "eaten" });
        assertThat(firstSwap.firstSwap(new String[] { "list", "of", "words", "swims", "over", "lily", "water", "wait" }))
            .isEqualTo(new String[] { "lily", "over", "water", "swims", "of", "list", "words", "wait" });
        assertThat(firstSwap.firstSwap(new String[] { "4", "8", "15", "16", "23", "42" }))
            .isEqualTo(new String[] { "42", "8", "16", "15", "23", "4" });
        assertThat(firstSwap.firstSwap(new String[] { "aaa" }))
            .isEqualTo(new String[] { "aaa" });
        assertThat(firstSwap.firstSwap(new String[] {}))
            .isEqualTo(new String[] {});
        assertThat(firstSwap.firstSwap(new String[] { "a", "b", "c", "xx", "yy", "zz" }))
            .isEqualTo(new String[] { "a", "b", "c", "xx", "yy", "zz" });
    }

}
