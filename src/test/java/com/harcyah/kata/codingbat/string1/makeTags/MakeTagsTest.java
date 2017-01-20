package com.harcyah.kata.codingbat.string1.makeTags;

import org.junit.Assert;
import org.junit.Test;

public class MakeTagsTest {

    @Test
    public void testMakeTags() {
        MakeTags makeTags = new MakeTags();
        Assert.assertEquals("<i>Yay</i>", makeTags.makeTags("i", "Yay"));
        Assert.assertEquals("<i>Hello</i>", makeTags.makeTags("i", "Hello"));
        Assert.assertEquals("<cite>Yay</cite>", makeTags.makeTags("cite", "Yay"));
        Assert.assertEquals("<address>here</address>", makeTags.makeTags("address", "here"));
        Assert.assertEquals("<body>Heart</body>", makeTags.makeTags("body", "Heart"));
        Assert.assertEquals("<i>i</i>", makeTags.makeTags("i", "i"));
        Assert.assertEquals("<i></i>", makeTags.makeTags("i", ""));
    }

}
