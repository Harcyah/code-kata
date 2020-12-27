package com.harcyah.kata.misc.school_attendance;

import org.apache.commons.lang3.StringUtils;

import java.awt.Color;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StudentsCommaParser implements Parser {

    private static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/dd/yyyy");

    @Override
    public Student parse(String line) throws ParseException {
        String[] tokens = StringUtils.split(line, ", ");
        return new Student(
            tokens[1],
            "",
            tokens[0],
            Gender.from(tokens[2]),
            Color.getColor(tokens[3]),
            LocalDate.parse(tokens[4], dateFormat)
        );
    }

}
