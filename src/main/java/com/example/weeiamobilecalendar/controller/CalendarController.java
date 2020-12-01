package com.example.weeiamobilecalendar.controller;

import com.example.weeiamobilecalendar.service.CalendarEvent;
import com.example.weeiamobilecalendar.service.CalndarService;
import com.example.weeiamobilecalendar.service.WeeiaCalendarFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CalendarController {

    @Autowired
    CalndarService calndarService;

    @GetMapping("/calendar")
    String getCalendar(@RequestParam("year") String year, @RequestParam ("month") String month) {
        return calndarService.getCalendarEventsOfMonth(Long.parseLong(year),Long.parseLong(month));
    }
}
