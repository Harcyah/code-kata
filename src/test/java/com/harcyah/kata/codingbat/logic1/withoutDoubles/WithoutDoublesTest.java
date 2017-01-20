package com.harcyah.kata.codingbat.logic1.withoutDoubles;

import org.junit.Assert;
import org.junit.Test;

public class WithoutDoublesTest {

    @Test
    public void testWithoutDoubles() {
        WithoutDoubles withoutDoubles = new WithoutDoubles();
        Assert.assertEquals(5, withoutDoubles.withoutDoubles(2, 3, true));
        Assert.assertEquals(7, withoutDoubles.withoutDoubles(3, 3, true));
        Assert.assertEquals(6, withoutDoubles.withoutDoubles(3, 3, false));
        Assert.assertEquals(5, withoutDoubles.withoutDoubles(2, 3, false));
        Assert.assertEquals(9, withoutDoubles.withoutDoubles(5, 4, true));
        Assert.assertEquals(9, withoutDoubles.withoutDoubles(5, 4, false));
        Assert.assertEquals(11, withoutDoubles.withoutDoubles(5, 5, true));
        Assert.assertEquals(10, withoutDoubles.withoutDoubles(5, 5, false));
        Assert.assertEquals(7, withoutDoubles.withoutDoubles(6, 6, true));
        Assert.assertEquals(12, withoutDoubles.withoutDoubles(6, 6, false));
        Assert.assertEquals(7, withoutDoubles.withoutDoubles(1, 6, true));
        Assert.assertEquals(7, withoutDoubles.withoutDoubles(6, 1, false));
    }

}
