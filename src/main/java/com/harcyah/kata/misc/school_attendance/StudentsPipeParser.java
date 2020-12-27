package com.harcyah.kata.misc.school_attendance;

import org.apache.commons.lang3.StringUtils;

import java.awt.Color;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StudentsPipeParser implements Parser {

    private static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M-d-yyyy");

    @Override
    public Student parse(String line) throws ParseException {
        String[] tokens = StringUtils.split(line, " | ");
        return new Student(
            tokens[1],
            tokens[2],
            tokens[0],
            Gender.from(tokens[3]),
            Color.getColor(tokens[4]),
            LocalDate.parse(tokens[5], dateFormat)
        );
    }

}
