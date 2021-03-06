package com.example.weeiamobilecalendar.controller;

import com.example.weeiamobilecalendar.service.CalendarEvent;
import com.example.weeiamobilecalendar.service.CalndarService;
import com.example.weeiamobilecalendar.service.WeeiaCalendarFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class CalendarController {

    @Autowired
    CalndarService calndarService;

    @GetMapping("/calendar")
    String getCalendar(@RequestParam("year") String year, @RequestParam ("month") String month, HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.setContentType("application/ics");
        httpServletResponse.setHeader("Content-Disposition", "attachment; filename="+ year + "-" + month + ".ics");
        return calndarService.getCalendarEventsOfMonth(Long.parseLong(year),Long.parseLong(month));
    }
}
