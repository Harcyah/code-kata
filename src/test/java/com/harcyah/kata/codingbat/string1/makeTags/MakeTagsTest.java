package com.harcyah.kata.codingbat.string1.makeTags;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeTagsTest {

    @Test
    public void testMakeTags() {
        MakeTags makeTags = new MakeTags();
        assertEquals("<i>Yay</i>", makeTags.makeTags("i", "Yay"));
        assertEquals("<i>Hello</i>", makeTags.makeTags("i", "Hello"));
        assertEquals("<cite>Yay</cite>", makeTags.makeTags("cite", "Yay"));
        assertEquals("<address>here</address>", makeTags.makeTags("address", "here"));
        assertEquals("<body>Heart</body>", makeTags.makeTags("body", "Heart"));
        assertEquals("<i>i</i>", makeTags.makeTags("i", "i"));
        assertEquals("<i></i>", makeTags.makeTags("i", ""));
    }

}
