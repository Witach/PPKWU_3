package com.example.weeiamobilecalendar.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CalendarEvent {
    Long dayOfMonth;
    String description;
}
