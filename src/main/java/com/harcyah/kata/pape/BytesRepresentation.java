package com.harcyah.kata.pape;

// http://www.home.hs-karlsruhe.de/~pach0003/informatik_1/aufgaben/en/flowcontrol.html#metric_bytes
public class BytesRepresentation {

	public enum Unit {
		Byte(0),
		KByte(3),
		MByte(6),
		GByte(9);

		protected int ratio;
		protected int max;

		private Unit(int ratio) {
			this.ratio = ratio;
			this.max = (int) Math.pow(10, ratio + 3);
		}

	}

	public String toBytesString(Unit unit, long value) {
		return (value / Math.pow(10, unit.ratio)) + " " + unit.name();
	}

	public String toBytesString(long value) {
		if (value < Unit.Byte.max) {
			return toBytesString(Unit.Byte, value);
		} else if (value < Unit.KByte.max) {
			return toBytesString(Unit.KByte, value);
		} else if (value < Unit.MByte.max) {
			return toBytesString(Unit.MByte, value);
		} else {
			return toBytesString(Unit.GByte, value);
		}
	}

}
