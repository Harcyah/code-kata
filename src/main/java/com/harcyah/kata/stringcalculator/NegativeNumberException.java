package com.harcyah.kata.stringcalculator;

import java.util.List;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

public class NegativeNumberException extends Exception {

	private static final long serialVersionUID = 4355135540418785206L;

	protected List<String> numbers = Lists.newArrayList();

	public NegativeNumberException(List<String> errors) {
		this.numbers = errors;
	}

	@Override
	public String getMessage() {
		return "Unable to handle negative numbers: " + Joiner.on(",").join(numbers);
	}

}
