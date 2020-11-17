package com.example.weeiamobilecalendar.controller;

import com.example.weeiamobilecalendar.service.WeeiaCalendarFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalendarController {

    @Autowired
    WeeiaCalendarFetcher weeiaCalendarFetcher;

    @GetMapping("/calendar")
    String getCalendar(@RequestParam("year") String year, @RequestParam ("month") String month) {
        return weeiaCalendarFetcher.fetchWeeiaCalendar(Long.parseLong(year),Long.parseLong(month));
    }
}
