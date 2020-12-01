package com.example.weeiamobilecalendar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CalndarService {

    @Autowired
    WeeiaCalendarFetcher weeiaCalendarFetcher;
    @Autowired
    WeeiaCalnendarParser weeiaCalnendarParser;
    @Autowired
    IcsFileParser icsFileParser;

    public String getCalendarEventsOfMonth(long year, long month) throws IOException {
        var html = weeiaCalendarFetcher.fetchWeeiaCalendar(year, month);
        var events = weeiaCalnendarParser.getObjecCalendarFromHtmlCalendar(html);
        return icsFileParser.encodeIcs(events, year, month);
    }
}
