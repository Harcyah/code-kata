package com.harcyah.kata.codingbat.recursion1.nestParen;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NestParenTest {

    @Test
    public void testNestParen() {
        NestParen nestParen = new NestParen();
        assertThat(nestParen.nestParen("(())")).isTrue();
        assertThat(nestParen.nestParen("((()))")).isTrue();
        assertThat(nestParen.nestParen("(((x))")).isFalse();
        assertThat(nestParen.nestParen("((())")).isFalse();
        assertThat(nestParen.nestParen("((()()")).isFalse();
        assertThat(nestParen.nestParen("()")).isTrue();
        assertThat(nestParen.nestParen("")).isTrue();
        assertThat(nestParen.nestParen("(yy)")).isFalse();
        assertThat(nestParen.nestParen("(())")).isTrue();
        assertThat(nestParen.nestParen("(((y))")).isFalse();
        assertThat(nestParen.nestParen("((y)))")).isFalse();
        assertThat(nestParen.nestParen("((()))")).isTrue();
        assertThat(nestParen.nestParen("(())))")).isFalse();
        assertThat(nestParen.nestParen("((yy())))")).isFalse();
        assertThat(nestParen.nestParen("(((())))")).isTrue();
    }

}
