package com.harcyah.kata.projecteuler;

import org.assertj.core.api.Assertions;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.junit.Test;

public class Problem_019Test {

    @Test
    public void testCountDays() throws Exception {
        Problem_019 problem = new Problem_019();
        DateTime start = new DateTime(1901, 1, 1, 0, 0);
        DateTime end = new DateTime(2000, 12, 31, 23, 59);
        int sundaysInTwentiethCentury = problem.countDays(DateTimeConstants.SUNDAY, start, end);
        Assertions.assertThat(sundaysInTwentiethCentury).isEqualTo(171);
    }

}
