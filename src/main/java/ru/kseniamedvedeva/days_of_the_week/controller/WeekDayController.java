package ru.kseniamedvedeva.days_of_the_week.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.kseniamedvedeva.days_of_the_week.DaysOfWeek;

@RestController
public class WeekDayController {
    @GetMapping("/translate_days_of_week")
    public String translateDaysOfWeek(@RequestParam(value = "day") String englishDay) {
        String russianDay = "";
        try {
            DaysOfWeek.DayOfWeek day = DaysOfWeek.DayOfWeek.valueOf(englishDay);
            russianDay = day.getRussianName();
        } catch (IllegalArgumentException e) {
            return "Invalid day of week";
        }
        return "Russian name " + englishDay + " = " + russianDay;
    }
}
