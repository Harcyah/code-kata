package com.harcyah.kata.projecteuler;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.io.Resources;

public class Problem_022Test {

	@Test
	public void testGetValueOf() throws Exception {
		Problem_022 problem_022 = new Problem_022();
		Assert.assertEquals(1, problem_022.getValueOf("A"));
		Assert.assertEquals(10, problem_022.getValueOf("ABCD"));
	}

	@Test
	public void testGetNamesScoreEasyCase() throws Exception {
		Problem_022 problem_022 = new Problem_022();
		Assert.assertEquals(30, problem_022.getNamesScores(ImmutableList.of("ABCD", "ABCD")));
	}

	@Test
	public void testGetNamesScoreHardCase() throws Exception {
		Problem_022 problem_022 = new Problem_022();
		String resource = Resources.toString(Resources.getResource("projecteuler_022.txt"), StandardCharsets.UTF_8);
		String[] tokens = resource.split(",");
		List<String> names = Lists.newArrayList();
		for (String token : tokens) {
			names.add(token.substring(1, token.length() - 1));
		}
		Collections.sort(names);
		Assert.assertEquals(30, problem_022.getNamesScores(names));
	}

}
