package com.example.weeiamobilecalendar.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.springframework.stereotype.Service;


@Service
public class WeeiaCalnendarParser {
    public void getObjecCalendarFromHtmlCalendar(String calendarHtml) {
        var tag = Jsoup.parse(calendarHtml, "", Parser.xmlParser());
//        tag.
    }
}
