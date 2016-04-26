package com.harcyah.kata.reddit.medium_2016_02_17;

import org.junit.Assert;
import org.junit.Test;

public class SiblingTest {

	@Test
	public void testTop() {
		Square firstLevelNeighbour = Sibling.TOP.getNeighbour(5, 5, 1);
		Square secondLevelNeighbour = Sibling.TOP.getNeighbour(5, 5, 2);
		Assert.assertEquals(5, firstLevelNeighbour.col);
		Assert.assertEquals(4, firstLevelNeighbour.row);
		Assert.assertEquals(5, secondLevelNeighbour.col);
		Assert.assertEquals(3, secondLevelNeighbour.row);
	}

	@Test
	public void testBottom() {
		Square firstLevelNeighbour = Sibling.BOTTOM.getNeighbour(5, 5, 1);
		Square secondLevelNeighbour = Sibling.BOTTOM.getNeighbour(5, 5, 2);
		Assert.assertEquals(5, firstLevelNeighbour.col);
		Assert.assertEquals(6, firstLevelNeighbour.row);
		Assert.assertEquals(5, secondLevelNeighbour.col);
		Assert.assertEquals(7, secondLevelNeighbour.row);
	}

	@Test
	public void testRight() {
		Square firstLevelNeighbour = Sibling.RIGHT.getNeighbour(5, 5, 1);
		Square secondLevelNeighbour = Sibling.RIGHT.getNeighbour(5, 5, 2);
		Assert.assertEquals(6, firstLevelNeighbour.col);
		Assert.assertEquals(5, firstLevelNeighbour.row);
		Assert.assertEquals(7, secondLevelNeighbour.col);
		Assert.assertEquals(5, secondLevelNeighbour.row);
	}

	@Test
	public void testLeft() {
		Square firstLevelNeighbour = Sibling.LEFT.getNeighbour(5, 5, 1);
		Square secondLevelNeighbour = Sibling.LEFT.getNeighbour(5, 5, 2);
		Assert.assertEquals(4, firstLevelNeighbour.col);
		Assert.assertEquals(5, firstLevelNeighbour.row);
		Assert.assertEquals(3, secondLevelNeighbour.col);
		Assert.assertEquals(5, secondLevelNeighbour.row);
	}

	@Test
	public void testTopRight() {
		Square firstLevelNeighbour = Sibling.TOP_RIGHT.getNeighbour(5, 5, 1);
		Square secondLevelNeighbour = Sibling.TOP_RIGHT.getNeighbour(5, 5, 2);
		Assert.assertEquals(6, firstLevelNeighbour.col);
		Assert.assertEquals(4, firstLevelNeighbour.row);
		Assert.assertEquals(7, secondLevelNeighbour.col);
		Assert.assertEquals(3, secondLevelNeighbour.row);
	}

	@Test
	public void testBottomRight() {
		Square firstLevelNeighbour = Sibling.BOTTOM_RIGHT.getNeighbour(5, 5, 1);
		Square secondLevelNeighbour = Sibling.BOTTOM_RIGHT.getNeighbour(5, 5, 2);
		Assert.assertEquals(6, firstLevelNeighbour.col);
		Assert.assertEquals(6, firstLevelNeighbour.row);
		Assert.assertEquals(7, secondLevelNeighbour.col);
		Assert.assertEquals(7, secondLevelNeighbour.row);
	}

	@Test
	public void testBottomLeft() {
		Square firstLevelNeighbour = Sibling.BOTTOM_LEFT.getNeighbour(5, 5, 1);
		Square secondLevelNeighbour = Sibling.BOTTOM_LEFT.getNeighbour(5, 5, 2);
		Assert.assertEquals(4, firstLevelNeighbour.col);
		Assert.assertEquals(6, firstLevelNeighbour.row);
		Assert.assertEquals(3, secondLevelNeighbour.col);
		Assert.assertEquals(7, secondLevelNeighbour.row);
	}

	@Test
	public void testTopLeft() {
		Square firstLevelNeighbour = Sibling.TOP_LEFT.getNeighbour(5, 5, 1);
		Square secondLevelNeighbour = Sibling.TOP_LEFT.getNeighbour(5, 5, 2);
		Assert.assertEquals(4, firstLevelNeighbour.col);
		Assert.assertEquals(4, firstLevelNeighbour.row);
		Assert.assertEquals(3, secondLevelNeighbour.col);
		Assert.assertEquals(3, secondLevelNeighbour.row);
	}

}
