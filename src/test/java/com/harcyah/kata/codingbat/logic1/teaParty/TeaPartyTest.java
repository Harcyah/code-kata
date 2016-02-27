package com.harcyah.kata.codingbat.logic1.teaParty;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TeaPartyTest {

	@Test
	public void testTeaParty() {
		TeaParty teaParty = new TeaParty();
		Assertions.assertThat(teaParty.teaParty(6, 8)).isEqualTo(1);
		Assertions.assertThat(teaParty.teaParty(3, 8)).isEqualTo(0);
		Assertions.assertThat(teaParty.teaParty(20, 6)).isEqualTo(2);
		Assertions.assertThat(teaParty.teaParty(12, 6)).isEqualTo(2);
		Assertions.assertThat(teaParty.teaParty(11, 6)).isEqualTo(1);
		Assertions.assertThat(teaParty.teaParty(11, 4)).isEqualTo(0);
		Assertions.assertThat(teaParty.teaParty(4, 5)).isEqualTo(0);
		Assertions.assertThat(teaParty.teaParty(5, 5)).isEqualTo(1);
		Assertions.assertThat(teaParty.teaParty(6, 6)).isEqualTo(1);
		Assertions.assertThat(teaParty.teaParty(5, 10)).isEqualTo(2);
		Assertions.assertThat(teaParty.teaParty(5, 9)).isEqualTo(1);
		Assertions.assertThat(teaParty.teaParty(10, 4)).isEqualTo(0);
		Assertions.assertThat(teaParty.teaParty(10, 20)).isEqualTo(2);
	}

}
