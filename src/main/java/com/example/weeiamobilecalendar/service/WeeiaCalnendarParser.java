package com.example.weeiamobilecalendar.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;


@Service
public class WeeiaCalnendarParser {
    public List<CalendarEvent> getObjecCalendarFromHtmlCalendar(String calendarHtml) throws IOException {
        var targetStream = new ByteArrayInputStream(calendarHtml.getBytes());
        var listOfEvents = new LinkedList<CalendarEvent>();
        var tag = Jsoup.parse(targetStream, "UTF-8", "");
        var elements = tag.select("td.active");
        for (Element el: elements) {
            var foundElemet = el.selectFirst("p");
            if(foundElemet == null)
                foundElemet = el.selectFirst("div");
            var calendarEvent =CalendarEvent.builder()
                    .dayOfMonth(Long.parseLong(el.selectFirst("a.active").text()))
                    .description(foundElemet.text())
                    .build();
            listOfEvents.add(calendarEvent);
        }
        return listOfEvents;
    }
}
