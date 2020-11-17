package com.example.weeiamobilecalendar.controller;

import com.example.weeiamobilecalendar.service.WeeiaCalendarParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class CalendarController {

    @Autowired
    WeeiaCalendarParser weeiaCalendarParser;

    @GetMapping("/calendar")
    String getCalendar(@RequestParam("year") String year, @RequestParam ("month") String month) {
        return weeiaCalendarParser.fetchWeeiaCalendar(Long.parseLong(year),Long.parseLong(month));
    }
}
