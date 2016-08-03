package com.harcyah.kata.exercism.allergies;

import java.util.ArrayList;
import java.util.List;

public class Allergies {

	private int score;

	public Allergies(int score) {
		this.score = score;
	}

	public boolean isAllergicTo(Allergen allergen) {
		return ((score & (allergen.getScore())) != 0);
	}

	public List<Allergen> getList() {
		List<Allergen> allergens = new ArrayList<>();
		for (Allergen allergen : Allergen.values()) {
			if (isAllergicTo(allergen)) {
				allergens.add(allergen);
			}
		}
		return allergens;
	}

}