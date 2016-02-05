package com.harcyah.kata.misc.spreadsheet;

import junit.framework.TestCase;

public class SpreadsheetTest_Part5 extends TestCase {
	public void testDummy() {
	}
	/*
	 * private Sheet sheet;
	 * 
	 * protected void setUp() { sheet = new Sheet(); }
	 * 
	 * public void testThatCellCanReferenceOtherCells() { sheet.put("A1", "8");
	 * sheet.put("A2", "=A1"); assertEquals("8", sheet.get("A2")); }
	 * 
	 * public void testThatCellChangesPropagate() { Sheet sheet = new Sheet();
	 * sheet.put("A1", "8"); sheet.put("A2", "=A1"); sheet.put("A1", "9");
	 * assertEquals("9", sheet.get("A2")); }
	 * 
	 * public void testThatFormulasKnowCellsAndRecalculate() { Sheet sheet = new
	 * Sheet(); sheet.put("A1", "8"); sheet.put("A2", "3"); sheet.put("B1",
	 * "=A1*(A1-A2)+A2/3"); assertEquals("41", sheet.get("B1"));
	 * 
	 * sheet.put("A2", "6"); assertEquals("18", sheet.get("B1")); }
	 * 
	 * public void testThatDeepPropagationWorks() { Sheet sheet = new Sheet();
	 * sheet.put("A1", "8"); sheet.put("A2", "=A1"); sheet.put("A3", "=A2");
	 * sheet.put("A4", "=A3"); assertEquals("8", sheet.get("A4"));
	 * 
	 * sheet.put("A2", "6"); assertEquals("6", sheet.get("A4")); }
	 * 
	 * public void testThatFormulaWorksWithManyCells() { Sheet sheet = new
	 * Sheet(); sheet.put("A1", "10"); sheet.put("A2", "=A1+B1");
	 * sheet.put("A3", "=A2+B2"); sheet.put("A4", "=A3"); sheet.put("B1", "7");
	 * sheet.put("B2", "=A2"); sheet.put("B3", "=A3-A2"); sheet.put("B4",
	 * "=A4+B3");
	 * 
	 * assertEquals("34", sheet.get("A4")); assertEquals("51", sheet.get("B4"));
	 * }
	 * 
	 * public void testThatSpacesAreAllowedInFormulas() { Sheet sheet = new
	 * Sheet(); sheet.put("A1", "10"); sheet.put("B1", "7"); sheet.put("A2",
	 * "= A1 + B1"); sheet.put("A3", "= A2 + B1 * ( 3 + A1 )");
	 * 
	 * assertEquals("108", sheet.get("A3")); }
	 */

}
