package com.harcyah.kata.reddit.easy_2016_12_12;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;

import java.util.List;

public class LetterByLetter {

    public List<String> change(String in, String out) {
        Preconditions.checkArgument(in.length() == out.length());

        List<String> changes = Lists.newArrayList();
        changes.add(in);

        String prev = in;
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == out.charAt(i)) {
                continue;
            }

            StringBuilder builder = new StringBuilder();
            builder.append(prev);
            builder.setCharAt(i, out.charAt(i));

            String next = builder.toString();
            changes.add(next);
            prev = next;
        }

        return changes;
    }

}
