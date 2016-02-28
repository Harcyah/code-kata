package com.harcyah.kata.codingbat.ap1.userCompare;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class UserCompareTest {

	@Test
	public void testUserCompare() {
		UserCompare userCompare = new UserCompare();
		Assertions.assertThat(userCompare.userCompare("bb", 1, "zz", 2)).isEqualTo(-1);
		Assertions.assertThat(userCompare.userCompare("bb", 1, "aa", 2)).isEqualTo(1);
		Assertions.assertThat(userCompare.userCompare("bb", 1, "bb", 1)).isEqualTo(0);
		Assertions.assertThat(userCompare.userCompare("bb", 5, "bb", 1)).isEqualTo(1);
		Assertions.assertThat(userCompare.userCompare("bb", 5, "bb", 10)).isEqualTo(-1);
		Assertions.assertThat(userCompare.userCompare("adam", 1, "bob", 2)).isEqualTo(-1);
		Assertions.assertThat(userCompare.userCompare("bob", 1, "bob", 2)).isEqualTo(-1);
		Assertions.assertThat(userCompare.userCompare("bzb", 1, "bob", 2)).isEqualTo(1);
	}

}
