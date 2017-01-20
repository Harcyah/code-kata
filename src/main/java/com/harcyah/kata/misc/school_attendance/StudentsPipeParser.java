package com.harcyah.kata.misc.school_attendance;

import org.apache.commons.lang3.StringUtils;

import java.awt.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StudentsPipeParser implements Parser {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("d-MM-yyyy");

    @Override
    public Student parse(String line) throws IOException, ParseException {
        String[] tokens = StringUtils.split(line, " | ");
        return new Student(
                tokens[1],
                tokens[2],
                tokens[0],
                Gender.from(tokens[3]),
                Color.getColor(tokens[4]),
                dateFormat.parse(tokens[5]));
    }
}
