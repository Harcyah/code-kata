package com.harcyah.kata.misc.nurse;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DurationFormatUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Slf4j
public class NurseHealOrganizer {

    private static final int GOAL_COST = 25000;
    private static final long GOAL_DURATION = 12 * 60;
    private static final long AVERAGE_TIME_BETWEEN_SICK_BOYS = 10;

    public static void main(String[] args) {

        // Find all heals for whom cost sum equals GOAL
        List<Schedule> schedules = new ArrayList<>();
        findAllCombinationsRecursive(new Schedule(), 0, GOAL_COST, schedules);

        // Keep only those matching time span
        List<Schedule> valid = new ArrayList<>();
        for (Schedule schedule : schedules) {
            long duration = schedule.getTotalDuration(AVERAGE_TIME_BETWEEN_SICK_BOYS);
            if (duration <= GOAL_DURATION) {
                valid.add(schedule);
            }
        }
        log.info("Found {} schedules", valid.size());

        // Print
        for (Schedule schedule : valid) {
            log.info("Schedule: {}", schedule);
            long durationMinutes = schedule.getTotalDuration(AVERAGE_TIME_BETWEEN_SICK_BOYS);
            long durationMilliseconds = TimeUnit.MINUTES.toMillis(durationMinutes);
            String duration = DurationFormatUtils.formatDuration(durationMilliseconds, "HHhmm");
            log.info("Duration : {}", duration);
            int cost = Math.round(schedule.getTotalCost() / 100.f);
            log.info("Cost     : {} euros", cost);
        }
    }

    private static void findAllCombinationsRecursive(Schedule solution, int start, int remainingTarget, List<Schedule> schedules) {
        for (int i = start; i < Heal.values().length; i++) {
            int remaining = remainingTarget - (Heal.values())[i].getCost();
            Schedule schedule = (Schedule) solution.clone();
            schedule.addHeal((Heal.values())[i]);
            if (remaining < 0) {
                break;
            }
            if (remaining == 0) {
                schedules.add(schedule);
                break;
            } else {
                findAllCombinationsRecursive(schedule, i, remaining, schedules);
            }
        }
    }

}
