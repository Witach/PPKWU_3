package com.example.weeiamobilecalendar.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;


@Service
public class WeeiaCalnendarParser {
    public List<CalendarEvent> getObjecCalendarFromHtmlCalendar(String calendarHtml) {
        var listOfEvents = new LinkedList<CalendarEvent>();
        var tag = Jsoup.parse(calendarHtml, "", Parser.xmlParser());
        var elements = tag.select("td.active");
        for (Element el: elements) {
            var calendarEvent =CalendarEvent.builder()
                    .dayOfMonth(Long.parseLong(el.selectFirst("a.active").text()))
                    .description(el.selectFirst("p").text())
                    .build();
            listOfEvents.add(calendarEvent);
        }
        return listOfEvents;
    }
}
