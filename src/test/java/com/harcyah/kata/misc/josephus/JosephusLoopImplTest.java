package com.harcyah.kata.misc.josephus;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class JosephusLoopImplTest {

	protected JosephusLoopImpl josephus = new JosephusLoopImpl();

	@Test
	public void testWith5PeopleAndStep3() {
		Assertions.assertThat(josephus.getLastManStanding(5, 3)).isEqualTo(3);
	}

	@Test
	public void testWith10PeopleAndStep4() {
		Assertions.assertThat(josephus.getLastManStanding(10, 4)).isEqualTo(4);
	}

	@Test
	public void testWith100PeopleAndStep2() {
		Assertions.assertThat(josephus.getLastManStanding(100, 2)).isEqualTo(72);
	}

}
