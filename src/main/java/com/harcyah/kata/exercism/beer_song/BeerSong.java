package com.harcyah.kata.exercism.beer_song;

public class BeerSong {

	public static String sing(int start, int end) {
		StringBuffer v = new StringBuffer();
		for (int i=start; i>=end; i--) {
			v.append(verse(i));
		}
		return v.toString();
	}

	public static String singSong() {
		return sing(99, 0);
	}

	public static String verse(int beers) {
		StringBuffer v = new StringBuffer();
		v.append(verseLine1(beers));
		v.append('\n');
		v.append(verseLine2(beers - 1));
		v.append('\n');
		v.append('\n');
		return v.toString();
	}

	protected static String verseLine1(int beers) {
		if (beers == 0) {
			return "No more bottles of beer on the wall, no more bottles of beer.";
		}

		StringBuffer v = new StringBuffer();
		v.append(getBottlesLiteral(beers));
		v.append(" of beer on the wall, ");
		v.append(getBottlesLiteral(beers));
		v.append(" of beer.");
		return v.toString();
	}

	protected static String verseLine2(int beers) {
		if (beers == -1) {
			return "Go to the store and buy some more, 99 bottles of beer on the wall.";
		}
		if (beers == 0) {
			return "Take it down and pass it around, no more bottles of beer on the wall.";
		}

		StringBuffer v = new StringBuffer();
		v.append("Take one down and pass it around, ");
		v.append(getBottlesLiteral(beers));
		v.append(" of beer on the wall.");
		return v.toString();
	}

	protected static String getBottlesLiteral(int bottles) {
		return bottles + " " + (bottles <= 1 ? "bottle" : "bottles");
	}

}