package com.harcyah.kata.codingbat.string1.makeOutWord;

import org.junit.Assert;
import org.junit.Test;

public class MakeOutWordTest {

	@Test
	public void testMakeOutWord() {
		MakeOutWord makeOutWord = new MakeOutWord();
		Assert.assertEquals("<<Yay>>", makeOutWord.makeOutWord("<<>>", "Yay"));
		Assert.assertEquals("<<WooHoo>>", makeOutWord.makeOutWord("<<>>", "WooHoo"));
		Assert.assertEquals("[[word]]", makeOutWord.makeOutWord("[[]]", "word"));
		Assert.assertEquals("HHHellooo", makeOutWord.makeOutWord("HHoo", "Hello"));
		Assert.assertEquals("abYAYyz", makeOutWord.makeOutWord("abyz", "YAY"));
	}

}
