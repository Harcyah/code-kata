package com.harcyah.kata.reddit.medium_2016_02_17;

import org.junit.Assert;
import org.junit.Test;

public class SiblingTest {

	@Test
	public void testTop() {
		Square firstLevelNeighbour = Sibling.TOP.getFirstLevelNeighbour(5, 5);
		Square secondLevelNeighbour = Sibling.TOP.getSecondLevelNeighbour(5, 5);
		Assert.assertEquals(5, firstLevelNeighbour.col);
		Assert.assertEquals(4, firstLevelNeighbour.row);
		Assert.assertEquals(5, secondLevelNeighbour.col);
		Assert.assertEquals(3, secondLevelNeighbour.row);
	}

	@Test
	public void testBottom() {
		Square firstLevelNeighbour = Sibling.BOTTOM.getFirstLevelNeighbour(5, 5);
		Square secondLevelNeighbour = Sibling.BOTTOM.getSecondLevelNeighbour(5, 5);
		Assert.assertEquals(5, firstLevelNeighbour.col);
		Assert.assertEquals(6, firstLevelNeighbour.row);
		Assert.assertEquals(5, secondLevelNeighbour.col);
		Assert.assertEquals(7, secondLevelNeighbour.row);
	}

	@Test
	public void testRight() {
		Square firstLevelNeighbour = Sibling.RIGHT.getFirstLevelNeighbour(5, 5);
		Square secondLevelNeighbour = Sibling.RIGHT.getSecondLevelNeighbour(5, 5);
		Assert.assertEquals(6, firstLevelNeighbour.col);
		Assert.assertEquals(5, firstLevelNeighbour.row);
		Assert.assertEquals(7, secondLevelNeighbour.col);
		Assert.assertEquals(5, secondLevelNeighbour.row);
	}

	@Test
	public void testLeft() {
		Square firstLevelNeighbour = Sibling.LEFT.getFirstLevelNeighbour(5, 5);
		Square secondLevelNeighbour = Sibling.LEFT.getSecondLevelNeighbour(5, 5);
		Assert.assertEquals(4, firstLevelNeighbour.col);
		Assert.assertEquals(5, firstLevelNeighbour.row);
		Assert.assertEquals(3, secondLevelNeighbour.col);
		Assert.assertEquals(5, secondLevelNeighbour.row);
	}

	@Test
	public void testTopRight() {
		Square firstLevelNeighbour = Sibling.TOP_RIGHT.getFirstLevelNeighbour(5, 5);
		Square secondLevelNeighbour = Sibling.TOP_RIGHT.getSecondLevelNeighbour(5, 5);
		Assert.assertEquals(6, firstLevelNeighbour.col);
		Assert.assertEquals(4, firstLevelNeighbour.row);
		Assert.assertEquals(7, secondLevelNeighbour.col);
		Assert.assertEquals(3, secondLevelNeighbour.row);
	}

	@Test
	public void testBottomRight() {
		Square firstLevelNeighbour = Sibling.BOTTOM_RIGHT.getFirstLevelNeighbour(5, 5);
		Square secondLevelNeighbour = Sibling.BOTTOM_RIGHT.getSecondLevelNeighbour(5, 5);
		Assert.assertEquals(6, firstLevelNeighbour.col);
		Assert.assertEquals(6, firstLevelNeighbour.row);
		Assert.assertEquals(7, secondLevelNeighbour.col);
		Assert.assertEquals(7, secondLevelNeighbour.row);
	}

	@Test
	public void testBottomLeft() {
		Square firstLevelNeighbour = Sibling.BOTTOM_LEFT.getFirstLevelNeighbour(5, 5);
		Square secondLevelNeighbour = Sibling.BOTTOM_LEFT.getSecondLevelNeighbour(5, 5);
		Assert.assertEquals(4, firstLevelNeighbour.col);
		Assert.assertEquals(6, firstLevelNeighbour.row);
		Assert.assertEquals(3, secondLevelNeighbour.col);
		Assert.assertEquals(7, secondLevelNeighbour.row);
	}

	@Test
	public void testTopLeft() {
		Square firstLevelNeighbour = Sibling.TOP_LEFT.getFirstLevelNeighbour(5, 5);
		Square secondLevelNeighbour = Sibling.TOP_LEFT.getSecondLevelNeighbour(5, 5);
		Assert.assertEquals(4, firstLevelNeighbour.col);
		Assert.assertEquals(4, firstLevelNeighbour.row);
		Assert.assertEquals(3, secondLevelNeighbour.col);
		Assert.assertEquals(3, secondLevelNeighbour.row);
	}

}
