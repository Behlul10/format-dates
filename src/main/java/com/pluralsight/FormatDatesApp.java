package com.pluralsight;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class FormatDatesApp {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();

        // month/day/year --> 01/20/2028
        String monthToYearFmt = today.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println(monthToYearFmt);

        // year-day-month --> 2026-04-22
        String yearToMonthFmt = today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(yearToMonthFmt);

        // week-day, Month day, Year --> Wednesday, June 3, 2026
        String weekToYear = today.format(DateTimeFormatter.ofPattern("E, MMM dd, yyyy"));
        System.out.println(weekToYear);

        // week-day, Month Day, Year hour:second IN GMT Time zone
        ZonedDateTime nowInGmt = ZonedDateTime.now(ZoneId.of("GMT"));
        String weekToSecondGMT = nowInGmt.format(DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm"));
        System.out.println(weekToSecondGMT);

        //Hour:second on Day-Month-Year --> 5:02 on 22-Apr-2026
        String hourToYear = today.format(DateTimeFormatter.ofPattern("HH:mm 'on' dd-MM-yyyy"));
        System.out.println(hourToYear);
    }
}
