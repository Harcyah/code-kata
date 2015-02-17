package com.harcyah.kata.codingbat.logic1.cigarParty;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTest {

	@Test
	public void testCigarParty() {
		CigarParty cigarParty = new CigarParty();
		Assert.assertEquals(false, cigarParty.cigarParty(30, false));
		Assert.assertEquals(true, cigarParty.cigarParty(50, false));
		Assert.assertEquals(true, cigarParty.cigarParty(70, true));
		Assert.assertEquals(false, cigarParty.cigarParty(30, true));
		Assert.assertEquals(true, cigarParty.cigarParty(50, true));
		Assert.assertEquals(true, cigarParty.cigarParty(60, false));
		Assert.assertEquals(false, cigarParty.cigarParty(61, false));
		Assert.assertEquals(true, cigarParty.cigarParty(40, false));
		Assert.assertEquals(false, cigarParty.cigarParty(39, false));
		Assert.assertEquals(true, cigarParty.cigarParty(40, true));
		Assert.assertEquals(false, cigarParty.cigarParty(39, true));
	}

}
