package com.harcyah.kata.reddit.hard_2016_02_13;

import org.junit.Test;

public class InterpretorTest {

	@Test
	public void testRedditInputOne() {
		Terminal terminal = new Terminal();
		Interpretor interpretor = new Interpretor();
		String input = "^h^c^i" +
			"DDD^r^rPPPP^d^b" +
			"D^r^rD^rP^19P^d^b" +
			"D^r^rD^rPPPP^d^b" +
			"D^r^rD^rP^d^b" +
			"DDD^r^rP";
		interpretor.process(terminal, input);
	}

	@Test
	public void testRedditInputTwo() {
		Terminal terminal = new Terminal();
		Interpretor interpretor = new Interpretor();
		String input = "^h^c^i" +
			"^04^^" +
			"^13/ \\^d^b  /   \\" +
			"^u^d^d^l^l^l^l^l^l^l^l^l" +
			"^r^r^l^l^d<^49>^l^l^d/^b \\" +
			"^d^r^r^66/^b  \\" +
			"^b^d   \\ /" +
			"^d^l^lv^d^b===========^i^94O123456" +
			"789^94A=======^u^u^u^u^u^u^l^l\\^o^b^r/";
		interpretor.process(terminal, input);
	}

}
