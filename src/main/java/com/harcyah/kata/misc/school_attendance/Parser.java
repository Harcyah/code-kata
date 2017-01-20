package com.harcyah.kata.misc.school_attendance;

import java.io.IOException;
import java.text.ParseException;

public interface Parser {

    Student parse(String line) throws IOException, ParseException;

}
