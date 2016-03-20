package com.harcyah.kata.codingbat.recursion1.nestParen;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class NestParenTest {

	@Test
	public void testNestParen() {
		NestParen nestParen = new NestParen();
		Assertions.assertThat(nestParen.nestParen("(())")).isEqualTo(true);
		Assertions.assertThat(nestParen.nestParen("((()))")).isEqualTo(true);
		Assertions.assertThat(nestParen.nestParen("(((x))")).isEqualTo(false);
		Assertions.assertThat(nestParen.nestParen("((())")).isEqualTo(false);
		Assertions.assertThat(nestParen.nestParen("((()()")).isEqualTo(false);
		Assertions.assertThat(nestParen.nestParen("()")).isEqualTo(true);
		Assertions.assertThat(nestParen.nestParen("")).isEqualTo(true);
		Assertions.assertThat(nestParen.nestParen("(yy)")).isEqualTo(false);
		Assertions.assertThat(nestParen.nestParen("(())")).isEqualTo(true);
		Assertions.assertThat(nestParen.nestParen("(((y))")).isEqualTo(false);
		Assertions.assertThat(nestParen.nestParen("((y)))")).isEqualTo(false);
		Assertions.assertThat(nestParen.nestParen("((()))")).isEqualTo(true);
		Assertions.assertThat(nestParen.nestParen("(())))")).isEqualTo(false);
		Assertions.assertThat(nestParen.nestParen("((yy())))")).isEqualTo(false);
		Assertions.assertThat(nestParen.nestParen("(((())))")).isEqualTo(true);
	}

}
