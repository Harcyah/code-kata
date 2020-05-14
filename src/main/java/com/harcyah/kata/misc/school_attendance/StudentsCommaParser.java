package com.harcyah.kata.misc.school_attendance;

import org.apache.commons.lang3.StringUtils;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StudentsCommaParser implements Parser {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("d/MM/yyyy");

    @Override
    public Student parse(String line) throws ParseException {
        String[] tokens = StringUtils.split(line, ", ");
        return new Student(
            tokens[1],
            "",
            tokens[0],
            Gender.from(tokens[2]),
            Color.getColor(tokens[3]),
            dateFormat.parse(tokens[4]));
    }

}
