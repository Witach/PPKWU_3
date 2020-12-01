package com.example.weeiamobilecalendar.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class WeeiaCalendarFetcher {

     public String fetchWeeiaCalendar(long year, long month) {
         RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForEntity(makeUrlPath(year, month), String.class)
                .getBody();
    }

    String makeUrlPath(long year, long month) {
         var monthStr = "";
         if(month < 10) {
             monthStr = "0" + month;
         } else  {
             monthStr = "" + month;
         }
         return String.format("http://www.weeia.p.lodz.pl/pliki_strony_kontroler/kalendarz.php?rok=%s&miesiac=%s&lang=1", year, monthStr);
    }
}