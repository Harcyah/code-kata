package com.harcyah.kata.codingbat.recursion1.strCopies;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class StrCopiesTest {

	@Test
	public void testStrCopies() {
		StrCopies strCopies = new StrCopies();
		Assertions.assertThat(strCopies.strCopies("catcowcat", "cat", 2)).isEqualTo(true);
		Assertions.assertThat(strCopies.strCopies("catcowcat", "cow", 2)).isEqualTo(false);
		Assertions.assertThat(strCopies.strCopies("catcowcat", "cow", 1)).isEqualTo(true);
		Assertions.assertThat(strCopies.strCopies("iiijjj", "i", 3)).isEqualTo(true);
		Assertions.assertThat(strCopies.strCopies("iiijjj", "i", 4)).isEqualTo(false);
		Assertions.assertThat(strCopies.strCopies("iiijjj", "ii", 2)).isEqualTo(true);
		Assertions.assertThat(strCopies.strCopies("iiijjj", "ii", 3)).isEqualTo(false);
		Assertions.assertThat(strCopies.strCopies("iiijjj", "x", 3)).isEqualTo(false);
		Assertions.assertThat(strCopies.strCopies("iiijjj", "x", 0)).isEqualTo(true);
		Assertions.assertThat(strCopies.strCopies("iiiiij", "iii", 3)).isEqualTo(true);
		Assertions.assertThat(strCopies.strCopies("iiiiij", "iii", 4)).isEqualTo(false);
		Assertions.assertThat(strCopies.strCopies("ijiiiiij", "iiii", 2)).isEqualTo(true);
		Assertions.assertThat(strCopies.strCopies("ijiiiiij", "iiii", 3)).isEqualTo(false);
		Assertions.assertThat(strCopies.strCopies("dogcatdogcat", "dog", 2)).isEqualTo(true);
	}

}
