package com.example.weeiamobilecalendar.service;

import net.fortuna.ical4j.model.Date;
import net.fortuna.ical4j.model.component.VEvent;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class IcsFileParser {
    String encodeIcs(List<CalendarEvent> calendarEventList, long year, long month) {

        var res = calendarEventList.stream()
                .map(calendarEvent -> this.mapToVEvent(calendarEvent, year, month))
                .collect(Collectors.toList());

        net.fortuna.ical4j.model.Calendar cal = new net.fortuna.ical4j.model.Calendar();
        cal.getComponents().addAll(res);
        return cal.toString();

    }

    private VEvent mapToVEvent(CalendarEvent calendarEvent, long year, long month) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set( (int)year, (int)(month - 1), (int) +calendarEvent.getDayOfMonth());

        return new VEvent(new Date(calendar.getTime()), calendarEvent.getDescription());
    }
}
