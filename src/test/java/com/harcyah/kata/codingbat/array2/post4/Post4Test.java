package com.harcyah.kata.codingbat.array2.post4;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Post4Test {

    @Test
    public void testPost4() {
        Post4 post4 = new Post4();
        assertThat(post4.post4(new int[]{2, 4, 1, 2})).isEqualTo(new int[]{1, 2});
        assertThat(post4.post4(new int[]{4, 1, 4, 2})).isEqualTo(new int[]{2});
        assertThat(post4.post4(new int[]{4, 4, 1, 2, 3})).isEqualTo(new int[]{1, 2, 3});
        assertThat(post4.post4(new int[]{4, 2})).isEqualTo(new int[]{2});
        assertThat(post4.post4(new int[]{4, 4, 3})).isEqualTo(new int[]{3});
        assertThat(post4.post4(new int[]{4, 4})).isEqualTo(new int[]{});
        assertThat(post4.post4(new int[]{4})).isEqualTo(new int[]{});
        assertThat(post4.post4(new int[]{2, 4, 1, 4, 3, 2})).isEqualTo(new int[]{3, 2});
        assertThat(post4.post4(new int[]{4, 1, 4, 2, 2, 2})).isEqualTo(new int[]{2, 2, 2});
        assertThat(post4.post4(new int[]{3, 4, 3, 2})).isEqualTo(new int[]{3, 2});
    }

}
