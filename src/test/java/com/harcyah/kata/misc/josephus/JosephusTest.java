package com.harcyah.kata.misc.josephus;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class JosephusTest {

	@Test
	public void testWith5PeopleAndStep3() {
		Assertions.assertThat(Josephus.getKeepAlivePositionFor(5, 3)).isEqualTo(3);
	}

	@Test
	public void testWith10PeopleAndStep4() {
		Assertions.assertThat(Josephus.getKeepAlivePositionFor(10, 4)).isEqualTo(4);
	}

	@Test
	public void testWith100PeopleAndStep2() {
		Assertions.assertThat(Josephus.getKeepAlivePositionFor(100, 2)).isEqualTo(72);
	}

}
