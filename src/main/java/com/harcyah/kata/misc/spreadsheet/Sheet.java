package com.harcyah.kata.misc.spreadsheet;

import java.util.Map;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import com.google.common.collect.Maps;

public class Sheet {

	private static final String DEFAULT_CELL_VALUE = "";
	private static final String FUNCTION_PREFIX = "=";
	private static final ScriptEngineManager manager = new ScriptEngineManager();
	private static final ScriptEngine engine = manager.getEngineByName("js");

	protected Map<String, String> cells = Maps.newHashMap();

	public String get(String cell) {
		String literal = getLiteral(cell);

		// Handle function
		if (literal.startsWith(FUNCTION_PREFIX)) {
			return handleFunction(literal);
		}

		// Handle literals
		String trimmed = StringUtils.trim(literal);
		return StringUtils.isNumeric(trimmed) ? trimmed : literal;
	}

	private String handleFunction(String literal) throws CellFormulaException {
		try {
			String formula = StringUtils.substringAfter(literal, FUNCTION_PREFIX);
			String result = engine.eval(formula).toString();
			if (result.endsWith(".0")) {
				return StringUtils.substringBefore(result, ".0");
			} else {
				return result;
			}
		} catch (ScriptException e) {
			throw new CellFormulaException();
		}
	}

	public String getLiteral(String cell) {
		return ObjectUtils.defaultIfNull(cells.get(cell), DEFAULT_CELL_VALUE);
	}

	public void put(String cell, String value) {
		cells.put(cell, value);
	}

}
